//사용자 한테 월을 입력받아 그 월에 마지막 날을 출력하는 프로그램
//31일 1,3,5,7,8,10,12 30일 4,6,9,11,28일 2
import java.util.*;
class MonthTest2
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("월을 입력하세요");
		a = sc.nextInt();

			if(a>12||a<1)
			{
				System.out.println("잘못입력하셨습니다.");
				return;
			}
			
				if(a==1||a==3||a==5||a==7||a==8||a==10||a==12)
				{
					System.out.println(a+"월의 마지막날은 31일입니다.");
				}
				else if(a==4||a==6||a==9||a==11)
				{
					System.out.println(a+"월의 마지막날은 30일입니다.");
				}
				else
				{
					System.out.println(a+"월의 마지막날은 28일입니다.");
				}
		
	}
}
