class Person
{
	String name;
	int age;
	
	static String addr;

	public static void pro()
	{
		System.out.println("pro입니다.");
	//	System.out.println("이름"+name);  객체를 생성해야만 사용 할수 있는것을 생성하기도 전에 사용할 수 없다.
	// static 맴버에만 접근 가능
		System.out.println("주소"+addr);
	}
	
	public void info()
	{
		System.out.println("이름"+name+",나이"+age);
		System.out.println("주소"+addr);
	}

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}

class  PersonTest12
{
	public static void main(String[] args) 
	{
		Person.addr = "서울";
		Person.pro();
		Person p = new Person("홍길동",20);
		
		p.info();
		p.pro();

	}
}
