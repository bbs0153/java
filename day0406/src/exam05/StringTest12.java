package exam05;

import java.util.Scanner;

public class StringTest12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("�̸����� �Է��ϼ���");
		
		String[] email = sc.nextLine().split("@");
		
		if (email[0].length() < 6 || email[0].length() > 10) {
			System.out.println("�̸����� ���� �ʽ��ϴ�.");
		}
		
		else {
			 
		}
	}

}
