class Person
{
	protected String name;
	protected String addr;
	protected String tel;

	public Person()
	{
		System.out.println("Person�� ������ ������");
	}
}

class Customer extends Person
{
	private int custno;
	private int milege;

	public Customer()
	{
		//super();//�θ��� �⺻������ �䱸�ϴ� ������ ������;
		System.out.println("Customer�� ������ ������");
	}

}

class	CustomerTest5
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();//a
	}
}
 