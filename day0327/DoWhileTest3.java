/*
	����� ���� n�� �Է¹޾� 1~n������ ���� �����Ͽ� ���
*/
import java.util.*;
class DoWhileTest3 
{
	public static void main(String[] args) 
	{
		int n,sum=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("n�� �Է��ϼ���");
		n = sc.nextInt();

		int i=1;
		do
		{
			sum = sum+i;
			i++;
		}while (i<=n);

		System.out.println(sum);
		
	}
}
