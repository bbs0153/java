package hw;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpTest {

	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("1.������� 0.����");
			n = sc.nextInt();

			if (n == 1) {
				System.out.println("�μ��Է�");
				String dname = sc.next();

				EmpDAO dao = new EmpDAO();
				ArrayList<EmpVO> list = dao.getDeptList(dname);

				System.out.println("�����ȣ\t�̸�\t�޿�\t����\t�Ի���\t\t\t�ֹι�ȣ\t\t�μ���ȣ\t����\t�ּ�");

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
				System.out.println("����");
				break;
			}
		}
	}

}
