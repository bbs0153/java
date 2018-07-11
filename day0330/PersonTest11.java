class Person
{
	String name;
	int age;
	
	static String addr;

	public static void pro()
	{
		System.out.println("pro입니다.");
	}
	
	public void info()
	{
		System.out.println("이름"+name+",나이"+age);
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
		
		Person p = new Person("홍길동",20);
		
		p.info();
		p.pro();

	}
}
