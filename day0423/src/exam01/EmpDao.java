package exam01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

//테이블에 레코드를 추가 	: Create(C)
//테이블에 레코드를 수정	: Read(R)
//테이블에 레코드를 삭제	: Update(C)
//테이블에 레코드를 검색	: Delete(D)
// CRUD

public class EmpDao {

	// 모든 사원의 모록을 읽어오는 메소드
	// select * from emp
	public ArrayList<EmpVo> selectAll() {

		ArrayList<EmpVo> list = new ArrayList<EmpVo>();

		String sql = "select * from emp";

		try {

			Connection cnn = ConnectionProvider.getConnection();
			Statement stmt = cnn.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				// 헌재 커서가 바라보고 있는 레코드의 정보를
				// EmpVo객체를 만들어 정보를 담는다.
				EmpVo ev = new EmpVo();

				ev.setEno(rs.getInt(1));
				ev.setEname(rs.getString(2));
				ev.setDno(rs.getInt(3));
				ev.setEsal(rs.getInt(4));
				ev.setElevel(rs.getString(5));
				ev.setEjumin(rs.getString(6));
				ev.setEaddr(rs.getString(7));
				ev.setEhiredate(rs.getString(8));
				
				//ORM(Object Relation Mapping) ==> hibernate,mybatis
				//전자정부 표준

				// 사원의 정보를 list에 담는다.
				list.add(ev);
			}

			ConnectionProvider.close(rs, stmt, cnn);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		return list;

	}

	public int insertEmp(EmpVo e) {

		String sql = "insert into emp values(?,?,?,?,?,?,?,?)";

		int re = -1;

		try {

			Connection cnn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = cnn.prepareStatement(sql);

			pstmt.setInt(1, e.getEno());
			pstmt.setString(2, e.getEname());
			pstmt.setInt(3, e.getDno());
			pstmt.setInt(4, e.getEsal());
			pstmt.setString(5, e.getElevel());
			pstmt.setString(6, e.getEjumin());
			pstmt.setString(7, e.getEaddr());
			pstmt.setString(8, e.getEhiredate());

			re = pstmt.executeUpdate();

			ConnectionProvider.close(null, pstmt, cnn);

		} catch (Exception ee) {

			System.out.println(ee.getMessage());
		}

		return re;

	}

}
