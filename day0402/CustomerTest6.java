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
		//super();//부모의 기본생성자 요구하는 문장이 생략됨; ==> b
		//Person 클래스에 매개변수를 3개 갖는 생성자만 정의 되어 있기 때문에 자바는 기본생성자를 정의하지 않고
		//b에서는 super() 즉 부모의 기본생성자를 요구하는 문장이 생략되어 있기 때문에 오류가 발생
		System.out.println("Customer의 생성자 동작함");
	}

}

class	CustomerTest6
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();//a
	}
}
 