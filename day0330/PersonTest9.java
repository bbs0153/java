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
		
		System.out.println("생성자 동작함");
		this("홍길동",20);  // 뒤에 다 넣으면 오류
	}
	
/*C:\자바스터디\day0330>javac PersonTest9.java
PersonTest9.java:15: error: call to this must be first statement in constructor
                this("홍길동",20);
                    ^
1 error*/

	
	
	
	
	
	public String toString()
	{
		return "이름:"+name+",나이:"+age;
	}

	
	

}

class  PersonTest9
{
	public static void main(String[] args) 
	{

		Person p2 = new Person();
		System.out.println(p2);
		
	}
}
