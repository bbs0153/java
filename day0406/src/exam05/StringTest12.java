package exam05;

import java.util.Scanner;

public class StringTest12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("이메일을 입력하세요");
		
		String[] email = sc.nextLine().split("@");
		
		if (email[0].length() < 6 || email[0].length() > 10) {
			System.out.println("이메일이 맞지 않습니다.");
		}
		
		else {
			 
		}
	}

}
