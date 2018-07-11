class Book
{
	protected String number;
	protected String title;
	protected String author;

	protected int latefees;
	
	public Book()
	{}
	public Book(String number, String title, String author,int latefees)
	{
		this.number = number;
		this.title = title;
		this.author = author;
		this.latefees = latefees;
	}

	public String getAuthor()
	{
		return author;
	}
	public String getTitle()
	{	
		return title;
	}
	public String getNumber()
	{
		return number;
	}
	public int getLatefees()
	{
		return latefees;
	}
	
	
	public void setLatefees(int latefees)
	{
		this.latefees = latefees;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public void setTitle(String title)
	{	
		this.title = title;
	}
	public void setNumber(String number)
	{
		this.number = number;
	}

	public String toString()
	{
		return "������ȣ: "+number+", ����: "+title+", ����: "+author;
	}
}


class Novel extends Book
{
	
	public Novel()
	{}
	public Novel(String number, String title, String author, int latefees)
	{
		super(number,title,author,latefees);
		
	}
	
	
	public int getLateFees(int latefees)
	{
		return latefees*300;
	}

	
	
	public String toString()
	{
		return super.toString()+", ��ü��: "+latefees+", ��ü��: "+getLateFees(latefees);
	}

}


class Poet extends Book
{
	public Poet()
	{}
	public Poet(String number, String title, String author, int latefees)
	{
		super(number,title,author,latefees);
	}
	
	
	public int getLateFees(int latefees)
	{
		return latefees*200;
	}

	
	
	public String toString()
	{
		return super.toString()+", ��ü��: "+latefees+", ��ü��: "+getLateFees(latefees);
	}

}


class ScienceFiction extends Book
{
	public ScienceFiction()
	{}
	public ScienceFiction(String number, String title, String author,int latefees)
	{
		super(number,title,author,latefees);
	}
	
	
	public int getLateFees(int latefees)
	{
		return latefees*600;
	}

	
	
	public String toString()
	{
		return super.toString()+", ��ü��: "+latefees+", ��ü��: "+getLateFees(latefees);
	}

}


class BookTest 
{
	public static void main(String[] args) 
	{
		Novel n = new Novel("123","����","��蹿��",2);
		Poet p = new Poet("456","�ĸ��� ����Ʈ","��蹿��",3);
		ScienceFiction s = new ScienceFiction("789","������","��蹿��",4);
		
		System.out.println(n);
		System.out.println(p);
		System.out.println(s);
	
	}
}
