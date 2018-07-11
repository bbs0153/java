class Human
{
	protected String name;
	protected int age;

	public Human()
	{
	}
	public Human(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setName(String name)
	{
		this.name = name;	
	}

	public String toString()
	{
		return name+","+age;
	}

}

class Student extends Human
{
	String major;

	public Student()
	{
	}
	public Student(String name, int age, String major)
	{
		super(name,age);
		this.major = major;
	}

	public String getMajor()
	{
		return major;
	}
	public void setMajor(String major)
	{
		this.major = major;
	}

	public String toString()
	{
		return super.toString()+major;
	}

}

class HumanTest 
{
	public static void main(String[] args) 
	{
		Student a1 = new Student("ÃáÇâ",18,"ÄÄÇ»ÅÍ");
		Student a2 = new Student("¸ù·æ",21,"°æ¿µ");
		Student a3 = new Student("»ç¶Ç",50,"°æÁ¦");

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}
}
