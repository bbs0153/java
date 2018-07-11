class Bird
{
	private String name;
	private String color;
	private boolean wing;
	
	public void fly()
	{
		if(wing==true)
		System.out.println(color+"색"+name+"이(가) 훨~훨~");
		else
		System.out.println(color+"색"+name+"이(가) 날수 없어요");
		
	}
	
	public Bird(String name, String color, boolean wing)
	{
		this.name = name;
		this.color = color;
		this.wing = wing;
	}

}
class  BirdTest
{
	public static void main(String[] args) 
	{
		Bird b1 = new Bird("갈매기","흰",true);
		b1.fly();

		Bird b2 = new Bird("비둘기","회",false);
		b2.fly();
	}
}
