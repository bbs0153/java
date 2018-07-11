package hw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ClientDAO {

	// 회원의 정보를 수정라기 위한 메소드 정의
	public int updateClient(ClientVO cv) {

		String sql = "update client set cname=?,cjumin=?,addr=?,tel=? where cno=?";
		int re = -1;

		try {

			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, cv.getCname());
			pstmt.setString(2, cv.getCjumin());
			pstmt.setString(3, cv.getCaddr());
			pstmt.setString(4, cv.getCphone());
			pstmt.setInt(5, cv.getCno());

			re = pstmt.executeUpdate();

			ConnectionProvider.close(null, pstmt, conn);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		return re;

	}

	// 회원의 정보를 삭제하기 위한 메소드 정의
	public int deletcClient(int cno) {

		String sql = "delete client where cno=?";

		int re = -1;

		try {

			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, cno);

			re = pstmt.executeUpdate();

			ConnectionProvider.close(null, pstmt, conn);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return re;

	}

	public ArrayList<ClientVO> selectAll() {
		ArrayList<ClientVO> list = new ArrayList<ClientVO>();

		String sql = "select * from client";

		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				ClientVO e = new ClientVO();
				e.setCno(rs.getInt(1));
				e.setCname(rs.getString(2));
				e.setCjumin(rs.getString(3));
				e.setCaddr(rs.getString(4));
				e.setCphone(rs.getString(5));

				list.add(e);
			}
			ConnectionProvider.close(rs, stmt, conn);

		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}

		return list;
	}

	public int insertClient(ClientVO e) {
		String sql = "insert into client values(?,?,?,?,?)";

		int re = -1;

		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, e.getCno());
			pstmt.setString(2, e.getCname());
			pstmt.setString(3, e.getCjumin());
			pstmt.setString(4, e.getCaddr());
			pstmt.setString(5, e.getCphone());

			re = pstmt.executeUpdate();

			ConnectionProvider.close(null, pstmt, conn);

		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}

		return re;

	}
}