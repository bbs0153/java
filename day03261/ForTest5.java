/*
	����� ���� � �� n�� �Է¹޾�
	1~n������ ¦���� ��, Ȧ���� ��, ¦���� ����, Ȧ���� ������
	��� �ϴ� ���α׷�
*/

import java.util.*;
class ForTest5 
{
	public static void main(String[] args) 
	{
		int n,i;
		int evenSum = 0; //¦�� ��
		int evenCnt = 0; //¦�� ����
		int oddSum = 0; //Ȧ�� ��
		int oddCnt = 0; //Ȧ�� ����
		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� �Է��ϼ���");
		n = sc.nextInt();

			for(i=1; i<=n; i++)
			{
				if (i%2==0)
				{
					evenSum	= evenSum + i;
					evenCnt++;
				}
				else
				{
					oddSum = oddSum + i;
					oddCnt++;
				}
			}

		System.out.println("¦����:"+evenSum);
		System.out.println("¦�� ����:"+evenCnt);
		System.out.println("Ȧ����:" +oddSum);
		System.out.println("Ȧ�� ����:"+oddCnt);
	
	}
}
