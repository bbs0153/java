/*
		청소기

속성
		이름	String
		버튼    String
		가격	int

동작	빨아들인다 void
	길이 조절  void



*/
class Scavenger
{
	private String name;
	private String button;
	private int price;

	public String getName()
	{
		return name;
	}
	public String getButton()
	{
		return button;
	}
	public int getPrice()
	{
		return price;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	public void setButton(String b)
	{
		button = b;
	}
	public void setPrice(int p)
	{
		price = p;
	}
	
	
	public void absord(String a)
	{
		System.out.println(name+"이 "+a+"을(를) 빨아들이다.");
	}
	public void length(String b)
	{
		System.out.println(name+"이 길이를 "+b+" 조절한다.");
	}
}

class  Scavenger1
{
	public static void main(String[] args) 
	{
		Scavenger sca = new Scavenger();
		
		sca.setName("다이슨 싸이클론");
		sca.setButton("강");
		sca.setPrice(998990);
		
		sca.absord("쓰레기");
		sca.length("높게");

	}
}
