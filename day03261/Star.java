//��������� �̸��� ����,������ �Է¹޾� ���ڸ��� ����ϴ� ���α׷� �ۼ�
import java.util.*;
class Star 
{
	public static void main(String[] args) 
	{
		String o;
		String name;
		int a,b,c;

		Scanner sc = new Scanner(System.in);
		int k = 1;
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
				i++;
			}
			
			int j = 1;
			while(true)
			{
				System.out.println("������ �Է��ϼ���");
				b = sc.nextInt();
					if(b<=31&&b>=1)
					{
						break;
					}
				System.out.println("������ Ȯ���ϼ���");
				j++;	
				
			}	
			
			switch(a)
			{
				case 1:
					switch(b)
					{
						case 20:case 21:case 22:case 23:case 24:case 25:case 26:case 27:case 28:case 29:
						case 30:case 31: System.out.println("�����ڸ�");break;
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:System.out.println("�����ڸ�");break;
					}break;
				case 2:
					switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:System.out.println("�����ڸ�"); break;
						
						case 19:case 20:case 21:case 22:case 23:case 24:case 25:case 26:case 27:case 28:
							System.out.println("������ڸ�"); break;
						default:
							case 29: case 30: case 31: System.out.println("������ Ȯ���ϼ���");break;
					}break;
				case 3:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:System.out.println("������ڸ�"); break;
						
						case 21:case 22:case 23:case 24:case 25:case 26:case 27:case 28:case 29:case 30:
						System.out.println("���ڸ�"); break;
						default:
						case 31: System.out.println("������ Ȯ���ϼ���");break;
					}break;
				case 4:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:System.out.println("���ڸ�"); break;
						
						case 20:case 21:case 22:case 24:case 25:case 26:case 27:case 28:case 29:case 30:
						System.out.println("Ȳ���ڸ�"); break;
						default:
						case 31: System.out.println("������ Ȯ���ϼ���");break;
					}break;
				case 5:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:System.out.println("Ȳ���ڸ�"); break;
						
						case 21:case 22:case 24:case 25:case 26:case 27:case 28:case 29:case 30:case 31:
						System.out.println("�ֵ����ڸ�"); break;
					}break;
				case 6:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:case 21:System.out.println("�ֵ����ڸ�"); break;
						
						case 22:case 24:case 25:case 26:case 27:case 28:case 29:case 30:
						System.out.println("���ڸ�"); break;
						default:
						case 31: System.out.println("������ Ȯ���ϼ���");break;
					}break;
				case 7:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:case 21:case 22:System.out.println("���ڸ�"); break;
						
						case 23:case 24:case 25:case 26:case 27:case 28:case 29:case 30:case 31:
						System.out.println("�����ڸ�"); break;
					}break;
				case 8:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:case 21:case 22:System.out.println("�����ڸ�"); break;
						
						case 23:case 24:case 25:case 26:case 27:case 28:case 29:case 30:case 31:
						System.out.println("ó���ڸ�"); break;
					}break;
				case 9:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:case 21:case 22:case 23:System.out.println("ó���ڸ�"); break;
						
						case 24:case 25:case 26:case 27:case 28:case 29:case 30:
						System.out.println("õ���ڸ�"); break;
						case 31: System.out.println("������ Ȯ���ϼ���");break;
					}break;
				case 10:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:case 21:case 22:System.out.println("õ���ڸ�"); break;
						
						case 23:case 24:case 25:case 26:case 27:case 28:case 29:case 30:case 31:
						System.out.println("�����ڸ�"); break;
					}break;
				case 11:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:case 21:case 22:System.out.println("�����ڸ�"); break;
						
						case 23:case 24:case 25:case 26:case 27:case 28:case 29:case 30:
						System.out.println("����ڸ�"); break;
						case 31: System.out.println("������ Ȯ���ϼ���");break;
					}break;
				case 12:
						switch(b)
					{
						case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:case 12:
						case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:case 21:case 22:case 23:case 24:System.out.println("����ڸ�"); break;
						
						case 25:case 26:case 27:case 28:case 29:case 30:case 31:
						System.out.println("�����ڸ�"); break;
					}break;
					
			}
				
				int q = 1;
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
						q++;
					}
				 
				}
			
			k++;
	
		}
	}
}
