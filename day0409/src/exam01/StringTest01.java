package exam01;

import java.util.ArrayList;

import javax.xml.transform.stax.StAXSource;

public class StringTest01 {

	public static void main(String[] args) {

		String[] arr = { "cat", "lion", "CAT", "tiger", "monkey", "Cat" };

		// �迭�ȿ� cat�� ��� �����?
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

		str = str.trim(); // ���ڿ��� ���ʰ� �������� ������ ����

		System.out.println(str.length());
		System.out.println("|" + str + "|");

	}

}
