class Plane
{
	private String name;
	private String model;
	private int a;
	static int planes; //

	public String getName()
	{
		return name;
	}
	public String getModel()
	{
		return model;
	}
	public int getA()
	{
		return a;
	}
	public static int getPlanes()
	{
		return planes;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public void setA(int a)
	{
		this.a = a;
	}

	
	public Plane(String name, String model, int a)
	{
		this.name = name;
		this.model = model;
		this.a = a;
		planes = planes+1;
	}
	
	public Plane()
	{
		
		this("KAI","����747",524);
		
		//name = "KAI";
		//model = "����747";
		//a = 524;
		//planes = planes+1;
	}

	public String toString()
	{
		return "���ۻ�: "+name+"\t��: "+model+"\t�ִ� �°���: "+a;
	}
	
}


class  PlaneTest
{
	public static void main(String[] args) 
	{ 

		Plane p1 = new Plane("����","����400",500);
		Plane p2 = new Plane();

		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("����� ����: "+Plane.getPlanes());
	}
}
