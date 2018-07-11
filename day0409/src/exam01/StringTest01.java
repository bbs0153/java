package exam01;

import java.util.ArrayList;

import javax.xml.transform.stax.StAXSource;

public class StringTest01 {

	public static void main(String[] args) {

		String[] arr = { "cat", "lion", "CAT", "tiger", "monkey", "Cat" };

		// 배열안에 cat은 모두 몇개인지?
		int n = 0;

		for (String s : arr) {

			s = s.toLowerCase();
			if (s.equals("cat")) {
				n++;
			}
		}
		System.out.println(n);

		String s1 = "Hello Korea";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());

		String str = "   hello   ";

		System.out.println(str.length());
		System.out.println("|" + str + "|");

		str = str.trim(); // 문자열의 왼쪽과 오른쪽의 공백을 제거

		System.out.println(str.length());
		System.out.println("|" + str + "|");

	}

}
