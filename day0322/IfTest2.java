import java.util.*;
class IfTest2 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);

		System.out.println("ù���� ���ڸ� �Է��ϼ���");
		a = sc.nextInt();
		System.out.println("�ι��� ���ڸ� �Է��ϼ���");
		b = sc.nextInt();
		System.out.println("������ ���ڸ� �Է��ϼ���");
		c = sc.nextInt();
		
			if(a>b&&a>c)
			{
				System.out.println("ū ���� :"+a);
			
			}
			else  
			{
				if(b>a&&b>c)
				{
					System.out.println("ū ���� :"+b);
				}
				else
				{
					System.out.println("ū ���� :"+c);			
				}
				
			}

		System.out.println("�۾��� �����մϴ�.");


	}
}
