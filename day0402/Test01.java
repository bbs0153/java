class A
{	
	//private String title = "hello";
	protected String title = "hello";
	public int year = 2018;
	
	public void pro()
	{
		System.out.println("pro�Դϴ�.");
	}
	
	public void info()
	{
		System.out.println(title+","+year);
	}
}

class B extends A
{
	private String addr = "�ż���";
	
	public void info()
	{
		System.out.println(title+","+year+","+addr);
	}

	
}
class Test01 
{
	public static void main(String[] args) 
	{
		B ob = new B();
		
		ob.pro();
		ob.info();

	}
}
