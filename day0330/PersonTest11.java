class Person
{
	String name;
	int age;
	
	static String addr;

	public static void pro()
	{
		System.out.println("pro�Դϴ�.");
	}
	
	public void info()
	{
		System.out.println("�̸�"+name+",����"+age);
	}

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}

class  PersonTest11
{
	public static void main(String[] args) 
	{
		
		Person.pro();
		
		Person p = new Person("ȫ�浿",20);
		
		p.info();
		p.pro();

	}
}
