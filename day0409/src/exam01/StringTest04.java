package exam01;

import java.util.Scanner;

// 사용자한테 주민번호를 입력받아
// 올바른 주민번호 인지 판별하는 프로그램

public class StringTest04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("주민번호를 입력하세요");
		String age = sc.next();

		int tot = 0;

		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {

			tot = tot + arr[i] * Integer.parseInt(age.substring(i, i + 1));

		}
		tot = tot % 11;
		tot = 11 - tot;

		if (tot == 10)
			tot = 0;
		if (tot == 11)
			tot = 1;

		int f = Integer.parseInt(age.charAt(12) + "");

		if (f == tot) {
			System.out.println("올바른 주민번호");
		} else {
			System.out.println("잘못된 주민번호");
		}
	}

	// ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}

}
