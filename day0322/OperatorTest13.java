import java.util.*;
class OperatorTest13
{
	public static void main(String[] args) 
	{
		int a;
		int b;
		int c;

		Scanner sc =new Scanner(System.in);

		System.out.println("���ڸ� 2���� �Է��ϼ���");
		a = sc.nextInt();
		b = sc.nextInt();

	    c = (a<=b)?b:a;

		System.out.println(c);
	}
}
