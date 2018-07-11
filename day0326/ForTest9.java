/*
	다음과 같이 동작하는 프로그램 작성

	어떤수를 곱할까요? 2
	몇번 곱할 까요? 3

	2의 3제곱승은 8입니다.

*/
import java.util.*;
class ForTest9 
{
	public static void main(String[] args) 
	{
		int a,b,c = 1;
		Scanner sc = new Scanner(System.in);

		System.out.print("어떤수를 곱할까요?");
		a = sc.nextInt();
		System.out.print("몇번 곱할까요?");
		b = sc.nextInt();

			
			for(int i=1; i<=b; i++)
			{
				c = c*a;
			}
		
		System.out.print(a+"의"+b+"제곱승은"+c);
	}
}
