class Book
{
	protected String name;
	protected int page;
	protected String pro;

	public Book()
	{
	}
	public Book(String name, int page, String pro)
	{
		this.name = name;
		this.page = page;
		this.pro = pro;
	}

	public String getPro()
	{
		return pro;
	}
	public int getPage()
	{
		return page;
	}
	public String getName()
	{
		return name;
	}
	
	public void setPro(String pro)
	{
		this.pro = pro;
	}
	public void setpage(int page)
	{
		this.page = page;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public String toString()
	{
		return "����: "+name+", ��������: "+page+", ����: "+pro;
	}



}


class Magazine extends Book
{
	private int day;

	public Magazine()
	{
	}
	public Magazine(String name, int page, String pro, int day)
	{
		super(name,page,pro);
		this.day = day;
	}

	public int getDay()
	{
		return day;
	}
	public void setDay(int day)
	{
		this.day = day;
	}

	public String toString()
	{
		return super.toString()+", �߸���: "+day;
	}

}


class  BookTest
{
	public static void main(String[] args) 
	{
		Book p1 = new Book("������",469,"������");
		Magazine p2 = new Magazine("����",500,"������",20180425);

		System.out.println(p1);
		System.out.println(p2);
	}
}
