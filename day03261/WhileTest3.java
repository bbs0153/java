/*
	����� ���� �μ� a,b�� �Է¹޾� ������ ���� �����ϴ� ���α׷�
	
	������ ���ұ��? 2
	��� ���ұ��? 3
	2�� 3�������� 8�Դϴ�.

*/
import java.util.*;
class WhileTest3 
{
	public static void main(String[] args) 
	{
		int a,b;
		int r = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("������ ���ұ��?");
		a = sc.nextInt();
		System.out.println("��� ���ұ��?");
		b = sc.nextInt();
		
		int i = 1;
		while(i<=b)
		{		
			r = r * a;
			i++;
		}
	
		System.out.println(a+"��"+b+"��������"+r+"�Դϴ�"); 
	}
}
