/*
	��������� ������ �� n�� �Է¹޾� 6�� ����� ���� �����Ͽ� ����ϴ� ���α׷� �ۼ�

*/
import java.util.*;
class ContinueTest 
{
	public static void main(String[] args) 
	{
		int a,i,sum=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� �Է��ϼ���");
		a = sc.nextInt();

			for(i=1; i<=a; i++)
			{
				if(i%6!=0)
				{	
					continue;
				}
			sum = sum+i;
			}
		System.out.println(sum);
	}
}
