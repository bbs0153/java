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
	String name;
	double left_eye;
	double right_eye;
	int age;

	void eat(String some)
	{
		System.out.println(name+"��(��)"+some+"��(��) �Ծ��");	
	}

	void run(String where)
	{
		System.out.println(name+"��(��)"+where+"���� �޷���");
	}

}


class  PeopleTest
{
	public static void main(String[] args) 
	{
		People p1 = new People();
		
		p1.name = "���ǿ�";
		p1.left_eye = 0.7;
		p1.right_eye = 0.7;
		p1.age = 26;

		p1.run("���Ǽ� ����");
		p1.run("���� ���͸�");
		p1.eat("��ī��");
		p1.eat("��������");

		People p2 = new People();

		p2.name = "������";
		p2.left_eye = 1.5;
		p2.right_eye = 1.5;
		p2.age = 26;

		p2.run("�Ѱ�");
		p2.run("�ؿ��");
		p2.eat("�ѿ�");
		p2.eat("��������");


		

	
	
	
	}
}
