package exam05;

import java.util.Scanner;

public class StringTest11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String email;

		System.out.println("�̸��� �Է��ϼ���");
		email = sc.nextLine();

		int a = email.indexOf("@");
		

		if (a <= 0) {
			System.out.println("�̸����� �ùٸ��� �ʽ��ϴ�.");
		} else {
			System.out.println("�̸����� �ùٸ��ϴ�.");
		}
	}

}
