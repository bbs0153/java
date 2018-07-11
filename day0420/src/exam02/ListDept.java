package exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//Jtable 모든 부서의 목록을 출력하는 프로그램 작성
// select * from dept
public class ListDept extends JFrame {

	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	JTable table01;

	public ListDept() {

		colNames = new Vector<String>();
		rowData = new Vector<Vector<String>>();

		colNames.add("부서번호");
		colNames.add("부서명");
		colNames.add("전화번호");
		colNames.add("부서위치");
		colNames.add("인원수");

		table01 = new JTable(rowData, colNames);

		// 데이터베이스에 접속하여 모든 부서의 목록을 읽어 와서
		// 벡터 rowData에 담는 메소드를 호출

		getDept();

		JScrollPane jsp = new JScrollPane(table01);

		add(jsp);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// 모든 부서의 목록을 검색하여 백터인 rowData에 담는다.
	private void getDept() {

		String sql = "select * from dept";

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.106:1521:XE", "madang",
					"madang");

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				Vector<String> v = new Vector<String>();

				v.add(rs.getString(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));
				v.add(rs.getString(5));

				rowData.add(v);

				table01.updateUI();

			}
			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {
		new ListDept();
	}

}
