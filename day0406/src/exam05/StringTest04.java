package exam05;

import java.util.Scanner;

public class StringTest04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String id;
		int n;
		while (true) {

			System.out.println("���̵� �Է��ϼ���");
			id = sc.next();

			n = id.length();

			if (n >= 6 && n <= 12) {
				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ���");
			}
			

		}

		System.out.println("�Է��� ���̵� :" + id);
		System.out.println("�Է��� ���̵� :" + n);

	}
}
