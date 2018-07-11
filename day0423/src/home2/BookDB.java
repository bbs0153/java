package home2;

import java.awt.BorderLayout;
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
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

//각 코드에 설명문을 자신만의 언어로 적어 봅니다.
public class BookDB extends JFrame {

	JTextField jtf_num = new JTextField(10);
	JTextField jtf_name = new JTextField(10);
	JTextField jtf_pub = new JTextField(10);
	JTextField jtf_price = new JTextField(10);

	Vector<String> colNames;
	Vector<Vector> rowData;
	JTable table;
	JFrame f;

	String url = "jdbc:oracle:thin:@203.236.209.91:1521:XE";

	public BookDB() {

		f = this;
		colNames = new Vector<String>();
		rowData = new Vector<Vector>();

		colNames.add("도서번호");
		colNames.add("도서이름");
		colNames.add("출판사");
		colNames.add("가격");

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
				// TODO Auto-generated method stub

				// 테이블에서 선택한 행번호를 알아온다.
				int row = table.getSelectedRow();

				// 전체도서정보가 담긴 벡터(rowData)에서
				// 선택한 행에 해당하는 도서를 뽑아온다.
				Vector<String> v = rowData.get(row);

				// 벡터에 담긴 정보를 하나씩 텍스트필드에 출력한다.
				jtf_num.setText(v.get(0));
				jtf_name.setText(v.get(1));
				jtf_pub.setText(v.get(2));
				jtf_price.setText(v.get(3));
			}
		});

		JScrollPane jsp = new JScrollPane(table);

		listClient();

		JButton jbt = new JButton("저장");
		JButton jbtUpdate = new JButton("수정");
		JButton jbtDelete = new JButton("삭제");

		JPanel p = new JPanel();

		p.add(new JLabel("도서번호"));
		p.add(jtf_num);
		p.add(new JLabel("도서이름"));
		p.add(jtf_name);
		p.add(new JLabel("출판사"));
		p.add(jtf_pub);
		p.add(new JLabel("가격"));
		p.add(jtf_price);
		p.add(jbt);
		p.add(jbtUpdate);
		p.add(jbtDelete);

		// 삭제에 대한 처리
		jbtDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				int no;
				// 사용자가 선택한 도서의 책번호를 no에 저장한다.

				// 1) 테이블에서 선택한 행번호를 알아온다.
				int row = table.getSelectedRow();

				// 2) 그 행번호에 해당하는 데이터를 벡터에서 알아온다.
				Vector<String> v = rowData.get(row);

				// 3) 그 벡터의 첫번째 데이터가 바로 책번호
				no = Integer.parseInt(v.get(0));

				// 사용자가 선택한 책번호에 해당하는 도서를 삭제하기위한 sql명령어
				String sql = "delete book where bnum=" + no;

				try {

					// 1. jdbc드라이버를 메모리로 로드한다.
					Class.forName("oracle.jdbc.driver.OracleDriver");

					// 2. database Server에 연결한다.
					Connection conn = DriverManager.getConnection(url, "madang", "madang");

					// 3. sql명령어를 수행하기 위한 Statement 객체를 생성한다.
					Statement stmt = conn.createStatement();

					// 4. Statement 객체를 통해 sql명령어를 실행한다.
					// executeUpdate : 레코드를 추가,수정,삭제할 때
					// executeQuery : 레코드를 검색

					int re = stmt.executeUpdate(sql);
					// executeUpate는
					// sql명령어가 데이터베이스에 변동이 있는 명령어
					// (insert, update, delete)일때 사용하며
					// 성공적으로 명령을 수행한 레코드의 수를 반환한다.

					if (re > 0) {
						JOptionPane.showMessageDialog(f, "해당 도서를 삭제하였습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "도서 삭제에 실패하였습니다.");
					}

					// 사용했던 자원을 모두 닫아 준다.
					stmt.close();
					conn.close();

				} catch (Exception ex) {
					// TODO: handle exception
					System.out.println(ex.getMessage());
				}

				listClient();

			}
		});

		// 수정에 대한 처리
		jbtUpdate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				// 도서번호가 5번인 도서의 도서명은 '재미있는 피겨'
				// 가격은 8500원, 출판사는 비트스포츠로 수정하기 위한 sql 명령어

				int bnum = Integer.parseInt(jtf_num.getText());
				String bname = jtf_name.getText();
				int bprice = Integer.parseInt(jtf_price.getText());
				String bpub = jtf_pub.getText();

				String sql = "update book set bname='" + bname + "',bprice=" + bprice + ",bpub='" + bpub
						+ "' where bnum=" + bnum;

				// 데이터베이스에 연결하여 위의 sql명령어를 실행하도록 한다.

				try {
					// 1. jdbc 드라이버를 메모리로 로드한다.
					Class.forName("oracle.jdbc.driver.OracleDriver");

					// 2. Database Server에 연결한다.
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.91:1521:XE", "madang",
							"madang");

					// 3. Sql 명령 실행 담당자인 Statement 객체를 생성한다.
					Statement stmt = conn.createStatement();

					// 4. Statement 객체를 통해서 sql명령어를 실행한다.
					// executeUpdate : sql명령어가 데이터베이스에 변동이 있는 명령어(insert, update, delete)을 수행하고
					// 성공적으로 sql명령어를 수행한 레코드의 수를 반환
					// executeQuery : sql명렁어가 검색(select)일때 사용하며
					// 검색한 결과를 ResultSet으로 반환

					int re = stmt.executeUpdate(sql);
					if (re > 0) {
						JOptionPane.showConfirmDialog(f, "도서를 수정하였습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "수정에 실패하였습니다.");
					}

					stmt.close();
					conn.close();

					listClient();

				} catch (Exception ex) {
					// TODO: handle exception
					System.out.println(ex.getMessage());
				}

			}
		});

		jbt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String sql = "insert into book values(" + jtf_num.getText() + ",'" + jtf_name.getText() + "','"
						+ jtf_pub.getText() + "'," + jtf_price.getText() + ")";
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");

					Connection conn = DriverManager.getConnection(url, "madang", "madang");
					Statement stmt = conn.createStatement();

					stmt.executeUpdate(sql);

				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
				listClient();
			}
		});

		add(p, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		setSize(900, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 모든 도서목록을 검색하여 rowData에 담는다.
	private void listClient() {

		String sql = "select * from book";
		rowData.clear();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection(url, "madang", "madang");
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);

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
			stat.close();
			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {

		new BookDB();
	}

}
