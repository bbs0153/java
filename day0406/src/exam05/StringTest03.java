package exam05;

import java.util.Scanner;

public class StringTest03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String id;
		System.out.println("���̵� �Է��ϼ���");
		id = sc.next();
		
		int n = id.length();
		
		System.out.println("�Է��� ���̵� :"+id);
		System.out.println("�Է��� ���̵� :"+n);
		
	}
}
