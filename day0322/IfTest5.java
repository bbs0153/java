import java.util.*;
class IfTest5
{
	public static void main(String[] args) 
	{
		int a;
		String r = "";
		String f = "";
		Scanner sc = new Scanner(System.in);


		System.out.println("0~99사이의 수를 입력하세요");
		a = sc.nextInt();
		
		int i = a/10; //십의자리
		int s = a%10; //일의 자리
		
	 
			if(a==0)
			{
				r = "영";
			}
				else if(i==1)
				{
					f = "십";
				}
				else if(i==2)
				{
					f = "이십";
				}
				else if(i==3)
				{
					f = "삼십";
				}
				else if(i==4)
				{
					f = "사십";
				}
				else if(i==5)
				{
					f = "오십";
				}
				else if(i==6)
				{
					f = "육십";
				}
				else if(i==7)
				{
					f = "칠십";
				}
				else if(i==8)
				{
					f = "팔십";
				}
				else if(i==9)
				{
					f = "구십";
					
				}
			
		System.out.print(f);
				
					if(s==1)
					{
						r = "일";
					}
					else if(s==2)
					{
						r = "이";
					}
					else if(s==3)
					{
						r = "삼";
					}
					else if(s==4)
					{
						r = "사";
					}
					else if(s==5)
					{
						r = "오";
					}
					else if(s==6)
					{
						r = "육";
					}
					else if(s==7)
					{
						r = "칠";
					}
					else if(s==8)
					{
						r = "팔";
					}
					else if(s==9)
					{
						r = "구";
					}
				System.out.println(r);
						
					
 

	  
	}
}
