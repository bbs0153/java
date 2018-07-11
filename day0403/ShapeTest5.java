//모든 그릴수 있는 것들에 대한 정의
interface Drawble
{
	public void draw();
}

//앞으로 만들어질 이차원도형(원,삼각형,사각형...)
//들이 가져야할 공통적인 속성과 동작을 뽑아서 Shape이라는 클래스로 일반화
abstract class Shape
{
	protected int x;	//도형의 x좌표
	protected int y;	//도형의 y좌표
	
	protected double round;	//둘레
	protected double area;	//면적

	//기본생성자
	public Shape()
	{}
	//매개변수를 갖는 생성자
	public Shape(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	//모든 2차원 도형들은 둘레를 계산하는 기능이 필요해
	//그러나 이시점(일반화 시점)에서는 body를 구체화 할 수 없다. 그냥 내버려둔다
	//==> 후손들한테 알려주는 의미      자유를 준다(overriding 해도되고 안해도된다.)
	/*public void calacRound() //둘레계산메소드
	{
	}
	public void calacArea()	//면적계산메소드
	{
	}*/
	
	//자식클래스들이 반드시 재정의 해야하는 책임 부여
	public abstract void calacRound();	//둘레계산메소드//추상메소드
	public abstract void calacArea();	//면적계산메소드//추상메소드


	public String toString()
	{
		return "x:"+x+",y:"+y+",둘레:"+round+",면적:"+area;
	}
}	

class Circle extends Shape implements Drawble //원
{
	private double radius; //반지름

	//기본생성자
	public Circle()
	{}
	//매개변수를 갖는 생성자
	public Circle(int x, int y, double radius)
	{
		super(x,y);
		this.radius = radius;
	
		calacRound();
		calacArea();
	}

	public void draw()
	{
		System.out.println("원을 그립니다.");
	}
	//부모로 부터 물려받은 기능(clacRound,clacArea)를 나한테 맞게 다시 정의 ==> method overriding
	//다시 정의 할때는 메소드이름뿐만 아니라 매개변수의 개수와 자료형까지 일치되게 재정의
	public void calacRound()	//원 둘례 계산 메소드
	{
		round = 2*3.14*radius;
	}
	public void calacArea()	//원 면적 계산 메소드
	{
		area = 3.14*radius*radius;
	}
	
	public String toString()
	{
		return super.toString()+",반지름:"+radius;
	}
}

class Rect extends Shape implements Drawble//사각형
{
	private double width;
	private double height;

	//기본생성자
	public Rect()
	{}
	//매개변수를 갖는 생성자
	public Rect(int x, int y, double width, double height)
	{
		super(x,y);
		this.width = width;
		this.height = height;
		
		calacRound();
		calacArea();
		
	}
	public void draw()
	{
		System.out.println("사각형을 그립니다.");
	}

	public void calacRound()	//사각형 둘례 계산 메소드
	{
		round = (width + height) * 2;
	}
	public void calacArea()	//사각형 면적 계산 메소드
	{
		area = width * height;
	}

	public String toString()
	{
		return super.toString()+"가로:"+width+"세로:"+height;
	}
}

class  ShapeTest5
{
	public static void main(String[] args) 
	{
		//2차원 도형 원과 사각형 객체를 생성
		Circle c = new Circle(10,10,3.5);
		Rect r = new Rect(10,20,5,7);

		c.draw();
		r.draw();
	}
}
