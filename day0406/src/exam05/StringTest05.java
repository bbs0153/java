package exam05;

import java.util.Scanner;

public class StringTest05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String id;
		
		while (true) {

			System.out.println("���̵� �Է��ϼ���");
			id = sc.next();
			
			if (id.length() >= 6 && id.length() <= 12) {
				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ���");
			}

		}

		System.out.println("�Է��� ���̵� :" + id);

	}
}
