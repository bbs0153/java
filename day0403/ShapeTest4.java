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
		return "x:"+x+",y:"+y+",둘레:"+round+",면적:"+area;
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
		return super.toString()+",반지름:"+radius;
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
		return super.toString()+"가로:"+width+"세로:"+height;
	}
}

class  ShapeTest4
{
	public static void main(String[] args) 
	{
		Shape s[]; //Circle도 담고 Rect도 담을 수 있도로 Circle과 Rect의 부모인 Shape으로 배열을 만든다.
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("몇개의 도형을 처리합니까?");
		n = sc.nextInt(); //3

		s = new Shape[n]; //Shape자료형의 변수 를 만드는것
		
		for (int i=0; i<n ; i++)
		{
			System.out.println("도형의 종류?(1.원 2.사각형)");
			int type = sc.nextInt();

			System.out.println("도형의 x?");
			int x = sc.nextInt();
			System.out.println("도형의 y?");
			int y = sc.nextInt();
			
				switch(type)
				{
					case 1:
						double radius;
						
						System.out.println("원의 반지름:");
						radius = sc.nextDouble();
						
						s[i] = new Circle(x,y,radius);
						break;

					case 2:
						double width;
						double height;
						
						System.out.println("가로?");
						width = sc.nextDouble();
						System.out.println("세로?");
						height = sc.nextDouble();
						
						s[i] = new Rect(x,y,width,height);
						break;
				}
		}
		System.out.println("*** 도형의 정보 ***");
		for(Shape j : s)
		{
			System.out.println(j);
		}
	}
}
/*
	다음의 프로그램을 처리하려면 배열의 자료형은 무엇이 좋을까?
	즉 Circle도 담을 수 있고 Rect도 담을 수 있으려면 뭐가 되면 좋을까?

	==> Shape 으로 만들면 되겠다.
	
	몇개의 도형을 처리합니까? 5

	첫번째 도형의 종류는 무엇입니까?(1.원 2,사각형)? 2

	도형의 x위치? 10
	도형의 y위치? 10
	가로길이?100
	세로길이?50

	두번째 종류는 무엇입니까?(1.원 2.사각형)? 2

	도형의 x위치? 10
	도형의 y위치? 70
	가로길이?100
	세로길이?50
	.
	.
	.
	.
	다섯번째 도형의 종류는 무엇입니까?(1.원 2.사각형)? 1
	도형의 x위치?10
	도형의 y위치?300
	반지름?5

	**입력한 도형의 종류는 다음과 같습니다**
	x:10 y:10 가로:_세로:_둘레:_면적:_
	.
	.
	x:10 y:10 가로:_세로:_둘레:_면적:_




*/