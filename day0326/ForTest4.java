/*
	사용자 한테 n을 입력받아 
	n!을 구하여 출력하는 프로그램

	n을 입력하시오 ==> 5
	5 * 4 * 3 * 2 * 1 = 120
*/
import java.util.*;
class  ForTest4
{
	public static void main(String[] args) 
	{
		int n,i;
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		n = sc.nextInt();

		int a = 1;

			for (i=n;i>=1;i--)
			{
				a = a * i;
				System.out.print(i);
				if(i!=1)
				{
					System.out.print("*");
				}
			}
		
		System.out.println("="+a);
	}
}
