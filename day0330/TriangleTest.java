class Triangle
{
	private double width;
	private double height;
	private double area;

	
	public double getWidth()
	{
		return width;
	}
	public double getHeight()
	{
		return height;
	}
	public double getArea()
	{
		area = width*height/2;
		return area;	
	}
	
	
	public void setWidth(double w)
	{
		width = w;
	}
	public void setHeight(double h)
	{
		height = h;
	}

}
class TriangleTest 
{
	public static void main(String[] args) 
	{
		Triangle t = new Triangle();

		t.setWidth(10);
		t.setHeight(10);
		
		System.out.println("πÿ∫Ø : "+t.getWidth());
		System.out.println("≥Ù¿Ã : "+t.getHeight());
		
		System.out.println("ªÔ∞¢«¸¿« ≥–¿Ã : "+t.getArea());

	}
}
