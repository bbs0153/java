/*
	사용자 한테 두수 a,b를 입력받아 다음과 같이 동작하는 프로그램
	
	무엇을 곱할까요? 2
	몇번 곱할까요? 3
	2의 3제곱승은 8입니다.

*/
import java.util.*;
class WhileTest3 
{
	public static void main(String[] args) 
	{
		int a,b;
		int r = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("무엇을 곱할까요?");
		a = sc.nextInt();
		System.out.println("몇번 곱할까요?");
		b = sc.nextInt();
		
		int i = 1;
		while(i<=b)
		{		
			r = r * a;
			i++;
		}
	
		System.out.println(a+"의"+b+"제곱승은"+r+"입니다"); 
	}
}
