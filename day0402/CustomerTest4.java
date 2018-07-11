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

//부모클래스인 Person과 자식 클래스인 Customer에 사용자가 따로 생성자를 정의하지 않으면
//기본생성자를 제공함. 따라서 a와 같이 객체를 생성할 수 있음
class	CustomerTest4
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();//a
	}
}
 