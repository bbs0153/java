/*
	인터페이스는 완전추상의 개념으로 상수와 추상메소드만으로 구성된다.
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
		System.out.println("속도를"+amount+"만큼 증가");
	}
	public void speedDown(int amount)
	{
		System.out.println("속도를"+amount+"만큼 감속");
	}

	public void TurnLeft()
	{
		System.out.println("자동차가 좌회전 합니다.");
	}
	public void TurnRight()
	{
		System.out.println("자동차가 우회전 합니다.");
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
