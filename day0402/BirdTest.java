class Bird
{
	private String name;
	private String color;
	private boolean wing;
	
	public void fly()
	{
		if(wing==true)
		System.out.println(color+"��"+name+"��(��) ��~��~");
		else
		System.out.println(color+"��"+name+"��(��) ���� �����");
		
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
		Bird b1 = new Bird("���ű�","��",true);
		b1.fly();

		Bird b2 = new Bird("��ѱ�","ȸ",false);
		b2.fly();
	}
}
