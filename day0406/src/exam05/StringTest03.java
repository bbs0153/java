package exam05;

import java.util.Scanner;

public class StringTest03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String id;
		System.out.println("아이디를 입력하세요");
		id = sc.next();
		
		int n = id.length();
		
		System.out.println("입력한 아이디 :"+id);
		System.out.println("입력한 아이디 :"+n);
		
	}
}
