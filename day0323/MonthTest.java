//사용자한테 월을 입력을 받아서 계절명을 출력하는 프로그램
import java.util.*;
class MonthTest
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("월을 입력하세요");
		a = sc.nextInt();

			if(a==3||a==4||a==5)
			{
				System.out.println(a+"월은 봄입니다.");
			}
			else if(a==6||a==7||a==8)
			{
				System.out.println(a+"월은 여름입니다.");
			}
			else if(a==9||a==10||a==11)
			{
				System.out.println(a+"월은 가을입니다");
			}
			else if(a==12||a==1||a==2)
			{
				System.out.println(a+"월은 겨울입니다");
			}
	}
}
