import java.util.*;

class StarUp
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String agr = "y";
		while(true)
		{
			if( agr.equals("y") )
			{
				String star = "";
				System.out.print("�̸��� �Է��Ͻÿ� : ");
				String name = sc.next();

				int month = 0;
				int date = 0;

				while(true) // ��
				{
					System.out.print("��� �� �̽ʴϱ�? : ");
					month = sc.nextInt();

					if(month >= 1 && month <= 12)
					{
						break;
					}
				}

				int lastDay = 31;

				if(month == 2)
				{
					lastDay = 29;
				}
				else if(month == 4 || month == 6 || month == 9 || month == 11)
				{
					lastDay = 30;
				}

				while(true) //��
				{
					System.out.print("���� �� �̽ʴϱ�? : ");
					date = sc.nextInt();
						
					if( date >= 1 && date <= lastDay)
					{
						break;
					}
				}
					
				switch(month) // ������ ���ڸ��� ���
				{
					case 1: if(date <= 19) star = "�����ڸ�"; else star = "�����ڸ�"; break;
					case 2: if(date <= 18) star = "�����ڸ�"; else star = "������ڸ�"; break;
					case 3: if(date <= 20) star = "������ڸ�"; else star = "���ڸ�"; break;
					case 4: if(date <= 19) star = "���ڸ�"; else star = "Ȳ���ڸ�"; break;
					case 5: if(date <= 20) star = "Ȳ���ڸ�"; else star = "�ֵ����ڸ�"; break;
					case 6: if(date <= 21) star = "�ֵ����ڸ�"; else star = "���ڸ�"; break;
					case 7: if(date <= 22) star = "���ڸ�"; else star = "�����ڸ�"; break;
					case 8: if(date <= 22) star = "�����ڸ�"; else star = "ó���ڸ�"; break;
					case 9: if(date <= 23) star = "ó���ڸ�"; else star = "õĪ�ڸ�"; break;
					case 10: if(date <= 22) star = "õĪ�ڸ�"; else star = "�����ڸ�"; break;
					case 11: if(date <= 22) star = "�����ڸ�"; else star = "����ڸ�"; break;
					case 12: if(date <= 24) star = "����ڸ�"; else star = "�����ڸ�"; break;
				}

				System.out.println(name + "���� ���ڸ��� " + star + "�Դϴ�.");
			}

			System.out.print("�ٽ� �Ͻðڽ��ϱ�? (y/n)");
			agr = sc.next();
			
			if(agr.equals("n"))
			{
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}