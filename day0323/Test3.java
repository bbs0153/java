import java.util.*;
class Test3
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("������ �Է��ϼ���");
		a = sc.nextInt();

			if(a>=80)
			{
				System.out.println("���� ����ϰ� �հ��Դϴ�.");	
			}
			else if(a>=70&&a<80)
			{
				System.out.println("����ϰ� �հ��Դϴ�.");		
			}
			else if(a>=60&&a<70)
			{
				System.out.println("�հ��Դϴ�.");		
			}
			else if(a>=50&&a<60)
			{
				System.out.println("��Ÿ���� ���հ��Դϴ�.");			
			}
			else if(a<60)
			{
				System.out.println("���հ��Դϴ�.");
			}
		
	}
}
