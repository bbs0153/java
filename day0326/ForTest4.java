/*
	����� ���� n�� �Է¹޾� 
	n!�� ���Ͽ� ����ϴ� ���α׷�

	n�� �Է��Ͻÿ� ==> 5
	5 * 4 * 3 * 2 * 1 = 120
*/
import java.util.*;
class  ForTest4
{
	public static void main(String[] args) 
	{
		int n,i;
		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� �Է��ϼ���");
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
