class Person
{
	String name;
	int age;
	
	public Person()
	{
		name = "홍길동";
		age = 20;
	}

	public String toString()
	{
		return "이름:"+name+",나이:"+age;
	}

	
	

}

class  PersonTest3
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();

		System.out.println(p1);

	}
}
