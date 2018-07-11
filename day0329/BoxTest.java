class Box
{
	private int width; //가로
	private int col; //세로
	private int height; //높이

	
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

	public void calVolume()
	{
		System.out.println("박스의 부피는 : " +(width*col*height));
	}
	
}

class  BoxTest
{
	public static void main(String[] args) 
	{
		Box volume = new Box();

		volume.setWidth(10);
		volume.setCol(10);
		volume.setHeight(10);

		System.out.println(volume.getWidth());
		System.out.println(volume.getCol());
		System.out.println(volume.getHeight());
		
		volume.calVolume();

	}
}
