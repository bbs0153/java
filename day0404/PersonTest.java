class Person
{
	String name;

	public Person(String name)
	{
		this.name = name;
	}

	public Person()
	{
		this("ȫ�浿");
	}
}
class  PersonTest
{
	public static void main(String[] args) 
	{
		Person p = new Person("������");
		Person p2 = new Person();

		System.out.println(p);
		System.out.println(p2);
	}
}
