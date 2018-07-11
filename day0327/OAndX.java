import java.util.*;
class OAndX 
{
	public static void main(String[] args) 
	{
		int []o = {3,4,1,3,4,2,3,1,1,2}; //정답
		int []a = new int[10];  //정답
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<a.length; i++)
		{
			System.out.println((i+1)+"번째 답 :");
			a[i] = sc.nextInt();
		}
		
		System.out.println("**시험 결과**");
		System.out.println("1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
		
		int sum = 0;
		int sum1 = 0;
		
		for(int i=0; i<o.length; i++)
		{
			if(a[i]==o[i])
			{
				
				System.out.print("o\t");
				sum++;
			}
			else
			{
				
				System.out.print("x\t");
				sum1++;
			}
		}
	
		System.out.println("맞은갯수 : "+sum);
		System.out.println("틀린갯수 : "+sum1);
	}
}
