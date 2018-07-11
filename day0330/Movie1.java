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
		movieName = "미정";
		name = "미정";
		name1 = "미정";
	
	}
	

	public String toString()
	{
		return "제목:"+movieName+",감독:"+name+",제작사:"+name1;
	}





}

class Movie1 
{
	public static void main(String[] args) 
	{
		Movie p1 = new Movie("비트캠프","변성인","변성인과 아이들");
		Movie p2 = new Movie();
		

		System.out.println(p1);
		System.out.println(p2);
	
	
	}
}
