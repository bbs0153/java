class Person
{	
	//��ü �ɹ����� 
	private String name; //��ü���� ������ �޸� Ȯ��
	private int age;
	//��ü �����ÿ� �޸𸮰� Ȯ���Ǿ� ��ü ���������� �����ǰ� �ִ� ���� �����ȴ�.
	//���̻� �������� ������ �޸𸮸� ��ȯ�Ѵ�.
	
	//Ŭ���� ����
	public static String addr = "����"; //���α׷� ��� �ִ� ���ȿ��� ��� �����ȴ�.

	public Person(String name, int age) //�Ű� ����  �� block�ȿ����� ��ȿ�ϴ�.
	{
		this.name = name;
		this.age = age;
	}

	public void pro(String title)
	{
		int year = 2018; // �������� ==> �� �޼ҵ� �ȿ����� ��ȿ
		System.out.println(title);
		System.out.println(year);
		System.out.println(name+","+age+","+addr);  //�޼ҵ� �ȿ��� ����ߴ� �������� �޼ҵ� ������ �Ҹ�ȴ�. �Ű� ���� ����
	}

	public void info()
	{
		//System.out.println(title);
		//System.out.println(year);
		System.out.println(name+","+age+","+addr);
	}


}
class MembervariableTest1
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("ȫ�浿",20);
		Person p2 = new Person("�̼���",30);
		
		p1 = p2;
	}
}
