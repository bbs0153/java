//사용자한테 임의수 a을 입력받아 1~n까지의 모든 정수를 출력합니다.
import java.util.*;
class ForTest3 
{
	public static void main(String[] args) 
	{
		int a,i;
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		a = sc.nextInt();

			for(i=1;i<=a;i++)
			{
				System.out.println(i);
			}
		

	}
}
