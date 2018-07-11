import java.util.*;

class MaxTest2
{
	public static void main(String []args)
	{
		int a,b,max;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째수를 입력하시오");
		a = sc.nextInt();
		System.out.println("두번째수를 입력하시오");
		b = sc.nextInt();

			if(a>=b)
			{
			 	max = a;
			}
				else
				{
					max = b;
				}	
	
	
		System.out.println("큰수는"+max+"입니다.");
	}		



}