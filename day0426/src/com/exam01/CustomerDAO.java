package com.exam01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CustomerDAO {

	// �ּҸ� �Ű������� ���޹޾� �� �ּҿ� �����ϴ� ���� ����� ��ȯ�ϴ� �޼ҵ带 �����Ͻÿ�
	// ���ѹα��� �����ϴ� ��� ���� ������ ���
	// ������ �����ϴ� ��� ���� ������ ���
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
			// �������� ǥ�������ӿ�ũ(spring & mybatis)
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	// ������ �Ű������� ���޹޾� �ش� ���� ������ ��ȯ
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
