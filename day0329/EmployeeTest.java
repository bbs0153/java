class Employee
{
	private String name;
	private String call;
	private int money;

	public String getName()
	{
		return name;
	}
	public String getCall()
	{
		return call;
	}
	public int getMoney()
	{
		return money;
	}

	public void setName(String a)
	{
		name = a;
	}
	public void setCall(String b)
	{
		call = b;
	}
	public void setMoney(int c)
	{
		money = c;
	}
}


class  EmployeeTest
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();

		emp.setName("������");
		emp.setCall("01050067286");
		emp.setMoney(100000000);

		System.out.println("�̸� : "+emp.getName());
		System.out.println("��ȭ��ȣ : "+emp.getCall());
		System.out.println("���� : "+emp.getMoney());
	}
}
