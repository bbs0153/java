import java.util.*;
class SwitchTest4 
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���");
		a = sc.nextInt();
		
		if(a<1||a>12)
		{
			System.out.println("�Է°��� Ȯ���ϼ���");
			return;
		}

		switch(a)
		{
			
			case 4: case 6: case 9: case 11: b = 30; break;
			case 2: b = 28; break;
			default: b = 31;
		}
			System.out.println(a+"����"+b+"�����ֽ��ϴ�.");
	}
}
