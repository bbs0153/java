/*
	다음과 같이 동작하는 프로그램 while문 이용

	줄수 :
	*
	**
	***

*/

import java.util.*;
class WhileTest5 
{
	public static void main(String[] args) 
	{
		String star = "*";
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("줄수를 입력하세요");
		a = sc.nextInt();

			int i = 1;
			while(i<=a)
			{	
					int j = 1;
					while(j<=i)
					{
						System.out.print(star);
						j++;
					}	
			i++;
			System.out.println();
			}


	}
}
