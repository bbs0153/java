import java.util.*;

class  star1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է��Ͻÿ� : ");
		String name = sc.nextLine();
		System.out.print("��� �� �̽ʴϱ�? : ");
		int a = sc.nextInt();
		String star = "";

		if( a>12 || a<0 )
		{
			System.out.println("���� ����� �Է��Ͻÿ�.");
			return;
		}

		System.out.print("���� �� �̽ʴϱ�? : ");
		int b = sc.nextInt();
		int date;
		int month;
		int lastDay = 31;
		if(month == 2)
		lastDay = 28;
		else if (month == 4 || month == 6 || month == 9 || month == 11)
		lastDay = 30;

		if (b < 1 || b > lastDay)
		{
			System.out.println("���� ����� �Է��Ͻÿ�.");
			return;
		}
		
		switch(a)
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
	}
}