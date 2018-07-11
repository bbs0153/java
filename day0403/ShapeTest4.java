import java.util.*;
abstract class Shape
{
	protected int x;	
	protected int y;	
	
	protected double round;	
	protected double area;	

	public Shape()
	{}
	public Shape(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public abstract void calacRound();	
	public abstract void calacArea();	


	public String toString()
	{
		return "x:"+x+",y:"+y+",�ѷ�:"+round+",����:"+area;
	}
}	

class Circle extends Shape
{
	private double radius;

	public Circle()
	{}
	public Circle(int x, int y, double radius)
	{
		super(x,y);
		this.radius = radius;
	
		calacRound();
		calacArea();
	}
	
	public void calacRound()	
	{
		round = 2*3.14*radius;
	}
	public void calacArea()	
	{
		area = 3.14*radius*radius;
	}
	
	public String toString()
	{
		return super.toString()+",������:"+radius;
	}
}

class Rect extends Shape 
{
	private double width;
	private double height;

	public Rect()
	{}
	public Rect(int x, int y, double width, double height)
	{
		super(x,y);
		this.width = width;
		this.height = height;
		
		calacRound();
		calacArea();
		
	}

	public void calacRound()	
	{
		round = (width + height) * 2;
	}
	public void calacArea()	
	{
		area = width * height;
	}

	public String toString()
	{
		return super.toString()+"����:"+width+"����:"+height;
	}
}

class  ShapeTest4
{
	public static void main(String[] args) 
	{
		Shape s[]; //Circle�� ��� Rect�� ���� �� �ֵ��� Circle�� Rect�� �θ��� Shape���� �迭�� �����.
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("��� ������ ó���մϱ�?");
		n = sc.nextInt(); //3

		s = new Shape[n]; //Shape�ڷ����� ���� �� ����°�
		
		for (int i=0; i<n ; i++)
		{
			System.out.println("������ ����?(1.�� 2.�簢��)");
			int type = sc.nextInt();

			System.out.println("������ x?");
			int x = sc.nextInt();
			System.out.println("������ y?");
			int y = sc.nextInt();
			
				switch(type)
				{
					case 1:
						double radius;
						
						System.out.println("���� ������:");
						radius = sc.nextDouble();
						
						s[i] = new Circle(x,y,radius);
						break;

					case 2:
						double width;
						double height;
						
						System.out.println("����?");
						width = sc.nextDouble();
						System.out.println("����?");
						height = sc.nextDouble();
						
						s[i] = new Rect(x,y,width,height);
						break;
				}
		}
		System.out.println("*** ������ ���� ***");
		for(Shape j : s)
		{
			System.out.println(j);
		}
	}
}
/*
	������ ���α׷��� ó���Ϸ��� �迭�� �ڷ����� ������ ������?
	�� Circle�� ���� �� �ְ� Rect�� ���� �� �������� ���� �Ǹ� ������?

	==> Shape ���� ����� �ǰڴ�.
	
	��� ������ ó���մϱ�? 5

	ù��° ������ ������ �����Դϱ�?(1.�� 2,�簢��)? 2

	������ x��ġ? 10
	������ y��ġ? 10
	���α���?100
	���α���?50

	�ι�° ������ �����Դϱ�?(1.�� 2.�簢��)? 2

	������ x��ġ? 10
	������ y��ġ? 70
	���α���?100
	���α���?50
	.
	.
	.
	.
	�ټ���° ������ ������ �����Դϱ�?(1.�� 2.�簢��)? 1
	������ x��ġ?10
	������ y��ġ?300
	������?5

	**�Է��� ������ ������ ������ �����ϴ�**
	x:10 y:10 ����:_����:_�ѷ�:_����:_
	.
	.
	x:10 y:10 ����:_����:_�ѷ�:_����:_




*/