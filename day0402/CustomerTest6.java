class Person
{
	protected String name;
	protected String addr;
	protected String tel;

	public Person(String name, String addr, String tel)
	{
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}
}

class Customer extends Person
{
	private int custno;
	private int milege;

	public Customer()
	{
		//super();//�θ��� �⺻������ �䱸�ϴ� ������ ������; ==> b
		//Person Ŭ������ �Ű������� 3�� ���� �����ڸ� ���� �Ǿ� �ֱ� ������ �ڹٴ� �⺻�����ڸ� �������� �ʰ�
		//b������ super() �� �θ��� �⺻�����ڸ� �䱸�ϴ� ������ �����Ǿ� �ֱ� ������ ������ �߻�
		System.out.println("Customer�� ������ ������");
	}

}

class	CustomerTest6
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();//a
	}
}
 