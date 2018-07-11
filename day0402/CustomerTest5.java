class Person
{
	protected String name;
	protected String addr;
	protected String tel;

	public Person()
	{
		System.out.println("Person의 생성자 동작함");
	}
}

class Customer extends Person
{
	private int custno;
	private int milege;

	public Customer()
	{
		//super();//부모의 기본생성자 요구하는 문장이 생략됨;
		System.out.println("Customer의 생성자 동작함");
	}

}

class	CustomerTest5
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();//a
	}
}
 