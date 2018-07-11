class Person
{
	String name;
	int age;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setName(String name)
	{
		this.naem = name;
	}

	public String toString()
	{
		return "이름:"+name+",나이:"+age;
	}

	
	

}

class  PersonTest7
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("홍길동",20);

		System.out.println(p1);

		p1.setName("홍감찬");
		System.out.println(p1);
		
	}
}
