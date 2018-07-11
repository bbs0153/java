package hw;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpTest {

	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("1.사원정보 0.종료");
			n = sc.nextInt();

			if (n == 1) {
				System.out.println("부서입력");
				String dname = sc.next();

				EmpDAO dao = new EmpDAO();
				ArrayList<EmpVO> list = dao.getDeptList(dname);

				System.out.println("사원번호\t이름\t급여\t수당\t입사일\t\t\t주민번호\t\t부서번호\t직급\t주소");

				for (EmpVO ev : list) {
					System.out.print(ev.getEno() + "\t");
					System.out.print(ev.getEname() + "\t");
					System.out.print(ev.getSal() + "\t");
					System.out.print(ev.getComm() + "\t");
					System.out.print(ev.getHiredate() + "\t");
					System.out.print(ev.getJumin() + "\t");
					System.out.print(ev.getDno() + "\t");
					System.out.print(ev.getPosition() + "\t");
					System.out.println(ev.getAddr());
				}
			}

			if (n == 0) {
				System.out.println("종료");
				break;
			}
		}
	}

}
