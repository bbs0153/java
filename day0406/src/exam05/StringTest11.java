package exam05;

import java.util.Scanner;

public class StringTest11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String email;

		System.out.println("이메을 입력하세요");
		email = sc.nextLine();

		int a = email.indexOf("@");
		

		if (a <= 0) {
			System.out.println("이메일이 올바르지 않습니다.");
		} else {
			System.out.println("이메일이 올바름니다.");
		}
	}

}
