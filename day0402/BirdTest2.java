class Bird
{
	protected String name;
	protected String color;
	protected boolean wing;
	
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
/*
	�����
	�̸�
	����
	����
	����

	����
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
		System.out.println(color+"��"+name+"��(��) �������� ��������");
		else
		System.out.println(color+"��"+name+"��(��) ���� ���ؿ�");
	}

}


class  BirdTest2
{
	public static void main(String[] args) 
	{
		Bird b1 =new Bird("������","��",true);
		Air a1 = new Air("t-50","����",true,true);

		b1.fly();
		a1.fly();
	}
}
