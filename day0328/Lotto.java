/*
	배열과 난수만들기를 이용하여 
	로또 자동생성기를 만들어 봅니다.

	<<로또 번호>>
	1~45까지의 수를 중복되지 않게 6개 선택

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
