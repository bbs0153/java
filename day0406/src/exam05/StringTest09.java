package exam05;

import java.util.Scanner;

public class StringTest09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str, str1;

		System.out.println("��ȣ�� �Է��ϼ���");
		str = sc.nextLine();
		System.out.println("��ȣ�� �ٽ� �Է����ּ���");
		str1 = sc.nextLine();

		if (str.equals(str1)) {

			System.out.println("�����ϴ�.");

		} else {
			System.out.println("���� �ʽ��ϴ�.");
		}
	}

}
