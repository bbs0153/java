/*
	������ ���� �����ϴ� ���α׷� �ۼ�

	����� ���ұ��? 2
	��� ���� ���? 3

	2�� 3�������� 8�Դϴ�.

*/
import java.util.*;
class ForTest9 
{
	public static void main(String[] args) 
	{
		int a,b,c = 1;
		Scanner sc = new Scanner(System.in);

		System.out.print("����� ���ұ��?");
		a = sc.nextInt();
		System.out.print("��� ���ұ��?");
		b = sc.nextInt();

			
			for(int i=1; i<=b; i++)
			{
				c = c*a;
			}
		
		System.out.print(a+"��"+b+"��������"+c);
	}
}
