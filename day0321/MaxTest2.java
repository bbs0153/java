import java.util.*;

class MaxTest2
{
	public static void main(String []args)
	{
		int a,b,max;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��°���� �Է��Ͻÿ�");
		a = sc.nextInt();
		System.out.println("�ι�°���� �Է��Ͻÿ�");
		b = sc.nextInt();

			if(a>=b)
			{
			 	max = a;
			}
				else
				{
					max = b;
				}	
	
	
		System.out.println("ū����"+max+"�Դϴ�.");
	}		



}