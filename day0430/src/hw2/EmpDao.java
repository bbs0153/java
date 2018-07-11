package hw2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

public class EmpDao {

	// 메소드 이름은 "selectAll" 이고
	// 이 메소드는 매개변수를 부서명을 전달받아
	// 해당 부서의 사원목록을 ArrayList에 담아 반환한다.
	public ArrayList<EmpVo> selectAll(String dname) {

		// 검색한 사원의 목록을 담을 ArrayList를 생성
		ArrayList<EmpVo> list = new ArrayList<EmpVo>();

		try {
			// 데이터베이스에 접속하여 실행할 sql명령어를 만든다.
			// sql명령어의 ?에 개배변수로 전달받은 부서명 dname이 설정될 자리이다.
			String sql = "select * from emp e, dept d where d.dno=e.dno and dname=? ";

			// ConnectionProvider를 통해 Connenction을 생성한다.
			Connection conn = ConnectionProvider.getConnection();

			// sql명령어를 실행하기 위한 Statment 객체를 생성한다.
			// 우리가 만든 sql명령어에는 ?를 포함하고 있기 떄문에
			// Statment의 자식 클래스인 PreparedStatment 객체를 생성한다.
			PreparedStatement psmt = conn.prepareStatement(sql);

			// sql명령어의 ?에 값을 설정한다.
			// ?의 위치와 설정될 값을 대입한다.
			psmt.setString(1, dname);

			// sql명령어를 실행한다
			// executeUpdate() : inser, update, delete 명령일때
			// executeQuery() : select 일때 검색한 결과를 ResultSet으로 반환한다.
			ResultSet rs = psmt.executeQuery();

			// 검색한 결과만큼 반복수행하여
			// 한사람 한사람의 정보를 EmpVO로 포장하여
			// list에 담아야 한다.

			// rs.next() 메소드를
			// ResultSet의 커서를 다음행으로 옮겨주는 메소드이며
			// 다음레코드가 있다면 true를 반환하고
			// 더이상 옮길 레코드가 없다면 false를 반환한다.
			while (rs.next()) {

				// 현재 rs가 바라보고 있는 레코드를
				// 자바객체로 담기 위한 vo를 설정
				EmpVo v = new EmpVo();

				// 현재 rrs가 바라보고 있는 레코드의
				// 사원번호를 자바객체 vo의 번호에 설정한다
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

				// 현재 rs가 바라보고 있는 레코드의
				// 속성값이 담긴 자바객체(vo)를 list에 담는다.
				list.add(v);
			}
			// 언제 while를 탈출하는가??
			// 모든 레코드를 list를 다 담았을 때

			// 사용했던 자원(ResultSet, Statement, Connection)을 닫기 위하여
			// ConnectionProvider에게 맡긴다.
			ConnectionProvider.close(rs, psmt, conn);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// 매개변수로 전달받은 부서명에 해당하는
		// 사원의 목록이 담긴 list를 반환한다.
		return list;

	}

	// GUI에서 부서를 선택할 수 있도록 모든 부서목록을 검색하여 반환하는 메소드

	// 메소드 이름은 "getDepts"이고
	// 반환하는 값은 Vector이며 Vector에 담는 값은 String이다.
	public Vector<String> getDepts() {

		// 모든 부서명을 담기 위한 Vector를 생성한다.
		Vector<String> list = new Vector<String>();
		try {
			// 모든 부서명을 검색하기 위한 sql명령어를 만든다.
			String sql = "select dname from dept";

			// Connection을 얻어온다
			Connection conn = ConnectionProvider.getConnection();
			// sql명령을 실행하기 위한 Statment객체를 생성한다.
			Statement stmt = conn.createStatement();
			// sql명령어를 실행한다.
			ResultSet rs = stmt.executeQuery(sql);

			// rs에 레코드가 있는 동안 반속수행하여 부서명을 백터(list)에 담는다.
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
