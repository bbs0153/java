//����� ���� ���� �Է¹޾� �� ���� ������ ���� ����ϴ� ���α׷�
//31�� 1,3,5,7,8,10,12 30�� 4,6,9,11,28�� 2
import java.util.*;
class MonthTest2
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �Է��ϼ���");
		a = sc.nextInt();

			if(a>12||a<1)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				return;
			}
			
				if(a==1||a==3||a==5||a==7||a==8||a==10||a==12)
				{
					System.out.println(a+"���� ���������� 31���Դϴ�.");
				}
				else if(a==4||a==6||a==9||a==11)
				{
					System.out.println(a+"���� ���������� 30���Դϴ�.");
				}
				else
				{
					System.out.println(a+"���� ���������� 28���Դϴ�.");
				}
		
	}
}
