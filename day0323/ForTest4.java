/*
	사용자 한테 n을 입력받아 1~n까지의 짝수의 갯수를 구하여 출력

import java.util.*;
class FotTest4 
{
	public static void main(String[] args) 
	{
		int a,i;
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		a = sc.new
	}
}
*/
import java.util.*;
class ForTest4
{
	public static void main(String[] args)
	{
		int a,i;
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		a = sc.nextInt();
		
		int sum = 0;
			
			for(i=1;i<=a;i++)
			{
				sum += i;
			}
			System.out.println("1에서"+a+"까지의 합은"+sum);
	}
}