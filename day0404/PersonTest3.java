class Person
{
	public void title()
	{
		System.out.println("Person");
	}

	public void info()
	{
		System.out.println("���");
	}
}

class Student extends Person
{
	public void info()
	{
		System.out.println("�л�");
	}
	
	public void pro()
	{
		title();
		super.info();
		info();

	}
}

class  PersonTest3
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.pro();
	}
}
