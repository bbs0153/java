/*
	��������� ���� �Է¹޾� �������� ����ϴ� ���α׷��� �ۼ��մϴ�.

	���� �Է��ϼ��� ==> 100
	���� �Է��ϼ��� ==> 5

	5���� ���Դϴ�.

	�� �Ͻðھ��?(y/n)? k
	�� �Ͻðھ��?(y/n)

*/
import java.util.*;
class	SeasonTest
{
	public static void main(String[] args) 
	{
		String []str = {"�ܿ�","�ܿ�","��","��","��","����","����","����","����","����","����","�ܿ�"};
		String again;
		
		Scanner sc = new Scanner(System.in);
		int month;
		
		while(true)	
		{	
				while(true)
				{
					System.out.println("���� �Է��ϼ���");
					month = sc.nextInt();

					if(month>=1 && month<=12)
					{
						break;
					}
				}
				
		System.out.println(month+"���� "+str[month-1]+"�Դϴ�.");
		
			while(true)
			{
				System.out.println("�� �Ͻðڽ��ϱ�?(y/n)(Y/N)");
				again = sc.next();	
					
					if(again.equals("n") || again.equals("N"))
					{
						return;
					}
						else if(again.equals("y") || again.equals("Y"))
						{
							break;
						}
							else
							{
								System.out.println("�߸� �Է��ϼ̽��ϴ�.");
							}
			}
		}
	}
}
