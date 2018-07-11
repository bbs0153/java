package hw2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

public class EmpDao {

	// �޼ҵ� �̸��� "selectAll" �̰�
	// �� �޼ҵ�� �Ű������� �μ����� ���޹޾�
	// �ش� �μ��� �������� ArrayList�� ��� ��ȯ�Ѵ�.
	public ArrayList<EmpVo> selectAll(String dname) {

		// �˻��� ����� ����� ���� ArrayList�� ����
		ArrayList<EmpVo> list = new ArrayList<EmpVo>();

		try {
			// �����ͺ��̽��� �����Ͽ� ������ sql��ɾ �����.
			// sql��ɾ��� ?�� ���躯���� ���޹��� �μ��� dname�� ������ �ڸ��̴�.
			String sql = "select * from emp e, dept d where d.dno=e.dno and dname=? ";

			// ConnectionProvider�� ���� Connenction�� �����Ѵ�.
			Connection conn = ConnectionProvider.getConnection();

			// sql��ɾ �����ϱ� ���� Statment ��ü�� �����Ѵ�.
			// �츮�� ���� sql��ɾ�� ?�� �����ϰ� �ֱ� ������
			// Statment�� �ڽ� Ŭ������ PreparedStatment ��ü�� �����Ѵ�.
			PreparedStatement psmt = conn.prepareStatement(sql);

			// sql��ɾ��� ?�� ���� �����Ѵ�.
			// ?�� ��ġ�� ������ ���� �����Ѵ�.
			psmt.setString(1, dname);

			// sql��ɾ �����Ѵ�
			// executeUpdate() : inser, update, delete ����϶�
			// executeQuery() : select �϶� �˻��� ����� ResultSet���� ��ȯ�Ѵ�.
			ResultSet rs = psmt.executeQuery();

			// �˻��� �����ŭ �ݺ������Ͽ�
			// �ѻ�� �ѻ���� ������ EmpVO�� �����Ͽ�
			// list�� ��ƾ� �Ѵ�.

			// rs.next() �޼ҵ带
			// ResultSet�� Ŀ���� ���������� �Ű��ִ� �޼ҵ��̸�
			// �������ڵ尡 �ִٸ� true�� ��ȯ�ϰ�
			// ���̻� �ű� ���ڵ尡 ���ٸ� false�� ��ȯ�Ѵ�.
			while (rs.next()) {

				// ���� rs�� �ٶ󺸰� �ִ� ���ڵ带
				// �ڹٰ�ü�� ��� ���� vo�� ����
				EmpVo v = new EmpVo();

				// ���� rrs�� �ٶ󺸰� �ִ� ���ڵ���
				// �����ȣ�� �ڹٰ�ü vo�� ��ȣ�� �����Ѵ�
				v.setEno(rs.getInt(1));
				v.setEname(rs.getString(2));
				v.setSal(rs.getInt(3));
				v.setComm(rs.getInt(4));
				v.setHiredate(rs.getDate(5));
				v.setJumin(rs.getString(6));
				v.setDno(rs.getInt(7));
				v.setPosition(rs.getString(8));
				v.setAddr(rs.getString(9));
				v.setMgr(rs.getInt(10));
				v.setEmail(rs.getString(11));

				// ���� rs�� �ٶ󺸰� �ִ� ���ڵ���
				// �Ӽ����� ��� �ڹٰ�ü(vo)�� list�� ��´�.
				list.add(v);
			}
			// ���� while�� Ż���ϴ°�??
			// ��� ���ڵ带 list�� �� ����� ��

			// ����ߴ� �ڿ�(ResultSet, Statement, Connection)�� �ݱ� ���Ͽ�
			// ConnectionProvider���� �ñ��.
			ConnectionProvider.close(rs, psmt, conn);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// �Ű������� ���޹��� �μ��� �ش��ϴ�
		// ����� ����� ��� list�� ��ȯ�Ѵ�.
		return list;

	}

	// GUI���� �μ��� ������ �� �ֵ��� ��� �μ������ �˻��Ͽ� ��ȯ�ϴ� �޼ҵ�

	// �޼ҵ� �̸��� "getDepts"�̰�
	// ��ȯ�ϴ� ���� Vector�̸� Vector�� ��� ���� String�̴�.
	public Vector<String> getDepts() {

		// ��� �μ����� ��� ���� Vector�� �����Ѵ�.
		Vector<String> list = new Vector<String>();
		try {
			// ��� �μ����� �˻��ϱ� ���� sql��ɾ �����.
			String sql = "select dname from dept";

			// Connection�� ���´�
			Connection conn = ConnectionProvider.getConnection();
			// sql����� �����ϱ� ���� Statment��ü�� �����Ѵ�.
			Statement stmt = conn.createStatement();
			// sql��ɾ �����Ѵ�.
			ResultSet rs = stmt.executeQuery(sql);

			// rs�� ���ڵ尡 �ִ� ���� �ݼӼ����Ͽ� �μ����� ����(list)�� ��´�.
			while (rs.next()) {
				list.add(rs.getString(1));
			}

			ConnectionProvider.close(rs, stmt, conn);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
}
