class Person
{
	String name;
	int age;

	public String toString()
	{
		return "이름"+name+",나이:"+age;
	}

}

class  PersonTest14
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();

		System.out.println(p1);

	}
}
