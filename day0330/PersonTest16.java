class Person
{
	String name;
	int age;
	double height;
	boolean isStudent;

	static String addr;
	static int cnt;
}

class  PersonTest16
{
	public static void main(String[] args) 
	{
		System.out.println(Person.addr);
		System.out.println(Person.cnt);

		
		Person p1 = new Person();
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.height);
		System.out.println(p1.isStudent);

	}
}
