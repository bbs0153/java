/*
	사용자한테 임이의 수 n을 입력받아 6의 배수의 합을 누적하여 출력하는 프로그램 작성

*/
import java.util.*;
class ContinueTest 
{
	public static void main(String[] args) 
	{
		int a,i,sum=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		a = sc.nextInt();

			for(i=1; i<=a; i++)
			{
				if(i%6!=0)
				{	
					continue;
				}
			sum = sum+i;
			}
		System.out.println(sum);
	}
}
