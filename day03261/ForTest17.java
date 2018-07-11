/*
	별을 몇줄 출력할까요?5
	별을 몇칸 출력할까요?3

	***
	***
	***
	***
	***

*/
import java.util.*;
class ForTest17 
{
	public static void main(String[] args) 
	{
		String star = "*";
		int a,b;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("별을 몇줄 출력할까요?");
		a = sc.nextInt();
		System.out.println("별을 몇칸 출력할까요?");
		b = sc.nextInt();

			for(int i=1; i<=a; i++)
			{
				
				for(int j=1; j<=b; j++)
				{
					System.out.print(star);
				}
			System.out.println();
			}
		
			
	}
}
