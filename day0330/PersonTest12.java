class Person
{
	String name;
	int age;
	
	static String addr;

	public static void pro()
	{
		System.out.println("pro�Դϴ�.");
	//	System.out.println("�̸�"+name);  ��ü�� �����ؾ߸� ��� �Ҽ� �ִ°��� �����ϱ⵵ ���� ����� �� ����.
	// static �ɹ����� ���� ����
		System.out.println("�ּ�"+addr);
	}
	
	public void info()
	{
		System.out.println("�̸�"+name+",����"+age);
		System.out.println("�ּ�"+addr);
	}

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}

class  PersonTest12
{
	public static void main(String[] args) 
	{
		Person.addr = "����";
		Person.pro();
		Person p = new Person("ȫ�浿",20);
		
		p.info();
		p.pro();

	}
}
