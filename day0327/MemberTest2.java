/*
		����� ���� �̸� �ּ� ���� �� �Է¹޾�
		����ϴ� ���α׷�

*/
import java.util.*;
class  MemberTest2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		String addr;
		int age;
		
		System.out.println("���� :");
		age = sc.nextInt();
		
		sc.nextLine(); // �ٸ� �Էµ��ϰ� �޶� �ٸ� �Է³����� �ѹ� �� ����� �Ѵ�.

		System.out.println("�ּ� :");
		addr = sc.nextLine(); //���鹮�� �Է� o

		System.out.println("���� : "+age);
		System.out.println("�ּ� : "+addr);
	}
}
