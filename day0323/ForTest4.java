/*
	����� ���� n�� �Է¹޾� 1~n������ ¦���� ������ ���Ͽ� ���

import java.util.*;
class FotTest4 
{
	public static void main(String[] args) 
	{
		int a,i;
		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� �Է��ϼ���");
		a = sc.new
	}
}
*/
import java.util.*;
class ForTest4
{
	public static void main(String[] args)
	{
		int a,i;
		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� �Է��ϼ���");
		a = sc.nextInt();
		
		int sum = 0;
			
			for(i=1;i<=a;i++)
			{
				sum += i;
			}
			System.out.println("1����"+a+"������ ����"+sum);
	}
}