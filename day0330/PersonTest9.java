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
		
		System.out.println("������ ������");
		this("ȫ�浿",20);  // �ڿ� �� ������ ����
	}
	
/*C:\�ڹٽ��͵�\day0330>javac PersonTest9.java
PersonTest9.java:15: error: call to this must be first statement in constructor
                this("ȫ�浿",20);
                    ^
1 error*/

	
	
	
	
	
	public String toString()
	{
		return "�̸�:"+name+",����:"+age;
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
