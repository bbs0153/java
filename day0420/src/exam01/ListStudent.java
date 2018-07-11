package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//모든 학생의 정보를 검색하여 출력하는 프로그램
//이 프로그램에서 하고싶은 sql명령어는 "select * from student"
public class ListStudent {

	public static void main(String[] args) {

		String sql = "select name,kor,eng,math from student";

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.106:1521:XE", "madang",
					"madang");

			Statement stmt = conn.createStatement();

			// sql명령어의 종류에 따라 사용하는 메소드가 틀리다.
			// sql명령어가 자료를 추가,수정,삭제 ==> executeUpdate()
			// sql명령어가 검색 일떄는 ==> executeQuery()
			// 이 executeQuery 검색한 결과 ResultSet으로 반환한다.
			ResultSet rs = stmt.executeQuery(sql);

			// 지금은 질의문이 select일 때
			// 검색한 결과만큼 반복수행
			// rs.next()메소드를 통해 커서를 다음 레코드로 옮긴다.
			// 다음레코드가 있으면 true를 반환하고 더이상 레코드가 없으면 false를 반환한다.

			while (rs.next()) {

				String name = rs.getString(1);
				int kor = rs.getInt(2);
				int eng = rs.getInt(3);
				int math = rs.getInt(4);

				System.out.println(name);
				System.out.println(kor);
				System.out.println(eng);
				System.out.println(math);
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
