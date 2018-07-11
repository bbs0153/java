import java.util.*;
class Test3
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("성적을 입력하세요");
		a = sc.nextInt();

			if(a>=80)
			{
				System.out.println("아주 우수하게 합격입니다.");	
			}
			else if(a>=70&&a<80)
			{
				System.out.println("우수하게 합격입니다.");		
			}
			else if(a>=60&&a<70)
			{
				System.out.println("합격입니다.");		
			}
			else if(a>=50&&a<60)
			{
				System.out.println("안타깝게 불합격입니다.");			
			}
			else if(a<60)
			{
				System.out.println("불합격입니다.");
			}
		
	}
}
