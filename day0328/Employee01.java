import java.util.*;
class Employee
{
	String name;	//�̸�
	String dir;		//�ּ�
	int money;		//����
	String call;		//��ȣ
}

class Employee01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee []a = new Employee[3];

		for(int i = 0; i<a.length; i++)
		{
			a[i] = new Employee();
			
			System.out.println("�̸��� �Է��ϼ���");
			a[i].name = sc.next();
			System.out.println("�ּҸ� �Է��ϼ���");
			a[i].dir = sc.next();
			System.out.println("������ �Է��ϼ���");
			a[i].money = sc.nextInt();
			System.out.println("��ȭ ��ȣ�� �Է��ϼ���");
			a[i].call = sc.next();
		}
		for (int i = 0; i<a.length; i++)
		{
			for (int j = i+1; j<a.length; j++)
			{
				if(a[j].money > a[i].money) 
				{
					Employee temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.print("�̸�\t�ּ�\t����\t��ȭ��ȣ");
		System.out.println();
		for(int i =0 ; i<a.length; i++)
		{
			System.out.print(a[i].name+"\t"+a[i].dir+"\t"+a[i].money+"\t"+a[i].call);
			System.out.println();
		}
		
	}
}
