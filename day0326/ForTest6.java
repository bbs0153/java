/*
	6�� ��� 1,2,3,6

	��� ? �� ���� ����� �������� 0�� �Ǵ� ��

	��� n�� �Է� �޾� n�� ����� ��� ����ϴ� ���α׷�

*/
import java.util.*;
class ForTest6 
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		a = sc.nextInt();

		System.out.println(a+"����� ������ �����ϴ�.");
		 for (int i=1; i<=a ; i++)
		 {
			if(a%i==0)
			{
				System.out.print(i+ " ");
			}
		 }
	}
}
