package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ListBook {

	public ListBook() {

		String sql = "SELECT * FROM book";

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "madang", "madang");

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("도서번호\t도서이름\t출판사\t가격");
			while (rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.println(rs.getInt(4));
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {

		new ListBook();

	}

}
