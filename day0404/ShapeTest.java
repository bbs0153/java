import java.util.Scanner;
//��� ������ �������� �������� �Ӽ��� ����� �Ϲ�ȭ
abstract class Shape
{	
	protected int x;
	protected int y;

	public Shape()
	{}
	public Shape(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

//Shape�� Ȯ���Ͽ� ������������ �������� �������� �Ӽ��� ����� �Ϲ�ȭ
abstract class TwoDimShape extends Shape
{
	protected double area;

	public abstract double getArea();

	public TwoDimShape()
	{}
	public TwoDimShape(int x, int y)
	{
		super(x,y);
	}
}

//Shape�� Ȯ���Ͽ� ������ ������ �������� �������� �Ӽ��� ����� �Ϲ�ȭ
abstract class ThreeDimShape extends Shape
{
	protected double volume;

	public abstract double getVolume();

	public ThreeDimShape()
	{}
	public ThreeDimShape(int x, int y)
	{
		super(x,y);
	}
}

//������ ���� �߿� Ÿ��
class Circle extends TwoDimShape
{
	private double radius;
	
	public Circle()
	{}
	public Circle(int x, int y, double radius)
	{
		super(x,y);
		this.radius = radius;
	}

	public double getArea()
	{
		area = 3.14*(radius*2);
		return area; 
	}
}

//������ ���� �߿� �簢��
class Rectangle extends TwoDimShape
{
	private double width;
	private double height;
	
	public Rectangle()
	{}
	public Rectangle(int x, int y, double width, double height)
	{
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	public double getArea()
	{
		area = width*height;
		return area;
	}
}

//������ ���� �߿� �ﰢ��
class Triangle extends TwoDimShape
{
	private double width;
	private double height;
	
	public Triangle()
	{}
	public Triangle(int x, int y, double width, double height )
	{
		super(x,y);
		this.width = width;
		this.height = height;
	}

	public double getArea()
	{
		area = (width*height)/2;
		return area;
	}
}

//������ ���� �߿� ��
class Shpere extends ThreeDimShape
{
	private double radius;

	public Shpere()
	{}
	public Shpere(int x, int y, double radius)
	{
		super(x,y);
		this.radius = radius;
	}
	
	public double getVolume()
	{
		volume = 4.0/3.0*3.14*(radius*radius*radius);
		return volume;
	}
}

//������ ���� �߿� ������ü
class Cube extends ThreeDimShape
{
	private double width;
	private double lenght;
	private double height;

	public Cube()
	{}
	public Cube(int x, int y, double width, double lenght, double height)
	{
		super(x,y);
		this.width = width;
		this.lenght = lenght;
		this.height = height;
	}
	
	public double getVolume()
	{
		volume = width*lenght*height;
		return volume;
	}
}

//������ ���� �߿� �����
class Cylinder extends ThreeDimShape
{
	private double radius;
	private double height;

	public Cylinder()
	{}
	public Cylinder(int x, int y, double radius, double height)
	{
		super(x,y);
		this.radius = radius;
		this.height = height;
	}

	public double getVolume()
	{
		volume = 3.14*(radius*radius)*height;
		return volume;
	}
}


class ShapeTest 
{
	public static void main(String[] args) 
	{
		/*
			����ڰ� � ������ ó������ �𸥴� ��� �����̶� ��� ������ �ֵ��� �Ϸ���
			�츮�� ���� Ŭ���� �߿� ������ �ֻ��� Ŭ���� Shape���� �迭�� ����� �θ� �����̴��� ���� �� �ִ�.
		*/
		Shape []arr;
		int n;

		Scanner sc= new Scanner(System.in);

		System.out.println("������ � �ʿ��մϱ�?");
		n = sc.nextInt();
		
		arr = new Shape[n];
		
		double width;
		double lenght;
		double height;
		double radius;
		int x,y;

		for (int i=0; i<n ; i++)
		{
			System.out.println("������ ������ �����Դϱ�?(1.�� 2.�簢�� 3.�ﰢ�� 4.�� 5.������ü 6.�����");
			int type = sc.nextInt();
			
			System.out.println("������ x ��ġ?");
			x = sc.nextInt();
			System.out.println("������ y ����?");
			y = sc.nextInt();
			
			switch(type)
			{
				case 1:
					System.out.println("������?");
					radius = sc.nextDouble();
					
					arr[i] =new Circle(x,y,radius); 
					break; 
				case 2: 
					System.out.println("����?");
					width = sc.nextDouble();
					
					System.out.println("����?");
					height = sc.nextDouble();
					
					arr[i] = new Rectangle(x,y,width,height); 
					break;
				case 3: 
					System.out.println("�غ�?");
					width = sc.nextDouble();
					System.out.println("����?");
					height = sc.nextDouble();
					
					arr[i] = new Triangle(x,y,width,height); 
					break;
				case 4:
					System.out.println("������?");
					radius = sc.nextDouble();
					
					arr[i] = new Shpere(x,y,radius);
					break;
				case 5:
					System.out.println("����?");
					width = sc.nextDouble();
					System.out.println("����?");
					lenght = sc.nextDouble();
					System.out.println("����?");
					height = sc.nextDouble();
					
					arr[i] = new Cube(x,y,width,lenght,height);
					break;
				case 6: 
					System.out.println("������?");
					radius = sc.nextDouble();
					System.out.println("����?");
					height = sc.nextDouble();
					
					arr[i] = new Cylinder(x,y,radius,height);
					break;
			}
			
			Shape s = arr[i];
			
			if(s instanceof TwoDimShape)
			{
				System.out.println("����:"+((TwoDimShape)s).getArea());
			}
				else if (s instanceof ThreeDimShape)
				{
					System.out.println("����:"+((ThreeDimShape)s).getVolume());
				}
		}
		//������ ������ ��Ƶ� �迭�� ��Ҹ� �ϳ��� �����ͼ�
		//���࿡ �� ������ 2���� �����̸� ������ ����ϰ�
		//���࿡ �� ������ 3���� �����̸� ���Ǵ� ����ϰ��� �Ѵ�.
//		for(int i=0; i<n; i++)
//		{
//			
			//������ �����̸� ==> getArea()
			//������ �����̸� ==> getVolume()
			
			//������ �������������� �Ǻ�
			//is a ���迡 �ִ��� �Ǻ�
			//instanceof �����ڸ� �̿�
			
			
		

	}
}
