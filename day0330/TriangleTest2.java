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
		
		
		Triangle tri; //��ü ���� ������ ����
		tri = new Triangle(); //��ü�������ϰ� �� ��ü�� ���� ������ �����Ѵ�.
		*/


		Triangle t = new Triangle();

		t.setWidth(10);
		t.setHeight(10);
		
		System.out.println("�غ� : "+t.getWidth());
		System.out.println("���� : "+t.getHeight());
		
		System.out.println("�ﰢ���� ���� : "+t.getArea());

	}
}
