/*
	������ ���� �����ϴ� ���α׷� while�� �̿�

	�ټ� :
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
		
		System.out.println("�ټ��� �Է��ϼ���");
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
