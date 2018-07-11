package hw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpDAO {

	public ArrayList<EmpVO> selectEmp(String dname) {

		ArrayList<EmpVO> list = new ArrayList<EmpVO>();

		String sql = "SELECT * FROM emp e,dept d WHERE dname = ? AND e.dno = d.dno";

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
				ev.setHiredate(rs.getDate(5));
				ev.setJumin(rs.getString(6));
				ev.setDno(rs.getInt(7));
				ev.setPosition(rs.getString(8));
				ev.setAddr(rs.getString(9));
				ev.setMgr(rs.getInt(10));
				ev.setEmail(rs.getString(11));

				list.add(ev);

			}
			ConnectionProvider.close(rs, conn, pstmt);

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

		return list;

	}

}
