//����� ���� 0~99������ ������ �Է¹޾�
//�ѱ�ǥ��� ����ϴ� ���α׷��ۼ�
import java.util.*;
class DigiToKor
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a;
		int a10; //10�� �ڸ��� ������ ����
		int a1; // 1�� �ڸ��� ������ ����
		String r = ""; //10�� �ڸ� ���� ��Ƶ� ����
		String f = ""; //1�� �ڸ� ���� ��Ƶ� ����
		
		System.out.println("** ���ڸ� �Է��ϸ� �ѱ۷� ��ȯ�մϴ�.");
		System.out.println("0~99������ ���� �Է��ϼ���");
		a = sc.nextInt();

		a10 = a/10; 
		a1 = a%10;
			
			if(a10==0)      //10�� �ڸ� ó�� ����
				r = "";
			else if(a10==1)
				r = "��";
			else if(a10==2)
				r = "�̽�";
			else if(a10==3)
				r = "���";
			else if(a10==4)
				r = "���";
			else if(a10==5)
				r = "����";
			else if(a10==6)
				r = "����";
			else if(a10==7)
				r = "ĥ��";
			else if(a10==8)
				r = "�Ƚ�";
			else if(a10==9)
				r = "����";  //10�� �ڸ� ó�� ��

			if(a1==0&&a10==0)        //1�� �ڸ� ó�� ����
				f = "��";
			else if(a1==1)
				f = "��";
			else if(a1==2)
				f = "��";
			else if(a1==3)
				f = "��";
			else if(a1==4)
				f = "��";
			else if(a1==5)
				f = "��";
			else if(a1==6)
				f = "��";
			else if(a1==7)
				f = "ĥ";
			else if(a1==8)
				f = "��";
			else if(a1==9)
				f = "��";   //1�� �ڸ� ó�� ��

			System.out.println(r+f);
			

		
	}
}
