package exam01;

import java.util.Scanner;

// ��������� �ֹι�ȣ�� �Է¹޾�
// �ùٸ� �ֹι�ȣ ���� �Ǻ��ϴ� ���α׷�

public class StringTest04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("�ֹι�ȣ�� �Է��ϼ���");
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
			System.out.println("�ùٸ� �ֹι�ȣ");
		} else {
			System.out.println("�߸��� �ֹι�ȣ");
		}
	}

	// �� = 11-{(2����+3����+4����+5����+6����+7����+8����+9����+2����+3����+4����+5����) mod 11}

}
