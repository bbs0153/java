class Person
{
	String name;
	int age;
	
	public Person(String n, int a)
	{
		name = n;
		age = a;
	}
	public Person(String n)
	{
		name = n;
		age = 20;
	}
	public Person()
	{
		name = "ȫ�浿";
		age = 20;
	}

	public String toString()
	{
		return "�̸�:"+name+",����:"+age;
	}

	
	

}

class  PersonTest6
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("ȫ�浿",20);
		Person p2 = new Person("������",40);
		Person p3 = new Person("�̼���");
		Person p4 = new Person();
	
		System.out.println(p1);
		System.out.println(p2);
		

		



	}
}
