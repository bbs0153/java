//��������� �̸��� ����,������ �Է¹޾� ���ڸ��� ����ϴ� ���α׷� �ۼ�
import java.util.*;
class Star2
{
	public static void main(String[] args) 
	{
		String o; String r = "";
		String name;
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		while(true)	
		{	
			System.out.println("�̸��� �Է��ϼ���");
			name = sc.next();
			
			int i = 1;
			while(true)
			{
				System.out.println("������ �Է��ϼ���");
				a = sc.nextInt();
					
					if(a>=1&&a<=12)
					{
						break;
					}
				System.out.println("������ Ȯ���ϼ���");
			}
			
			
			while(true)
			{
				System.out.println("������ �Է��ϼ���");
				b = sc.nextInt();
					
					if(a==2&&b>=29)
					{
						System.out.println("������ Ȯ���ϼ���");
					}
						else if(a==4&&b>=31 || a==6&&b>=31 || a==9&&b>=31 || a==11&&b>=31)
						{
							System.out.println("������ Ȯ���ϼ���");
						}
							else if(b<=31&&b>=1)
							{
								break;
							}
			}	
			
			switch(a)
			{
				case 1:if(b<=19) r = "�����ڸ�"; else r = "�����ڸ�"; break;
				case 2:if(b<=18) r = "�����ڸ�"; else r = "������ڸ�"; break;
				case 3:if(b<=20) r = "������ڸ�"; else r = "���ڸ�"; break;
				case 4:if(b<=19) r = "���ڸ�"; else r = "Ȳ���ڸ�"; break;
				case 5:if(b<=20) r = "Ȳ���ڸ�"; else r = "�ֵ����ڸ�"; break;
				case 6:if(b<=21) r = "�ֵ����ڸ�"; else r = "���ڸ�"; break;
				case 7:if(b<=22) r = "���ڸ�"; else r = "�����ڸ�"; break;
				case 8:if(b<=22) r = "�����ڸ�"; else r = "ó���ڸ�"; break;
				case 9:if(b<=23) r = "ó���ڸ�"; else r = "õĪ�ڸ�"; break;
				case 10:if(b<=22) r = "õĪ�ڸ�"; else r = "�����ڸ�"; break;
				case 11:if(b<=22) r = "�����ڸ�"; else r = "����ڸ�"; break;
				case 12:if(b<=24) r = "����ڸ�"; else r = "�����ڸ�"; break;
			}
				System.out.println(name+"���� ���ڸ��� " +r+ "�Դϴ�.");
				
				while(true)
				{
					System.out.println("�� �Ͻðڽ��ϱ�? (y/n)");
					o = sc.next();

					if(o.equals("n"))
					{
						System.out.println("���α׷��� �����մϴ�.");
						return;
					}
						else if(o.equals("y"))
						{
							System.out.println("�ٽ� ���� �մϴ�.");
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
