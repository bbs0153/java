class Person
{
	String name;
	int age;
	
	public Person(String n, int a)
	{
		name = n;
		age = a;
	}

	public String toString()
	{
		return "�̸�:"+name+",����:"+age;
	}

	
	

}

class  PersonTest4
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("ȫ�浿",20);
		Person p2 = new Person("������",40);
		Person p3 = new Person("�̼���",16);
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		



	}
}
