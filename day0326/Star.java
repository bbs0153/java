//사용자한테 이름과 생월,생일을 입력받아 별자리를 출력하는 프로그램 작성
import java.util.*;
class Star 
{
	public static void main(String[] args) 
	{
		String o;
		String name;
		int a,b,c;

		Scanner sc = new Scanner(System.in);
		int k = 1;
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
				i++;
			}
			
			int j = 1;
			while(true)
			{
				System.out.println("생일을 입력하세요");
				b = sc.nextInt();
					if(b<=31&&b>=1)
					{
						break;
					}
				System.out.println("생일을 확인하세요");
				j++;	
				
			}	
			
			switch(a)
			{
				case 1:
					switch(b)
					{
						case 20:case 21:case 22:case 23:case 24:case 25:case 26:case 27:case 28:case 29:
						case 30:case 31: System.out.println("물병자리");break;
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:System.out.println("염소자리");break;
					}break;
				case 2:
					switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:System.out.println("물병자리"); break;
						
						case 19:case 20:case 21:case 22:case 23:case 24:case 25:case 26:case 27:case 28:
							System.out.println("물고기자리"); break;
						default:
							case 29: case 30: case 31: System.out.println("생일을 확인하세요");break;
					}break;
				case 3:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:System.out.println("물고기자리"); break;
						
						case 21:case 22:case 23:case 24:case 25:case 26:case 27:case 28:case 29:case 30:
						System.out.println("양자리"); break;
						default:
						case 31: System.out.println("생일을 확인하세요");break;
					}break;
				case 4:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:System.out.println("양자리"); break;
						
						case 20:case 21:case 22:case 24:case 25:case 26:case 27:case 28:case 29:case 30:
						System.out.println("황소자리"); break;
						default:
						case 31: System.out.println("생일을 확인하세요");break;
					}break;
				case 5:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:System.out.println("황소자리"); break;
						
						case 21:case 22:case 24:case 25:case 26:case 27:case 28:case 29:case 30:case 31:
						System.out.println("쌍둥이자리"); break;
					}break;
				case 6:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:case 21:System.out.println("쌍둥이자리"); break;
						
						case 22:case 24:case 25:case 26:case 27:case 28:case 29:case 30:
						System.out.println("게자리"); break;
						default:
						case 31: System.out.println("생일을 확인하세요");break;
					}break;
				case 7:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:case 21:case 22:System.out.println("게자리"); break;
						
						case 23:case 24:case 25:case 26:case 27:case 28:case 29:case 30:case 31:
						System.out.println("사자자리"); break;
					}break;
				case 8:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:case 21:case 22:System.out.println("사자자리"); break;
						
						case 23:case 24:case 25:case 26:case 27:case 28:case 29:case 30:case 31:
						System.out.println("처녀자리"); break;
					}break;
				case 9:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:case 21:case 22:case 23:System.out.println("처녀자리"); break;
						
						case 24:case 25:case 26:case 27:case 28:case 29:case 30:
						System.out.println("천정자리"); break;
						case 31: System.out.println("생일을 확인하세요");break;
					}break;
				case 10:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:case 21:case 22:System.out.println("천정자리"); break;
						
						case 23:case 24:case 25:case 26:case 27:case 28:case 29:case 30:case 31:
						System.out.println("전갈자리"); break;
					}break;
				case 11:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:case 21:case 22:System.out.println("전갈자리"); break;
						
						case 23:case 24:case 25:case 26:case 27:case 28:case 29:case 30:
						System.out.println("사수자리"); break;
						case 31: System.out.println("생일을 확인하세요");break;
					}break;
				case 12:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:case 21:case 22:case 23:case 24:System.out.println("사수자리"); break;
						
						case 25:case 26:case 27:case 28:case 29:case 30:case 31:
						System.out.println("염소자리"); break;
					}break;
					
			}
				
				int q = 1;
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
						q++;
					}
				 
				}
			
			k++;
	
		}
	}
}
