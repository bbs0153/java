class Box
{
	private int width; //����
	private int col; //����
	private int height; //����
	private int volume; //����

	//���� box�� �Ӽ� ������ ���ڿ��� ��ȯ
	// ���� : 5 ���� : 6 ���� : 3 ���� : 

	public String toString()
	{
		String str;
		str = "����:"+width+",����:"+col+",����:"+height+",����:"+volume;
		return str;
	}
	
	
	public int getWidth()
	{
		return width;
	}
	public int getCol()
	{
		return col;
	}
	public int getHeight()
	{
		return height;
	}
	public int getVolume()
	{
		volume = width*col*height;
		return volume;
	}
	
	
	public void setWidth(int a)
	{
		width = a;
	}
	public void setCol(int b)
	{
		col = b;
	}
	public void setHeight(int c)
	{
		height = c;
	}

	
	
}


class  BoxTest1
{
	public static void main(String[] args) 
	{
		Box box1;
		box1 = new Box();

		box1.setWidth(100);
		box1.setCol(100);
		box1.setHeight(100);

		System.out.println(box1.getVolume());
		System.out.println(box1);
		//��¹��� ��ü ���������� ����
		//�� Ŭ������ toString() �޼ҵ尡 �ڵ����� ȣ��ȴ�.


		System.out.println(box1.toString());

		Box box2;
		box2 = new Box();
		
		box2.setWidth(200);
		box2.setCol(200);
		box2.setHeight(200);

		box1 = box2;

		System.out.println(box1);

	}
}
