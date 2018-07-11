/*
	소수 : 1과 자신으로 나누어지는 수 약수의 개수 2개인 수
	
	사용자 한테 어떤 수를 입력받아
	소수인지 아닌지 판별

*/
import java.util.*;
class ForTest7 
{
	public static void main(String[] args) 
	{
		int a;
		int b = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		a = sc.nextInt();
	
			for (int i=1; i<=a ; i++)
			{
				if(a%i==0)
				{
					b++;
				}
			}
		if(b==2)
		{
			System.out.println(a+"는소수입니다.");
		}
		else
		{
			System.out.println(a+"는소수가 아닙니다.");
		}
	}
}
