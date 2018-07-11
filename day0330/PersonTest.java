class Person
{
	 String name;
	 int age;

	public void setName(String n)
	{
		name = n;
	}
	public void setAge(int a)
	{
		age = a;
	}
}

class  PersonTest
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.setName("ȫ�浿");
		p1.setAge(20);

		int n = 7;

		System.out.println(p1);
		System.out.println(n);
	//	System.out.println(p1.getName());
	//	System.out.println(p1.getAge());

	}
}
