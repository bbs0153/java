//사용자한테 이름과 생월,생일을 입력받아 별자리를 출력하는 프로그램 작성
import java.util.*;
class Star2
{
	public static void main(String[] args) 
	{
		String o; String r = "";
		String name;
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		while(true)	
		{	
			System.out.println("이름을 입력하세요");
			name = sc.next();
			
			int i = 1;
			while(true)
			{
				System.out.println("생월을 입력하세요");
				a = sc.nextInt();
					
					if(a>=1&&a<=12)
					{
						break;
					}
				System.out.println("생월을 확인하세요");
			}
			
			
			while(true)
			{
				System.out.println("생일을 입력하세요");
				b = sc.nextInt();
					
					if(a==2&&b>=29)
					{
						System.out.println("생일을 확인하세요");
					}
						else if(a==4&&b>=31 || a==6&&b>=31 || a==9&&b>=31 || a==11&&b>=31)
						{
							System.out.println("생일을 확인하세요");
						}
							else if(b<=31&&b>=1)
							{
								break;
							}
			}	
			
			switch(a)
			{
				case 1:if(b<=19) r = "염소자리"; else r = "물병자리"; break;
				case 2:if(b<=18) r = "물병자리"; else r = "물고기자리"; break;
				case 3:if(b<=20) r = "물고기자리"; else r = "양자리"; break;
				case 4:if(b<=19) r = "양자리"; else r = "황소자리"; break;
				case 5:if(b<=20) r = "황소자리"; else r = "쌍둥이자리"; break;
				case 6:if(b<=21) r = "쌍둥이자리"; else r = "게자리"; break;
				case 7:if(b<=22) r = "게자리"; else r = "사자자리"; break;
				case 8:if(b<=22) r = "사자자리"; else r = "처녀자리"; break;
				case 9:if(b<=23) r = "처녀자리"; else r = "천칭자리"; break;
				case 10:if(b<=22) r = "천칭자리"; else r = "전갈자리"; break;
				case 11:if(b<=22) r = "전갈자리"; else r = "사수자리"; break;
				case 12:if(b<=24) r = "사수자리"; else r = "염소자리"; break;
			}
				System.out.println(name+"님의 별자리는 " +r+ "입니다.");
				
				while(true)
				{
					System.out.println("또 하시겠습니까? (y/n)");
					o = sc.next();

					if(o.equals("n"))
					{
						System.out.println("프로그램을 종료합니다.");
						return;
					}
						else if(o.equals("y"))
						{
							System.out.println("다시 시작 합니다.");
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
