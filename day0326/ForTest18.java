/*
	줄수를 입력 하시오 5

	*
	**
	***
	****
	*****


*/
import java.util.*;
class  ForTest18
{
	public static void main(String[] args) 
	{
		String star = "*";
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("줄수를 입력하세요");
		a = sc.nextInt();

			for(int i=1; i<=a; i++)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print(star);
				}
				System.out.println();
			}
	}
}
