class Book
{
	private String title;
	private String author;

	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	
	public void setTitle(String a)
	{
		 title=a;
	}
	public void setAuthor(String b)
	{
		 author=b;
	}

}

class  BookTest
{
	public static void main(String[] args) 
	{
		Book java = new Book();
		
		java.setTitle("Great Java");
		java.setAuthor("bob");

		System.out.println("���� : "+java.getTitle());
		System.out.println("���� : "+java.getAuthor());

	}
}
