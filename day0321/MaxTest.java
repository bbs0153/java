import java.util.*;

class MaxTest
{
	public static void main(String []args)
	{
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째수를 입력하시오");
		a = sc.nextInt();
		System.out.println("두번째수를 입력하시오");
		b = sc.nextInt();

			if(a>=b)
			{
			 	System.out.println("큰수는"+a+"입니다.");
			}
				else
				{
					System.out.println("큰수는"+b+"입니다.");
				}	
	
	
	}		



}