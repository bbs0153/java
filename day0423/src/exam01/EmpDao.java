package exam01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

//���̺� ���ڵ带 �߰� 	: Create(C)
//���̺� ���ڵ带 ����	: Read(R)
//���̺� ���ڵ带 ����	: Update(C)
//���̺� ���ڵ带 �˻�	: Delete(D)
// CRUD

public class EmpDao {

	// ��� ����� ����� �о���� �޼ҵ�
	// select * from emp
	public ArrayList<EmpVo> selectAll() {

		ArrayList<EmpVo> list = new ArrayList<EmpVo>();

		String sql = "select * from emp";

		try {

			Connection cnn = ConnectionProvider.getConnection();
			Statement stmt = cnn.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				// ���� Ŀ���� �ٶ󺸰� �ִ� ���ڵ��� ������
				// EmpVo��ü�� ����� ������ ��´�.
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
				//�������� ǥ��

				// ����� ������ list�� ��´�.
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
