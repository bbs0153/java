/*
	�������̽��� �����߻��� �������� ����� �߻�޼ҵ常���� �����ȴ�.
*/

interface Movable
{
	int speed  = 100;
	
	public void speedUp(int amount);
	public void speedDown(int amount);
	
	/*public void printSpeed()
	{
		System.out.println(speed);
	}

		CarTest.java:11: error: interface abstract methods cannot have body
				{
				^
		1 error*/
}

class Car implements Movable
{
	public void speedUp(int amount)
	{
		System.out.println("�ӵ���"+amount+"��ŭ ����");
	}
	public void speedDown(int amount)
	{
		System.out.println("�ӵ���"+amount+"��ŭ ����");
	}

	public void TurnLeft()
	{
		System.out.println("�ڵ����� ��ȸ�� �մϴ�.");
	}
	public void TurnRight()
	{
		System.out.println("�ڵ����� ��ȸ�� �մϴ�.");
	}
}



class  CarTest
{
	public static void main(String[] args) 
	{
		Car c = new Car();

		c.speedUp(10);
		c.speedDown(10);
		c.TurnLeft();
		c.TurnRight();

		/*
		Car m = new Car();
		
		m.speedUp(); 
		m.TurnLeft();
		Car c = m;
		Car c = (Car)m;
		Car c = new Car();
		Movable m = c;
		Movable m = (Movable)c;
		*/
		

	}
}
