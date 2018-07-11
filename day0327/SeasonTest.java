/*
	사용자한테 월을 입력받아 계절명을 출력하는 프로그램을 작성합니다.

	월을 입력하세요 ==> 100
	월을 입력하세요 ==> 5

	5월은 봄입니다.

	또 하시겠어요?(y/n)? k
	또 하시겠어요?(y/n)

*/
import java.util.*;
class	SeasonTest
{
	public static void main(String[] args) 
	{
		String []str = {"겨울","겨울","봄","봄","봄","여름","여름","여름","가을","가을","가을","겨울"};
		String again;
		
		Scanner sc = new Scanner(System.in);
		int month;
		
		while(true)	
		{	
				while(true)
				{
					System.out.println("월을 입력하세요");
					month = sc.nextInt();

					if(month>=1 && month<=12)
					{
						break;
					}
				}
				
		System.out.println(month+"월은 "+str[month-1]+"입니다.");
		
			while(true)
			{
				System.out.println("또 하시겠습니까?(y/n)(Y/N)");
				again = sc.next();	
					
					if(again.equals("n") || again.equals("N"))
					{
						return;
					}
						else if(again.equals("y") || again.equals("Y"))
						{
							break;
						}
							else
							{
								System.out.println("잘못 입력하셨습니다.");
							}
			}
		}
	}
}
