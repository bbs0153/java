package exam01;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class InsertStudent {

	public static void main(String[] args) {

		String sql = "insert into student values('����ȣ',100,100,100)";

		try {
			// 1.jdbc ����̹��� �޸𸮷� �ε��Ѵ�.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. database Server�� �����Ѵ�.
			String url = "jdbc:oracle:thin:@203.236.209.106:1521:XE";
			String user = "madang";
			String pwd = "madang";

			// DBServer�� �����Ͽ� ���������� Connection�� ��´�.
			Connection conn = DriverManager.getConnection(url, user, pwd);

			// 3. �����ͺ��̽� ��ɾ �����ϱ� ���� ��ü(Statement) �����Ѵ�.
			// Connection ��ü�� ���ؼ�
			java.sql.Statement stmt = conn.createStatement();

			// 4. stmt�� ���ؼ� �����ͺ��̽� ����� �����Ѵ�.
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();

			System.out.println("�߰���");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
