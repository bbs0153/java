import java.util.*;
class OperatorTest13
{
	public static void main(String[] args) 
	{
		int a;
		int b;
		int c;

		Scanner sc =new Scanner(System.in);

		System.out.println("숫자를 2개를 입력하세요");
		a = sc.nextInt();
		b = sc.nextInt();

	    c = (a<=b)?b:a;

		System.out.println(c);
	}
}
