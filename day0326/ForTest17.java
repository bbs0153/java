/*
	���� ���� ����ұ��?5
	���� ��ĭ ����ұ��?3

	***
	***
	***
	***
	***

*/
import java.util.*;
class ForTest17 
{
	public static void main(String[] args) 
	{
		String star = "*";
		int a,b;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("���� ���� ����ұ��?");
		a = sc.nextInt();
		System.out.println("���� ��ĭ ����ұ��?");
		b = sc.nextInt();

			for(int i=1; i<=a; i++)
			{
				
				for(int j=1; j<=b; j++)
				{
					System.out.print(star);
				}
			System.out.println();
			}
		
			
	}
}
