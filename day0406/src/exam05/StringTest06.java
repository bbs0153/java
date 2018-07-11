package exam05;

import java.util.Scanner;

public class StringTest06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String id;
		String pwd;

		while (true) {

			System.out.println("아이디를 입력하세요");
			id = sc.next();

			if (id.length() >= 2 && id.length() <= 12) {
				break;
			}
		}

		while (true) {
			System.out.println("암호를 입력하세요");
			pwd = sc.next();

			if (pwd.length() >= 6 && pwd.length() <= 12) {
				break;
			}
		}

		System.out.println("입력한 아이디 :" + id);
		System.out.println("입력한 암호 :" + pwd);

	}
}
