class Person
{
	protected String name;
	protected String addr;
	protected String tel;

}

class Customer extends Person
{
	private int custno;
	private int milege;

}

//�θ�Ŭ������ Person�� �ڽ� Ŭ������ Customer�� ����ڰ� ���� �����ڸ� �������� ������
//�⺻�����ڸ� ������. ���� a�� ���� ��ü�� ������ �� ����
class	CustomerTest4
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();//a
	}
}
 