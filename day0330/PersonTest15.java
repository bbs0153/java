class Person
{
	String name;
	int age;

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public Person()
	{
	
	}
	
	public String toString()
	{
		return "�̸�"+name+",����:"+age;
	}

}

class  PersonTest15
{
	public static void main(String[] args) 
	{
		
		Person p1 = new Person("ȫ�浿",20);
		Person p2 = new Person();
		
		System.out.println(p1);
		System.out.println(p2);

	}
}
