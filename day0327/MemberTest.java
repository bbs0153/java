/*
		����� ���� �̸� �ּ� ���� �� �Է¹޾�
		����ϴ� ���α׷�

*/
import java.util.*;
class  MemberTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		String addr;
		int age;

		System.out.println("�̸� :");
		name = sc.next();	//���鹮�� �Է� x
		System.out.println("�ּ� :");
		addr = sc.next();
		System.out.println("���� :");
		age = sc.nextInt();

		System.out.println("�̸� : "+name);
		System.out.println("�ּ� : "+addr);
		System.out.println("���� : "+age);
	}
}
