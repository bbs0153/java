/*
	�迭�� ��������⸦ �̿��Ͽ� 
	�ζ� �ڵ������⸦ ����� ���ϴ�.

	<<�ζ� ��ȣ>>
	1~45������ ���� �ߺ����� �ʰ� 6�� ����

*/
import java.util.*;
class  Lotto
{
	public static void main(String[] args) 
	{
		
		Random r = new Random();
		int []a = new int[6];
		
		for(int i = 0; i<a.length; i++)
		{
			a[i] = r.nextInt() >>>1;
			
			a[i] = a[i]%45+1;
				
				int j;
				for(j=0; j<i; j++)
				{
					if(a[i]==a[j])
					{
						break;
					}
		
				}
		
			if(i==j)
			{
				System.out.print(a[i]+"\t");
				i++;
			}
		
		}

	}
}
