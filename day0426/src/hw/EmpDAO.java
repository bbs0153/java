package hw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmpDAO {

	public ArrayList<EmpVO> getDeptList(String dname) {

		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		String sql = "SELECT eno,ename,sal,comm,hiredate,jumin,d.dno,position,addr "
				+ "FROM dept d, emp e "
				+ "WHERE dname=? "
				+ "AND d.dno=e.dno "
				+ "ORDER BY sal desc, ename desc";

		try {

			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dname);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				EmpVO ev = new EmpVO();

				ev.setEno(rs.getInt(1));
				ev.setEname(rs.getString(2));
				ev.setSal(rs.getInt(3));
				ev.setComm(rs.getInt(4));
				ev.setHiredate(rs.getString(5));
				ev.setJumin(rs.getString(6));
				ev.setDno(rs.getInt(7));
				ev.setPosition(rs.getString(8));
				ev.setAddr(rs.getString(9));

				list.add(ev);
			}

			ConnectionProvider.close(rs, pstmt, conn);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;

	}

}
