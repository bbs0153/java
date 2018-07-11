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
		return "관리번호: "+number+", 제목: "+title+", 저자: "+author;
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
		return super.toString()+", 연체일: "+latefees+", 연체료: "+getLateFees(latefees);
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
		return super.toString()+", 연체일: "+latefees+", 연체료: "+getLateFees(latefees);
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
		return super.toString()+", 연체일: "+latefees+", 연체료: "+getLateFees(latefees);
	}

}


class BookTest 
{
	public static void main(String[] args) 
	{
		Novel n = new Novel("123","선물","기욤뮈소",2);
		Poet p = new Poet("456","파리의 아파트","기욤뮈소",3);
		ScienceFiction s = new ScienceFiction("789","구해줘","기욤뮈소",4);
		
		System.out.println(n);
		System.out.println(p);
		System.out.println(s);
	
	}
}
