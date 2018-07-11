class Rectangle
{
	private int width;
	private int length;

	public int getWidth()
	{
		return width;
	}
	public int getLength()
	{
		return length;
	}
	
	public void setWidth(int a)
	{
		width = a;
	}

	public void setLength(int b)
	{
		length = b;
	}

	public int calcArea()
	{
		int cal  = width*length;
		return cal;
	}

}

class  RectangleTest
{
	public static void main(String[] args) 
	{
		Rectangle a = new Rectangle();

		a.setWidth(10);
		a.setLength(20);

		System.out.println(a.getWidth());
		System.out.println(a.getLength());
		
		System.out.println("사각형의 넓이 : " +a.calcArea());
		
	}
}
