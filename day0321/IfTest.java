import java.util.*;

class IfTest
{
	public static void main(String []args)
	{
		int a;
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		a = sc.nextInt();
		
			if(a%6==0)
			{
				System.out.println("6의 배수입니다.");
			}
		

				else
				{
					System.out.println("6의 배수가 아닙니다.");
				}
	}


}