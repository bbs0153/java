class Movie
{
	private String movieName;
	private String name;
	private String name1;

	public Movie(String movieName, String name, String name1)
	{
		this.movieName = movieName;
		this.name = name;
		this.name1 = name1;
	}
	public Movie()
	{
		movieName = "����";
		name = "����";
		name1 = "����";
	
	}
	

	public String toString()
	{
		return "����:"+movieName+",����:"+name+",���ۻ�:"+name1;
	}





}

class Movie1 
{
	public static void main(String[] args) 
	{
		Movie p1 = new Movie("��Ʈķ��","������","�����ΰ� ���̵�");
		Movie p2 = new Movie();
		

		System.out.println(p1);
		System.out.println(p2);
	
	
	}
}
