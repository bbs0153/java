/*
	do~while���� �̿��Ͽ�

	���� ����ұ��?5
	*
	**
	***
	****
	*****
*/
import java.util.*;
class DoWhileTest5 
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("���� ����ұ��?");
		a = sc.nextInt();
		
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print("*");
				j++;
			
			}while (j<=i);
	
		i++;
		System.out.println();
		}while (i<=a);
	}
}
