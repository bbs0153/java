/*
	사용자 한테 0~9사이의 정수를 입력받아
	한글표기식 출력하는 프로그램

*/
import java.util.*;
class  DigitToKorArrary
{
	public static void main(String[] args) 
	{
		String []str = {"영","일","이","삼","사","오","육","칠","팔","구","십"};
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("0~9사이의 수를 입력하세요");
		n = sc.nextInt();

		System.out.println(str[n]);
	}
}
