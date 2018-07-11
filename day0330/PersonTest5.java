class Person
{
	String name;
	int age;
	
	public Person(String n, int a)
	{
		name = n;
		age = a;
	}

	public String toString()
	{
		return "이름:"+name+",나이:"+age;
	}

	
	

}

class  PersonTest5
{
	public static void main(String[] args) 
	{
		
		Person p1 = new Person("홍길동",20);

		
		System.out.println(p1);

		



	}
}
