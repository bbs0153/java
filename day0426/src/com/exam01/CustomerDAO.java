package com.exam01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CustomerDAO {

	// 주소를 매개변수로 전달받아 그 주소에 거주하는 고객의 목록을 반환하는 메소드를 정의하시오
	// 대한민국에 거주하는 모든 고객의 정보를 출력
	// 대전에 거주하는 모든 고객의 정보를 출력
	public ArrayList<CustomerVO> listCustomerForAddr(String address) {

		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>();

		String sql = "select * from customer where address like '%'||?||'%'";

		try {

			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, address);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				CustomerVO cv = new CustomerVO();

				cv.setCustid(rs.getInt(1));
				cv.setName(rs.getString(2));
				cv.setAddress(rs.getString(3));
				cv.setPhone(rs.getString(4));

				list.add(cv);
			}
			ConnectionProvider.close(rs, pstmt, conn);

			// ORM(Object Relation Mapping)
			// mybatis * , hibernate
			// 전자정부 표준프레임워크(spring & mybatis)
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	// 고객명을 매개변수로 전달받아 해당 고객의 정보를 반환
	public CustomerVO getCustomer(String name) {

		CustomerVO cv = null;
		String sql = "select * from customer where name = ?";

		try {

			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {

				cv = new CustomerVO();

				cv.setCustid(rs.getInt(1));
				cv.setName(rs.getString(2));
				cv.setAddress(rs.getString(3));
				cv.setPhone(rs.getString(4));
			}

			ConnectionProvider.close(rs, pstmt, conn);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return cv;

	}

}
