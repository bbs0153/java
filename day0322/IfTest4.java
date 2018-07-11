import java.util.*;
class IfTest4
{
	public static void main(String[] args) 
	{
		int a;
	
		String r  = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("0~9사이의 수를 입력하세요");
		a = sc.nextInt();
			
			if(a==0)
			{
				r = "영";
			}
				else if(a==1)
				{
					r = "일";
				}
				else if(a==2)
				{
					r = "이";
				}
				else if(a==3)
				{
					r = "삼";
				}
				else if(a==4)
				{
					r = "사";
				}
				else if(a==5)
				{
					r = "오";
				}
				else if(a==6)
				{
					r = "육";
				}
				else if(a==7)
				{
					r = "칠";
				}
				else if(a==8)
				{
					r = "팔";
				}
				else if(a==9)
				{
					r = "구";
				}
		

	}
}
