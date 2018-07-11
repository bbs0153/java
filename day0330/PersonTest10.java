class Person
{
	String name;
	int age;
	
	static String addr;

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}

class  PersonTest10
{
	public static void main(String[] args) 
	{
		
		Person.addr = "서울시 마포구 신수동"; 
	  	System.out.println(Person.addr);
		
		Person p1 = new Person("홍길동",20);
		Person p2 = new Person("김유신",40);

		System.out.println(p1.addr);
		System.out.println(p2.addr);

		p2.addr = "제주도 서귀포시";

		System.out.println(p1.name+","+p1.addr);
		System.out.println(p2.name+","+p2.addr);
		
	}
}
