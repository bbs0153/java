package exam05;

import java.util.Scanner;

public class StringTest06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String id;
		String pwd;

		while (true) {

			System.out.println("���̵� �Է��ϼ���");
			id = sc.next();

			if (id.length() >= 2 && id.length() <= 12) {
				break;
			}
		}

		while (true) {
			System.out.println("��ȣ�� �Է��ϼ���");
			pwd = sc.next();

			if (pwd.length() >= 6 && pwd.length() <= 12) {
				break;
			}
		}

		System.out.println("�Է��� ���̵� :" + id);
		System.out.println("�Է��� ��ȣ :" + pwd);

	}
}
