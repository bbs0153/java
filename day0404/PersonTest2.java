class Person
{
	String name = "ȫ�浿";
	int age = 20;
}

class Student extends Person
{
	String major = "��ǻ�Ͱ���";
	int age = 30;
	//�θ�Ŭ������ �̸��� ������ �̸��� �ɹ��� ���� �Ǹ�
	//�θ�Ŭ������ �ɹ��� ���õȴ�.
	public void info()
	{
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
		System.out.println("����:"+super.age);
		System.out.println("����:"+major);
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
