class Person
{
	private String name;
	private String addr;
	private String tel;

	public Person()
	{
	}

	public Person(String name, String addr, String tel)
	{
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}
	
	
	public String getTel()
	{
		return tel;
	}
	public String getAddr()
	{
		return addr;
	}
	public String getName()
	{
		return name;
	}
	
	
	public void setTel(String tel)
	{
		this.tel = tel;
	}
	public void setAddr(String addr)
	{
		this.addr = addr;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public String toString()
	{
		return name+","+addr+","+tel;
	}
}

class Customer extends Person
{
	private int custno;
	private int milege;

	public Customer()
	{
	}
	
	public Customer(String name, String addr, String tel, int custno, int milege)
	{
		//부모의 생성자를 콜 //Person생성자 호춯
		super(name,addr,tel);
		this.custno = custno;
		this.milege = milege;
	}

	
	
	
	public int getCustno()
	{
		return custno;
	}
	public int getMilege()
	{
		return milege;
	}
	
	
	public void setCustno(int custno)
	{
		this.custno = custno;
	}
	public void setMilege(int milege)
	{
		this.milege = milege;
	}

	public String toString()
	{
		return name+","+addr()+","+tel()+","+custno+","+milege;     
	}	

/*
아무리 상속받음 자식 클래스라 하더라도 부모클래스의 private 영역에는 접근할 수 없다.
CustomerTest2.java:93: error: name has private access in Person
                return name+","+addr()+","+tel()+","+custno+","+milege;
                       ^
CustomerTest2.java:93: error: cannot find symbol
                return name+","+addr()+","+tel()+","+custno+","+milege;
                                ^
  symbol:   method addr()
  location: class Customer
CustomerTest2.java:93: error: cannot find symbol
                return name+","+addr()+","+tel()+","+custno+","+milege;
                                           ^
  symbol:   method tel()
  location: class Customer
3 errors
*/

}





class	CustomerTest2
{
	public static void main(String[] args) 
	{
		Person p = new Person("송명준","안영","01012345678");
		Customer c = new Customer("조성재","파주","01077777777",1000,10000);

		System.out.println(p);
		System.out.println(c);


	}
}
