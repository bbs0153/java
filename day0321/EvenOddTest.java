import java.util.*;

class EvenOddTest
{
	public static void main(String []args)
	{
		int input;
		Scanner sc = new Scanner(System.in);

		System.out.println("**¦�� Ȧ�� �Ǻ� ���α׷�**");
		System.out.println("���ڸ� �Է��Ͻÿ�");
		input = sc.nextInt();

		if(input%2==0)
		{
			System.out.println("¦���Դϴ�.");
		}
			else
			{
				System.out.println("Ȧ���Դϴ�.");
			}
	}
}