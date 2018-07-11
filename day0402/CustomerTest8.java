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

	public Person()
	{
	}
}

class Customer extends Person
{
	private int custno;
	private int milege;

	public Customer()
	{
		super();
		System.out.println("Customer의 생성자 동작함");
	}

}

class	CustomerTest8
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();//a
	}
}
 