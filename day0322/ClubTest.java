import java.util.*;
class ClubTest
{
	public static void main(String[] args) 
	{
		int a;
		double b;

		Scanner sc = new Scanner(System.in);

		System.out.println("���̸� �Է��ϼ���");
		a = sc.nextInt();
		System.out.println("Ű�� �Է��ϼ���");
		b = sc.nextDouble();

			if(a>=30&b<=170)
			{
				System.out.println("���尡��");
			}
				else
				{
					System.out.println("����Ұ���");
				}
	}
}
