//��������� 0~9������ ������ �Է¹޾� �ѱ� ǥ��� ���
import java.util.*;
class SwitchTest3
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0~9������ ������ �Է��ϼ���");
		a = sc.nextInt();

		switch(a)
		{
			case 0: System.out.println("��"); 
			case 1: System.out.println("��"); 
			case 2: System.out.println("��"); break;
			case 3: System.out.println("��"); 
			case 4: System.out.println("��"); 
			case 5: System.out.println("��"); 
			case 6: System.out.println("��"); break;
			case 7: System.out.println("ĥ"); 
			case 8: System.out.println("��"); 
			case 9: System.out.println("��"); 
			default: System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}
}
