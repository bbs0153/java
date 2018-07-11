import java.util.*;


class Bsi
{
  public static void main(String []args)
  {
	
	Scanner math = new Scanner(System.in);

	System.out.println("숫자를 2개 입력하시오");
	int a = math.nextInt();
	int b = math.nextInt();
	

			int c = a+b;
			System.out.println("a+b=" +c);
			
			c = a-b;
			System.out.println("a-b=" +c);
			
			c = a*b;
			System.out.println("a*b=" +c);
			
			c = a/b;
			System.out.println("a/b=" +c);
			
	
  }
}