package home;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class BookList extends JFrame {

	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	JTable table;
	JFrame f;

	public BookList() {

		f = this;
		colNames = new Vector<String>();
		rowData = new Vector<Vector<String>>();

		colNames.add("도서번호");
		colNames.add("도서이름");
		colNames.add("출판사");
		colNames.add("가격");

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		JLabel jlb_number = new JLabel("도서번호");
		JLabel jlb_name = new JLabel("도서이름");
		JLabel jlb_publisher = new JLabel("출판사");
		JLabel jlb_price = new JLabel("가격");
		JTextField jtf_number = new JTextField(10);
		JTextField jtf_name = new JTextField(10);
		JTextField jtf_publisher = new JTextField(10);
		JTextField jtf_price = new JTextField(10);
		JButton btn1 = new JButton("추가");
		JButton btn2 = new JButton("수정");
		JButton btn3 = new JButton("삭제");

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// 텍스트필드의 정보를 가져와 sql에 담는다
				String sql = "insert into booklist values(" + jtf_number.getText() + ",'" + jtf_name.getText() + "','"
						+ jtf_publisher.getText() + "'," + jtf_price.getText() + ")";

				try {
					// jdbc 드라이버를 메모리로 로드한다.
					Class.forName("oracle.jdbc.driver.OracleDriver");
					// db서버에 연결하여 Connection에 담는다.
					Connection cnn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.106:1521:XE", "madang",
							"madang");
					// 명령어를 실핼시키기 위한 Statement 객체를 생성한다.
					Statement stmt = cnn.createStatement();
					// stmt를 통해서 명령어를 수행한다.
					stmt.executeUpdate(sql);

					jtf_number.setText("");
					jtf_name.setText("");
					jtf_publisher.setText("");
					jtf_price.setText("");

					// 실행한 결과를 메소드를 통해서 불러온다.
					getList();
					table.updateUI();

					stmt.close();
					cnn.close();

				} catch (Exception ee) {

					System.out.println(ee.getMessage());

				}

			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String sql = "update booklist set 도서이름='" + jtf_name.getText() + "', 출판사='" + jtf_publisher.getText()
						+ "', 가격=" + jtf_price.getText() + " where 도서번호=" + jtf_number.getText();

				rowData.clear();

				try {

					Class.forName("oracle.jdbc.driver.OracleDriver");

					Connection cnn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.106:1521:XE", "madang",
							"madang");
					Statement stmt = cnn.createStatement();

					int re = stmt.executeUpdate(sql);

					if (re > 0) {

						JOptionPane.showMessageDialog(f, "성공적으로 수정되었습니다.");

						jtf_number.setText("");
						jtf_name.setText("");
						jtf_publisher.setText("");
						jtf_price.setText("");

					} else {

						JOptionPane.showMessageDialog(f, "수정에 실패했습니다.");

					}

					getList();

					stmt.close();
					cnn.close();

				} catch (Exception ee) {

					System.out.println(ee.getMessage());
				}

			}

		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int no;

				int row = table.getSelectedRow();
				Vector<String> v = rowData.get(row);
				no = Integer.parseInt(v.get(0));

				String sql = "delete booklist where  도서번호=" + no;

				rowData.clear();

				try {

					Class.forName("oracle.jdbc.driver.OracleDriver");

					Connection cnn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.106:1521:XE", "madang",
							"madang");
					Statement stmt = cnn.createStatement();

					int re = stmt.executeUpdate(sql);
					// executeUpate는
					// sql명령어가 데이터베이스에 변동이 있는 명령어
					// (insert, update, delete)일때 사용되면
					// 성공적으로 명령을 수행한 레코드의 수를 반환한다.

					if (re > 0) {

						JOptionPane.showMessageDialog(f, "해당도서를 삭제하였습니다");

						jtf_number.setText("");
						jtf_name.setText("");
						jtf_publisher.setText("");
						jtf_price.setText("");

					} else {
						JOptionPane.showMessageDialog(f, "해당도서를 삭제 실패 하였습니다");
					}

					getList();

					stmt.close();
					cnn.close();

				} catch (Exception ee) {

					System.out.println(ee.getMessage());
				}

			}
		});

		table = new JTable(rowData, colNames);

		// 테이블에 마우스를 클릭하면 선택한 도서의 정보를
		// 각각의 텍스트필드에 출력

		table.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {

				// 테이블에서 선택한 행번호를 알아온다.
				int row = table.getSelectedRow();
				// 전체도서정보가 담긴 벡터(rowData)에서
				// 선택한 행에 해당하는 도서를 뽑아온다.
				Vector<String> v = rowData.get(row);
				// 벡터에 담긴 정보를 하나씩 텍스트필드에 출력한다.
				jtf_number.setText(v.get(0));
				jtf_name.setText(v.get(1));
				jtf_publisher.setText(v.get(2));
				jtf_price.setText(v.get(3));

			}
		});

		getList();

		JScrollPane jsp = new JScrollPane(table);

		p1.setLayout(new GridLayout(4, 2));
		p1.add(jlb_number);
		p1.add(jtf_number);
		p1.add(jlb_name);
		p1.add(jtf_name);
		p1.add(jlb_publisher);
		p1.add(jtf_publisher);
		p1.add(jlb_price);
		p1.add(jtf_price);

		p2.setLayout(new FlowLayout());
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		p2.add(jsp);

		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void getList() {

		String sql = "select * from booklist";

		rowData.clear();

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection cnn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.106:1521:XE", "madang",
					"madang");
			Statement stmt = cnn.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				Vector<String> v = new Vector<String>();

				v.add(rs.getInt(1) + "");
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getInt(4) + "");

				rowData.add(v);

			}

			table.updateUI();

			rs.close();
			stmt.close();
			cnn.close();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {

		new BookList();
	}

}
