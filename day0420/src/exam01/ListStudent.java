package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//��� �л��� ������ �˻��Ͽ� ����ϴ� ���α׷�
//�� ���α׷����� �ϰ���� sql��ɾ�� "select * from student"
public class ListStudent {

	public static void main(String[] args) {

		String sql = "select name,kor,eng,math from student";

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.106:1521:XE", "madang",
					"madang");

			Statement stmt = conn.createStatement();

			// sql��ɾ��� ������ ���� ����ϴ� �޼ҵ尡 Ʋ����.
			// sql��ɾ �ڷḦ �߰�,����,���� ==> executeUpdate()
			// sql��ɾ �˻� �ϋ��� ==> executeQuery()
			// �� executeQuery �˻��� ��� ResultSet���� ��ȯ�Ѵ�.
			ResultSet rs = stmt.executeQuery(sql);

			// ������ ���ǹ��� select�� ��
			// �˻��� �����ŭ �ݺ�����
			// rs.next()�޼ҵ带 ���� Ŀ���� ���� ���ڵ�� �ű��.
			// �������ڵ尡 ������ true�� ��ȯ�ϰ� ���̻� ���ڵ尡 ������ false�� ��ȯ�Ѵ�.

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
