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
		return "이름"+name+",나이:"+age;
	}

}

class  PersonTest15
{
	public static void main(String[] args) 
	{
		
		Person p1 = new Person("홍길동",20);
		Person p2 = new Person();
		
		System.out.println(p1);
		System.out.println(p2);

	}
}
