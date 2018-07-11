import java.util.*;

class EvenOddTest
{
	public static void main(String []args)
	{
		int input;
		Scanner sc = new Scanner(System.in);

		System.out.println("**짝수 홀수 판별 프로그램**");
		System.out.println("숫자를 입력하시오");
		input = sc.nextInt();

		if(input%2==0)
		{
			System.out.println("짝수입니다.");
		}
			else
			{
				System.out.println("홀수입니다.");
			}
	}
}