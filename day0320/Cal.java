import java.util.*;

class Cal
{
	public static void main(String []args)
	{

	 Scanner cal = new Scanner(System.in);
		int a;
		int b;
	      
		System.out.println("숫자 2개를 입력하세요");
		a = cal.nextInt();
		b = cal.nextInt();

			int c = a+b;
			System.out.println("a+b =" +c);

			c = a-b;
			System.out.println("a-b =" +c);

			c = a*b;
			System.out.println("a*b =" +c);

			c = a/b;
			System.out.println("a/b =" +c);




	}




}