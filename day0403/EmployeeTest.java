/*
1) Employee 클래스를 설계하라. Employee클래스는 이름, 사번 등의 
정보를 필드로 갖는다. 생성자를 정의하고 setter, getter를 작성하라.
또, 월급을 계산하는 메소드 computeSalary를 추상메소로 만듭니다.

2) Employee 클래스에서 상속받아서 SalairedEmployee 클래스를 정의
해 보자. 이클래스는 호봉 필드를 추가한다. 호봉에 따라 급여를 계산
하도록 한다.
<처리조건>
호봉	기본금		수당
1		1000000	100000	
2		2000000	200000
3		3000000	300000
급여 = 기본금 + 수당

3) Emloyee 클래스에 상속받은 HourlyEmployee 클래스를 정의하라 
시간당 임금관 일한 시간을 필드로 추가한다. 
급여 = 시간당 급여 * 일한 시간
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
		return "이름:"+name+",사번:"+number;
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
		return super.toString()+", 호봉:"+money+", 급여:"+a;
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
		return super.toString()+", 일한시간:"+hour+", 급여:"+a;
	}

}

class EmployeeTest 
{
	public static void main(String[] args) 
	{
		SalariedEmployee s = new SalariedEmployee("변성인","123456789",1);
		HourlyEmployee h = new HourlyEmployee("변성인","123456789",3);
		System.out.println(s);
		System.out.println(h);
	}
}
