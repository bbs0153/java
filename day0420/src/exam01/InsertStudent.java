package exam01;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class InsertStudent {

	public static void main(String[] args) {

		String sql = "insert into student values('이태호',100,100,100)";

		try {
			// 1.jdbc 드라이버를 메모리로 로드한다.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. database Server에 연결한다.
			String url = "jdbc:oracle:thin:@203.236.209.106:1521:XE";
			String user = "madang";
			String pwd = "madang";

			// DBServer에 연결하여 연결정보는 Connection에 담는다.
			Connection conn = DriverManager.getConnection(url, user, pwd);

			// 3. 데이터베이스 명령어를 실행하기 위한 객체(Statement) 생성한다.
			// Connection 객체를 통해서
			java.sql.Statement stmt = conn.createStatement();

			// 4. stmt를 통해서 데이터베이스 명령을 수행한다.
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();

			System.out.println("추가됨");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
