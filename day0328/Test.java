/*
	����(������) ����� (����̱�)
	
	1~10 ������ ������ ���� �ϳ� ����� ���

*/

import java.util.Random;
class Test
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		int n = r.nextInt();
		
		//�����̸� ����� ������
		if (n<0)
		{ 
			n = n*-1;
		}
		
		//1���� 10���� ���� ����
		n = n%10+1;
		
		
		System.out.println(n);
	}
}
