class  Person
{
	public void void info()
	{
		System.out.println("����Դϴ�.");
	}

	public static void pro()
	{
		System.out.println("pro�Դϴ�.");
	}

	public static void main(String[] args) 
	{
		Person ob = new Person();
		ob.info();

		Person.pro();
		pro();

	}
}

