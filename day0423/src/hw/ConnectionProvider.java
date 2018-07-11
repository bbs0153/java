package hw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionProvider {

	public static void close(ResultSet rs, Statement stmt, Connection cnn) {

		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (cnn != null) {
				cnn.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static Connection getConnection() {

		Connection cnn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			cnn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.106:1521:XE", "madang", "madang");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return cnn;

	}

}
