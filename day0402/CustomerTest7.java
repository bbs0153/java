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
		super("홍길동","서울","010-1234-5678");
		System.out.println("Customer의 생성자 동작함");
	}

}

class	CustomerTest7
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();//a
	}
}
 