/*
	����̶�� Ŭ������ ���� �� ���ϴ�.
	�Ӽ�
			�̸�	 String name
	   ���� �÷�	double left_eye
	 ������ �÷�	double right_eye
			����	int age
	����
		�Դ´�	void eat(String some)
		�޸���	void run(String where)

*/
class People
{
	private String name;
	private double left_eye;
	private double right_eye;
	private int age;
	
	//gettet(������)
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
	
	//setter(������)
	public void setName(String n)
	{
		name=n;
	}
	public void setLeft_eye(double a)
	{
		left_eye = a;
	}
	public void setRight_eye(double b)
	{
		right_eye = b;
	}
	public void setAge(int c)
	{
		age = c;
	}
	
	
	public void eat(String some)
	{
		System.out.println(name+"��(��)"+some+"��(��) �Ծ��");	
	}

	public void run(String where)
	{
		System.out.println(name+"��(��)"+where+"���� �޷���");
	}

}


class  PeopleTest2
{
	public static void main(String[] args) 
	{
		People p1 = new People();
		
		p1.setName("���ǿ�");
		p1.setLeft_eye(0.7);
		p1.setRight_eye(0.7);
		p1.setAge(26);

		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		
		p1.run("���Ǽ� ����");
		p1.run("���� ���͸�");
		p1.eat("��ī��");
		p1.eat("��������");

		People p2 = new People();

		p2.setName("������");
		p2.setLeft_eye(1.5);
		p2.setRight_eye(1.5);
		p2.setAge(26);

		p2.run("�Ѱ�");
		p2.run("�ؿ��");
		p2.eat("�ѿ�");
		p2.eat("��������");


	}
}
