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
		return "�̸�:"+name+",����:"+age;
	}

	
	

}

class  PersonTest7
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("ȫ�浿",20);

		System.out.println(p1);

		p1.setName("ȫ����");
		System.out.println(p1);
		
	}
}
