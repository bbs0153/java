package exam05;

import java.util.Scanner;

public class StringTest16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("문자열 입력하세요");
		String str = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println(sb.reverse());
		
		


		
		
	/*
			for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}*/

	}

}
