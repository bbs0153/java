class Person
{
	String name;
	int age;
	
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

class  PersonTest3
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();

		System.out.println(p1);

	}
}
