package exam05;

import java.util.Scanner;

public class StringTest08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str;
		int count = 0;

		System.out.println("문장을 입력하세요");
		str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'A') {
				count++;
			}
		}
		System.out.println("A " + count);
	}

}
