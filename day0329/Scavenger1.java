/*
		û�ұ�

�Ӽ�
		�̸�	String
		��ư    String
		����	int

����	���Ƶ��δ� void
	���� ����  void



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
		System.out.println(name+"�� "+a+"��(��) ���Ƶ��̴�.");
	}
	public void length(String b)
	{
		System.out.println(name+"�� ���̸� "+b+" �����Ѵ�.");
	}
}

class  Scavenger1
{
	public static void main(String[] args) 
	{
		Scavenger sca = new Scavenger();
		
		sca.setName("���̽� ����Ŭ��");
		sca.setButton("��");
		sca.setPrice(998990);
		
		sca.absord("������");
		sca.length("����");

	}
}
