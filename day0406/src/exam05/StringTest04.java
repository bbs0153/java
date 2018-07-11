package exam05;

import java.util.Scanner;

public class StringTest04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String id;
		int n;
		while (true) {

			System.out.println("아이디를 입력하세요");
			id = sc.next();

			n = id.length();

			if (n >= 6 && n <= 12) {
				break;
			} else {
				System.out.println("다시 입력하세요");
			}
			

		}

		System.out.println("입력한 아이디 :" + id);
		System.out.println("입력한 아이디 :" + n);

	}
}
