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
		super("ȫ�浿","����","010-1234-5678");
		System.out.println("Customer�� ������ ������");
	}

}

class	CustomerTest7
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();//a
	}
}
 