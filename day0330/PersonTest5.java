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

class  PersonTest5
{
	public static void main(String[] args) 
	{
		
		Person p1 = new Person("ȫ�浿",20);

		
		System.out.println(p1);

		



	}
}
