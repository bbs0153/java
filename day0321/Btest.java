import java.util.*;

class Btest
{
	public static void main(String []args)
	{
		String name;
		int year,age;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("�̸��� �Է��ϼ���");
		name = sc.next();
		System.out.println("����⵵�� �Է��ϼ���");
		year = sc.nextInt();

		age = 2018-year+1;	
			
			if(age>=40)
			{
				System.out.println(name+"���� ����ϰ��� ����ڰ� �½��ϴ�.");
			}
				else
				{
					System.out.println(name+"���� ����а��� ����ڰ� �ƴմϴ�.");
				}

	}



}