import java.util.*;
class IfTest 
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		a = sc.nextInt();

			if(a>=0)
			{
				System.out.println(+a+100+"\n작업을 종료합니다.");
			}

				else
				{
					System.out.println(+a*a+"\n작업을 종료합니다.");			
				}

	}
}
