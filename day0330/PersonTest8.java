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
		this("ȫ�浿",20); //�������� body���� �� ���� �ٸ� �����ڸ� ����  //�����ھȿ��� �� ���� �ٸ� ������ ��ȯ
	
	}
	public String toString()
	{
		return "�̸�:"+name+",����:"+age;
	}

	
	

}

class  PersonTest8
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("������",40);
		System.out.println(p1);

		Person p2 = new Person();
		System.out.println(p2);
		
	}
}
