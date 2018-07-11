import java.util.*;
class ClubTest
{
	public static void main(String[] args) 
	{
		int a;
		double b;

		Scanner sc = new Scanner(System.in);

		System.out.println("나이를 입력하세요");
		a = sc.nextInt();
		System.out.println("키를 입력하세요");
		b = sc.nextDouble();

			if(a>=30&b<=170)
			{
				System.out.println("입장가능");
			}
				else
				{
					System.out.println("입장불가능");
				}
	}
}
