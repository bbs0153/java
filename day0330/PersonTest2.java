class Person
{
	String name;
	int age;

	public void setName(String n)
	{
		name = n;
	}
	public void setAge(int a)
	{
		age = a;
	}
	
	public String toString()
	{
		return "이름"+name+",나이"+age;
	
	}



}

class  PersonTest2
{
	public static void main(String[] args) 
	{
		Person p1 = new Person(); //reference type ==> 값이 있는 메모리를 참조
		p1.setName("홍길동");
		p1.setAge(20);

		int n = 7; //primitive type ==> 변수 자신이 값을 갖고 있다.

		System.out.println(p1); //어디를 바라보는지 주소값 출력
		System.out.println(n);	//값이 출력
	//	System.out.println(p1.getName());
	//	System.out.println(p1.getAge());

	}
}
