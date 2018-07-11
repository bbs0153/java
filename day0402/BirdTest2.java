class Bird
{
	protected String name;
	protected String color;
	protected boolean wing;
	
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
/*
	비행기
	이름
	색상
	날개
	엔진

	난다
*/
class Air extends Bird
{
	protected boolean en;

	public Air(String name, String color, boolean wing, boolean en)
	{
		super(name,color,wing);
		this.en = en;
	}

	public void fly()
	{
		if(wing==true||en==true)
		System.out.println(color+"색"+name+"이(가) 씨이이융 씨이이융");
		else
		System.out.println(color+"색"+name+"이(가) 날지 못해요");
	}

}


class  BirdTest2
{
	public static void main(String[] args) 
	{
		Bird b1 =new Bird("독수리","흰",true);
		Air a1 = new Air("t-50","검은",true,true);

		b1.fly();
		a1.fly();
	}
}
