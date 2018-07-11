import java.util.*;
class IfTest3 
{
	public static void main(String[] args) 
	{
		int a;
		String b = "영";
		String c = "일";
		String d = "이";
		String e = "삼";
		String f = "사";
		String g = "오";
		String h = "육";
		String i = "칠";
		String j = "팔";
		String k = "구";

		Scanner sc = new Scanner(System.in);

		System.out.println("0~9사이의 수를 입력하세요");
		a = sc.nextInt();
			if(a==0)
			{
				System.out.println(b);
			}
				else if(a==1)
				{
					System.out.println(c);
				}
				else if(a==2)
				{
					System.out.println(d);
				}
				else if(a==3)
				{
					System.out.println(e);
				}
				else if(a==4)
				{
					System.out.println(f);
				}
				else if(a==5)
				{
					System.out.println(g);
				}
				else if(a==6)
				{
					System.out.println(h);
				}
				else if(a==7)
				{
					System.out.println(i);
				}
				else if(a==8)
				{
					System.out.println(j);
				}
				else if(a==9)
				{
					System.out.println(k);
				}
		

		System.out.println("작업을 종료합니다.");


	}
}
