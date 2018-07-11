class Person
{
	String name;
	int age;
	
	public Person(String n, int a)
	{
		name = n;
		age = a;
	}
	public Person(String n)
	{
		name = n;
		age = 20;
	}
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

class  PersonTest6
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("홍길동",20);
		Person p2 = new Person("강감찬",40);
		Person p3 = new Person("이순신");
		Person p4 = new Person();
	
		System.out.println(p1);
		System.out.println(p2);
		

		



	}
}
