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
class TriangleTest2
{
	public static void main(String[] args) 
	{
		/*
		int n;
		n = 7;
		int age = 8;

		Triangle tri;
		tri = new Triangle();
		
		
		Triangle tri; //객체 잠조 변수를 선언
		tri = new Triangle(); //객체를생성하고 그 객체를 참조 변수가 참조한다.
		*/


		Triangle t = new Triangle();

		t.setWidth(10);
		t.setHeight(10);
		
		System.out.println("밑변 : "+t.getWidth());
		System.out.println("높이 : "+t.getHeight());
		
		System.out.println("삼각형의 넓이 : "+t.getArea());

	}
}
