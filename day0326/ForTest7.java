/*
	�Ҽ� : 1�� �ڽ����� ���������� �� ����� ���� 2���� ��
	
	����� ���� � ���� �Է¹޾�
	�Ҽ����� �ƴ��� �Ǻ�

*/
import java.util.*;
class ForTest7 
{
	public static void main(String[] args) 
	{
		int a;
		int b = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� �Է��ϼ���");
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
			System.out.println(a+"�¼Ҽ��Դϴ�.");
		}
		else
		{
			System.out.println(a+"�¼Ҽ��� �ƴմϴ�.");
		}
	}
}
