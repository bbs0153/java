class Person
{
	String name = "홍길동";
	int age = 20;
}

class Student extends Person
{
	String major = "컴퓨터공학";
	int age = 30;
	//부모클래스의 이름과 동일한 이름의 맴버를 갖게 되면
	//부모클래스의 맴버는 무시된다.
	public void info()
	{
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("나이:"+super.age);
		System.out.println("전공:"+major);
	}
}

class  PersonTest2
{
	public static void main(String[] args) 
	{
		Student s = new Student();

		s.info();
	}
}
