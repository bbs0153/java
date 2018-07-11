class Person
{
	String name;
	int age;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public Person()
	{
		this("홍길동",20); //생성자의 body에서 나 말고 다른 생성자를 동작  //생성자안에서 나 말고 다른 생성자 소환
	
	}
	public String toString()
	{
		return "이름:"+name+",나이:"+age;
	}

	
	

}

class  PersonTest8
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("강감찬",40);
		System.out.println(p1);

		Person p2 = new Person();
		System.out.println(p2);
		
	}
}
