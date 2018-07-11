package exam05;

import java.util.Scanner;

public class StringTest09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str, str1;

		System.out.println("암호를 입력하세요");
		str = sc.nextLine();
		System.out.println("암호를 다시 입력해주세요");
		str1 = sc.nextLine();

		if (str.equals(str1)) {

			System.out.println("같습니다.");

		} else {
			System.out.println("같지 않습니다.");
		}
	}

}
