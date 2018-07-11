import java.util.*;
class Test1
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("성적을 입력하세요");
		a = sc.nextInt();

		String b = (a>=60)?"합격입니다.":"불합격입니다.";

		System.out.println(b);
			
		
	}
}
