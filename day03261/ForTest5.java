/*
	사용자 한테 어떤 수 n을 입력받아
	1~n까지의 짝수의 합, 홀수의 합, 짝수의 개수, 홀수의 개수를
	출력 하는 프로그램
*/

import java.util.*;
class ForTest5 
{
	public static void main(String[] args) 
	{
		int n,i;
		int evenSum = 0; //짝수 합
		int evenCnt = 0; //짝수 갯수
		int oddSum = 0; //홀수 합
		int oddCnt = 0; //홀수 갯수
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		n = sc.nextInt();

			for(i=1; i<=n; i++)
			{
				if (i%2==0)
				{
					evenSum	= evenSum + i;
					evenCnt++;
				}
				else
				{
					oddSum = oddSum + i;
					oddCnt++;
				}
			}

		System.out.println("짝수합:"+evenSum);
		System.out.println("짝수 갯수:"+evenCnt);
		System.out.println("홀수합:" +oddSum);
		System.out.println("홀수 갯수:"+oddCnt);
	
	}
}
