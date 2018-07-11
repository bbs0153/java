//������ ������� ����������(��,�ﰢ��,�簢��...)
//���� �������� �������� �Ӽ��� ������ �̾Ƽ� Shape�̶�� Ŭ������ �Ϲ�ȭ
abstract class Shape
{
	protected int x;	//������ x��ǥ
	protected int y;	//������ y��ǥ
	
	protected double round;	//�ѷ�
	protected double area;	//����

	//�⺻������
	public Shape()
	{}
	//�Ű������� ���� ������
	public Shape(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	//��� 2���� �������� �ѷ��� ����ϴ� ����� �ʿ���
	//�׷��� �̽���(�Ϲ�ȭ ����)������ body�� ��üȭ �� �� ����. �׳� �������д�
	//==> �ļյ����� �˷��ִ� �ǹ�      ������ �ش�(overriding �ص��ǰ� ���ص��ȴ�.)
	/*public void calacRound() //�ѷ����޼ҵ�
	{
	}
	public void calacArea()	//�������޼ҵ�
	{
	}*/
	
	//�ڽ�Ŭ�������� �ݵ�� ������ �ؾ��ϴ� å�� �ο�
	public abstract void calacRound();	//�ѷ����޼ҵ�//�߻�޼ҵ�
	public abstract void calacArea();	//�������޼ҵ�//�߻�޼ҵ�


	public String toString()
	{
		return "x:"+x+",y:"+y+",�ѷ�:"+round+",����:"+area;
	}
}	

class Circle extends Shape //��
{
	private double radius; //������

	//�⺻������
	public Circle()
	{}
	//�Ű������� ���� ������
	public Circle(int x, int y, double radius)
	{
		super(x,y);
		this.radius = radius;
	
		calacRound();
		calacArea();
	}
	//�θ�� ���� �������� ���(clacRound,clacArea)�� ������ �°� �ٽ� ���� ==> method overriding
	//�ٽ� ���� �Ҷ��� �޼ҵ��̸��Ӹ� �ƴ϶� �Ű������� ������ �ڷ������� ��ġ�ǰ� ������
	public void calacRound()	//�� �ѷ� ��� �޼ҵ�
	{
		round = 2*3.14*radius;
	}
	public void calacArea()	//�� ���� ��� �޼ҵ�
	{
		area = 3.14*radius*radius;
	}
	
	public String toString()
	{
		return super.toString()+",������:"+radius;
	}
}

class Rect extends Shape //�簢��
{
	private double width;
	private double height;

	//�⺻������
	public Rect()
	{}
	//�Ű������� ���� ������
	public Rect(int x, int y, double width, double height)
	{
		super(x,y);
		this.width = width;
		this.height = height;
		
		calacRound();
		calacArea();
		
	}

	public void calacRound()	//�簢�� �ѷ� ��� �޼ҵ�
	{
		round = (width + height) * 2;
	}
	public void calacArea()	//�簢�� ���� ��� �޼ҵ�
	{
		area = width * height;
	}

	public String toString()
	{
		return super.toString()+"����:"+width+"����:"+height;
	}
}

class  ShapeTest2
{
	public static void main(String[] args) 
	{
		//2���� ���� ���� �簢�� ��ü�� ����
		Circle c = new Circle(10,10,3.5);
		Rect r = new Rect(10,20,5,7);

		System.out.println(c);	//toString ȣ��
		System.out.println(r);	//toString ȣ��

		//�߻�Ŭ������ ��ü�� ������ �� ����.
		//Shape s = new Shape();

	/*C:\�ڹٽ��͵�\day0403>javac ShapeTest2.java
	ShapeTest2.java:121: error: Shape is abstract; cannot be instantiated
                Shape s = new Shape();
                          ^
	1 error*/
	}
}