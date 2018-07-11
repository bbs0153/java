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

class  PersonTest4
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("홍길동",20);
		Person p2 = new Person("강감찬",40);
		Person p3 = new Person("이순신",16);
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		



	}
}
