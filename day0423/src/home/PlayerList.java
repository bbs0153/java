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
import java.sql.PreparedStatement;
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

public class PlayerList extends JFrame {

	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	JTable table;

	JFrame f;

	public PlayerList() {

		f = this;

		colNames = new Vector<String>();
		rowData = new Vector<Vector<String>>();

		colNames.add("고객번호");
		colNames.add("이름");
		colNames.add("주민번호");
		colNames.add("주소");
		colNames.add("핸드폰번호");

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JLabel jlb_number = new JLabel("고객번호");
		JLabel jlb_name = new JLabel("이름");
		JLabel jlb_jumin = new JLabel("주민번호");
		JLabel jlb_addr = new JLabel("주소");
		JLabel jlb_phone = new JLabel("핸드폰번호");
		JTextField jtf_number = new JTextField(10);
		JTextField jtf_name = new JTextField(10);
		JTextField jtf_jumin = new JTextField(10);
		JTextField jtf_addr = new JTextField(10);
		JTextField jtf_phone = new JTextField(10);
		JButton btn1 = new JButton("추가");
		JButton btn2 = new JButton("수정");
		JButton btn3 = new JButton("삭제");

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String sql = "insert into playerlist values(?,?,?,?,?)";

				rowData.clear();

				int cnum = Integer.parseInt(jtf_number.getText());
				String cname = jtf_name.getText();
				String cjumin = jtf_jumin.getText();
				String caddr = jtf_addr.getText();
				String cphone = jtf_phone.getText();

				try {

					Class.forName("oracle.jdbc.driver.OracleDriver");

					Connection cnn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.106:1521:XE", "madang",
							"madang");

					PreparedStatement pstmt = cnn.prepareStatement(sql);

					pstmt.setInt(1, cnum);
					pstmt.setString(2, cname);
					pstmt.setString(3, cjumin);
					pstmt.setString(4, caddr);
					pstmt.setString(5, cphone);

					pstmt.executeUpdate();

					jtf_number.setText("");
					jtf_name.setText("");
					jtf_jumin.setText("");
					jtf_addr.setText("");
					jtf_phone.setText("");

					getList();

					pstmt.close();
					cnn.close();

				} catch (Exception ee) {

					System.out.println(ee.getMessage());

				}

			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String sql = "update playerlist set 이름='" + jtf_name.getText() + "', 주민번호='" + jtf_jumin.getText()
						+ "', 주소='" + jtf_addr.getText() + "', 핸드폰번호='" + jtf_phone.getText() + "' where 고객번호="
						+ jtf_number.getText();

				try {

					Class.forName("oracle.jdbc.driver.OracleDriver");

					Connection cnn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.106:1521:XE", "madang",
							"madang");
					Statement stmt = cnn.createStatement();

					int re = stmt.executeUpdate(sql);

					if (re > 0) {

						JOptionPane.showMessageDialog(f, "수정에 성공했습니다.");

						jtf_number.setText("");
						jtf_name.setText("");
						jtf_jumin.setText("");
						jtf_addr.setText("");
						jtf_phone.setText("");

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

				int row = table.getSelectedRow();
				Vector<String> v = rowData.get(row);
				int no = Integer.parseInt(v.get(0));

				String sql = "delete playerlist where 고객번호=?";

				rowData.clear();

				try {

					Class.forName("oracle.jdbc.driver.OracleDriver");

					Connection cnn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.106:1521:XE", "madang",
							"madang");
					PreparedStatement pstmt = cnn.prepareStatement(sql);

					pstmt.setInt(1, no);

					int re = pstmt.executeUpdate();

					if (re > 0) {

						JOptionPane.showMessageDialog(f, "성공적으로 삭제되었습니다.");

						jtf_number.setText("");
						jtf_name.setText("");
						jtf_jumin.setText("");
						jtf_addr.setText("");
						jtf_phone.setText("");

					} else {
						JOptionPane.showMessageDialog(f, "삭제에 실패했습니다.");
					}

					getList();

					pstmt.close();
					cnn.close();

				} catch (Exception ee) {

					System.out.println(ee.getMessage());
				}

			}
		});

		table = new JTable(rowData, colNames);
		// 데이터베이스에 접속하여
		// 다음의 sql명령어를 실행하여 실행한 결과를
		// 테이블을 데이터를 표현하기 위한 백터(rowData)에 담는다.

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

				int row = table.getSelectedRow();
				Vector<String> v = rowData.get(row);

				jtf_number.setText(v.get(0));
				jtf_name.setText(v.get(1));
				jtf_jumin.setText(v.get(2));
				jtf_addr.setText(v.get(3));
				jtf_phone.setText(v.get(4));

			}
		});

		getList();

		JScrollPane jsp = new JScrollPane(table);

		p1.setLayout(new GridLayout(5, 2));
		p1.add(jlb_number);
		p1.add(jtf_number);
		p1.add(jlb_name);
		p1.add(jtf_name);
		p1.add(jlb_jumin);
		p1.add(jtf_jumin);
		p1.add(jlb_addr);
		p1.add(jtf_addr);
		p1.add(jlb_phone);
		p1.add(jtf_phone);

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

		String sql = "select * from  playerlist";

		rowData.clear();

		try {
			// jdbc 드라이버를 메모리에 로드한다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// db서버에 연결
			Connection cnn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.106:1521:XE", "madang",
					"madang");
			// sql명령어를 실행하기 위한 Statement객체 생성
			Statement stmt = cnn.createStatement();

			// Statement 객체를 통해 sql명령어를 수행
			// executeUpdate : 레코드를 추가,수정,삭제
			// executeQuery : 레코드를 검색

			// 검색한 결과를 ResulteSet으로 변환
			// ResulteSet에는 검색한 레코드들 중에 특정 레코드를 가리키는 커서의 개념이있다.
			// 처음 실행했을 떄는 커서가 레코드들의 헤더를 바라보고 있다.
			ResultSet rs = stmt.executeQuery(sql);

			// 모든 레코드들을 하나씩 일처릴르 위해서는
			// 커서를 다음레코드를 옮겨가면서 작업을 수행해야한다.
			// 이때 커서를 다음레코드를 옮겨주는 메소드가 next()메소드 이다.
			// 이 next()메소드는 커서를 다음행으로 성공적으로 옮기면 true를 반환하여
			// 더이상 다음레코드가 없어 옮기지 못하면 false를 반환한다.
			while (rs.next()) {
				// 현재 커서가 바라보고 있는 레코드의 정보를 담기 위한 Vector 생성
				Vector<String> v = new Vector<String>();

				v.add(rs.getInt(1) + ""); // 현재 커서가 바라보고 있는 레코드의 첫번쨰 칼럼(고객번호)을 읽어와서 벡터에 담는다.
				v.add(rs.getString(2)); // 현재 커서가 바라보고 있는 레코드의 두번쨰 칼럼(고객이름)을 읽어와서 백터에 담는다.
				v.add(rs.getString(3));
				v.add(rs.getString(4));
				v.add(rs.getString(5));

				// 현재 커서가 바라보고 있는 정보를 모두 담고 있는 백터(v)를 전체자료를 담는 벡터(rowData)에 담는다.
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

		new PlayerList();
	}

}
