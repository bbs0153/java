import java.util.*;

class EvenOddTest2
{
	public static void main(String []args)
	{
		int input;
		Scanner sc = new Scanner(System.in);

		System.out.println("**¦�� Ȧ�� �Ǻ� ���α׷�**");
		System.out.println("���ڸ� �Է��Ͻÿ�");
		input = sc.nextInt();
		
		boolean f;
		f=input%2==0;		

		if(f)
		{
			System.out.println("¦���Դϴ�.");
		}
			else
			{
				System.out.println("Ȧ���Դϴ�.");
			}
	}
}