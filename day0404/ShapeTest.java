import java.util.Scanner;
//모든 도형이 가져야할 고통적인 속성과 기능을 일반화
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

//Shape을 확장하여 이차원도형이 가져야할 공통적인 속성과 기능을 일반화
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

//Shape을 확장하여 삼차원 도형이 가져야할 공통적인 속성과 기능을 일반화
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

//이차원 도형 중에 타원
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

//이차원 도형 중에 사각형
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

//이차원 도형 중에 삼각형
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

//삼차원 도형 중에 구
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

//삼차원 도형 중에 직육면체
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

//삼차원 도형 중에 원기둥
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
			사용자가 어떤 도형을 처리할지 모른다 어떠한 도형이라도 모두 담을수 있도록 하려면
			우리가 만든 클래스 중에 도형의 최상위 클래스 Shape으로 배열을 만들어 두면 무엇이던지 담을 수 있다.
		*/
		Shape []arr;
		int n;

		Scanner sc= new Scanner(System.in);

		System.out.println("도형이 몇개 필요합니까?");
		n = sc.nextInt();
		
		arr = new Shape[n];
		
		double width;
		double lenght;
		double height;
		double radius;
		int x,y;

		for (int i=0; i<n ; i++)
		{
			System.out.println("도형의 종류는 무엇입니까?(1.원 2.사각형 3.삼각형 4.구 5.직육면체 6.원기둥");
			int type = sc.nextInt();
			
			System.out.println("도형의 x 위치?");
			x = sc.nextInt();
			System.out.println("도형의 y 위피?");
			y = sc.nextInt();
			
			switch(type)
			{
				case 1:
					System.out.println("반지름?");
					radius = sc.nextDouble();
					
					arr[i] =new Circle(x,y,radius); 
					break; 
				case 2: 
					System.out.println("가로?");
					width = sc.nextDouble();
					
					System.out.println("세로?");
					height = sc.nextDouble();
					
					arr[i] = new Rectangle(x,y,width,height); 
					break;
				case 3: 
					System.out.println("밑변?");
					width = sc.nextDouble();
					System.out.println("높이?");
					height = sc.nextDouble();
					
					arr[i] = new Triangle(x,y,width,height); 
					break;
				case 4:
					System.out.println("반지름?");
					radius = sc.nextDouble();
					
					arr[i] = new Shpere(x,y,radius);
					break;
				case 5:
					System.out.println("가로?");
					width = sc.nextDouble();
					System.out.println("세로?");
					lenght = sc.nextDouble();
					System.out.println("높이?");
					height = sc.nextDouble();
					
					arr[i] = new Cube(x,y,width,lenght,height);
					break;
				case 6: 
					System.out.println("반지름?");
					radius = sc.nextDouble();
					System.out.println("높이?");
					height = sc.nextDouble();
					
					arr[i] = new Cylinder(x,y,radius,height);
					break;
			}
			
			Shape s = arr[i];
			
			if(s instanceof TwoDimShape)
			{
				System.out.println("면적:"+((TwoDimShape)s).getArea());
			}
				else if (s instanceof ThreeDimShape)
				{
					System.out.println("부피:"+((ThreeDimShape)s).getVolume());
				}
		}
		//도형의 정보를 담아둔 배열의 요소를 하나씩 꺼내와서
		//만약에 그 도형이 2차원 도형이면 면적을 출력하고
		//만약에 그 도형이 3차원 도형이면 부피는 출력하고자 한다.
//		for(int i=0; i<n; i++)
//		{
//			
			//이차원 도형이면 ==> getArea()
			//삼차원 도형이면 ==> getVolume()
			
			//도형이 이차원도형인지 판별
			//is a 관계에 있는지 판별
			//instanceof 연산자를 이용
			
			
		

	}
}
