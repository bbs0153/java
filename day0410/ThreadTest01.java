class Person
{
	String name;

	public Person(String name)
	{
		this.name = name;
	}

	public void sayHello()
	{
		for(int i=1; i<=10000; i++)
		{
			System.out.println("�ȳ� "+name);
		}
	}
}



class  ThreadTest01
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("����ȣ");
		Person p2 = new Person("������");

		p1.sayHello();
		p2.sayHello();
	
	}
}
