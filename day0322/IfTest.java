import java.util.*;
class IfTest 
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� �Է��ϼ���");
		a = sc.nextInt();

			if(a>=0)
			{
				System.out.println(+a+100+"\n�۾��� �����մϴ�.");
			}

				else
				{
					System.out.println(+a*a+"\n�۾��� �����մϴ�.");			
				}

	}
}
