//��������� 0~9������ ������ �Է¹޾� �ѱ� ǥ��� ���
import java.util.*;
class SwitchTest2 
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0~9������ ������ �Է��ϼ���");
		a = sc.nextInt();

		switch(a)
		{
			case 0: System.out.println("��"); break;
			case 1: System.out.println("��"); break;
			case 2: System.out.println("��"); break;
			case 3: System.out.println("��"); break;
			case 4: System.out.println("��"); break;
			case 5: System.out.println("��"); break;
			case 6: System.out.println("��"); break;
			case 7: System.out.println("ĥ"); break;
			case 8: System.out.println("��"); break;
			case 9: System.out.println("��"); break;
			default: System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}
}
