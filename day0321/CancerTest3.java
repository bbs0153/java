import java.util.*;

class CancerTest3
{
	public static void main(String []args)
	{
		String name;
		int year,age;
		
		Date today = new Date();		
		int currentYear = today.getYear()+1900;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("�̸��� �Է��ϼ���");
		name = sc.next();
		System.out.println("����⵵�� �Է��ϼ���");
		year = sc.nextInt();

		age = currentYear-year+1;	
			
			if(age>=40&&year%2==currentYeat%2)
			{
				System.out.println(name+"���� ����ϰ��� ����ڰ� �½��ϴ�.");
			}
				else
				{
					System.out.println(name+"���� ����а��� ����ڰ� �ƴմϴ�.");
				}

	}



}
