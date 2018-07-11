class  Person
{
	public void void info()
	{
		System.out.println("사람입니다.");
	}

	public static void pro()
	{
		System.out.println("pro입니다.");
	}

	public static void main(String[] args) 
	{
		Person ob = new Person();
		ob.info();

		Person.pro();
		pro();

	}
}

