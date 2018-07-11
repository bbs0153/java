class Person
{
	String name;
	int age;

	public Person()
	{
		name = null;
		age = 0;
	}
	public String toString()
	{
		return "이름"+name+",나이:"+age;
	}

}

class  PersonTest13
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();

		System.out.println(p1);

	}
}
