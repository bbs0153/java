/*
1) Employee Ŭ������ �����϶�. EmployeeŬ������ �̸�, ��� ���� 
������ �ʵ�� ���´�. �����ڸ� �����ϰ� setter, getter�� �ۼ��϶�.
��, ������ ����ϴ� �޼ҵ� computeSalary�� �߻�޼ҷ� ����ϴ�.

2) Employee Ŭ�������� ��ӹ޾Ƽ� SalairedEmployee Ŭ������ ����
�� ����. ��Ŭ������ ȣ�� �ʵ带 �߰��Ѵ�. ȣ���� ���� �޿��� ���
�ϵ��� �Ѵ�.
<ó������>
ȣ��	�⺻��		����
1		1000000	100000	
2		2000000	200000
3		3000000	300000
�޿� = �⺻�� + ����

3) Emloyee Ŭ������ ��ӹ��� HourlyEmployee Ŭ������ �����϶� 
�ð��� �ӱݰ� ���� �ð��� �ʵ�� �߰��Ѵ�. 
�޿� = �ð��� �޿� * ���� �ð�
*/
abstract class Employee
{
	protected String name;
	protected String number;

	protected int a;

	public Employee()
	{}
	public Employee(String name, String number)
	{
		this.name = name;
		this.number = number;
	}

	public String getNumber()
	{
		return number;
	}
	public String getName()
	{
		return name;
	}
	
	
	public void setNumber(String number)
	{
		this.number = number;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public abstract void computeSalary();

	public String toString()
	{
		return "�̸�:"+name+",���:"+number;
	}
}

class SalariedEmployee extends Employee
{
	private int money;

	public SalariedEmployee()
	{}
	public SalariedEmployee(String name, String number, int money)
	{
		super(name,number);
		this.money = money;

		computeSalary();
	}

	public int getMoney()
	{
		return money;
	}
	public void setMoney(int Money)
	{
		this.money = money;
	}

	public void computeSalary()
	{
		if (money==1)
		{
			a = 1000000+100000;
		}
			else if (money==2)
			{
				a = 2000000+200000;
			}
				else if (money==3)
				{
					a = 3000000+300000;
				}
	}
	
	public String toString()
	{
		return super.toString()+", ȣ��:"+money+", �޿�:"+a;
	}
	
}

class HourlyEmployee extends Employee
{
	private int hour;

	public HourlyEmployee()
	{}
	public HourlyEmployee(String name, String number, int hour)
	{
		super(name,number);
		this.hour = hour;

		computeSalary();
	}

	public int getHour()
	{
		return hour;
	}
	public void setHour(int hour)
	{
		this.hour = hour;
	}
	
	public void computeSalary()
	{
		a = 7530*hour;
	}

	public String toString()
	{
		return super.toString()+", ���ѽð�:"+hour+", �޿�:"+a;
	}

}

class EmployeeTest 
{
	public static void main(String[] args) 
	{
		SalariedEmployee s = new SalariedEmployee("������","123456789",1);
		HourlyEmployee h = new HourlyEmployee("������","123456789",3);
		System.out.println(s);
		System.out.println(h);
	}
}
