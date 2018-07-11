import java.util.*;
class Test
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("성적을 입력하세요");
		a = sc.nextInt();

			if(a>=60)
			{
				System.out.println("합격입니다.");
				System.out.println("축하합니다.");
				
			}
			else if(a<60)
			{
				System.out.println("불합격입니다.");
				
			}
			
		
	}
}
