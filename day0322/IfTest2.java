import java.util.*;
class IfTest2 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번쨰 숫자를 입력하세요");
		a = sc.nextInt();
		System.out.println("두번쨰 숫자를 입력하세요");
		b = sc.nextInt();
		System.out.println("세번쨰 숫자를 입력하세요");
		c = sc.nextInt();
		
			if(a>b&&a>c)
			{
				System.out.println("큰 수는 :"+a);
			
			}
			else  
			{
				if(b>a&&b>c)
				{
					System.out.println("큰 수는 :"+b);
				}
				else
				{
					System.out.println("큰 수는 :"+c);			
				}
				
			}

		System.out.println("작업을 종료합니다.");


	}
}
