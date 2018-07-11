package exam01;

import java.nio.channels.ConnectionPendingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpDAO {

	public ArrayList<EmpVO> listAll() {

		ArrayList<EmpVO> list = new ArrayList<EmpVO>();

		try {

			String sql = "select eno,ename,sal,comm,to_char(hiredate,'yyyy/mm/dd'),jumin,dno,position,addr,mgr,email from emp";

			Connection conn = ConnectProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

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
				ev.setMgr(rs.getInt(10));
				ev.setEmail(rs.getString(11));

				list.add(ev);

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return list;
	}

	public int inserEmp(EmpVO ev) {

		int re = -1;

		String sql = "insert into emp values(?,?,?,?,to_date(?,'yyyy/mm/dd'),?,?,?,?,?,?)";

		try {

			Connection conn = ConnectProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, ev.getEno());
			pstmt.setString(2, ev.getEname());
			pstmt.setInt(3, ev.getSal());
			pstmt.setInt(4, ev.getComm());
			pstmt.setString(5, ev.getHiredate());
			pstmt.setString(6, ev.getJumin());
			pstmt.setInt(7, ev.getDno());
			pstmt.setString(8, ev.getPosition());
			pstmt.setString(9, ev.getAddr());
			pstmt.setInt(10, ev.getMgr());
			pstmt.setString(11, ev.getEmail());

			re = pstmt.executeUpdate();

			ConnectProvider.close(null, pstmt, conn);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		return re;

	}

}
