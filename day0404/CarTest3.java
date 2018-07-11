/*
	인터페이스는 완전추상의 개념으로 상수와 추상메소드만으로 구성된다.
*/
interface Movable
{
	int speed  = 100;
	
	public void speedUp(int amount);
	public void speedDown(int amount);
}

class Car implements Movable  // Movable is a Car(x)  Car is a Movable(o)
{
	public void speedUp(int amount)
	{
		System.out.println("속도를"+amount+"만큼 증가");
	}
	public void speedDown(int amount)
	{
		System.out.println("속도를"+amount+"만큼 감속");
	}

	public void turnLeft()
	{
		System.out.println("자동차가 좌회전 합니다.");
	}
	public void turnRight()
	{
		System.out.println("자동차가 우회전 합니다.");
	}
}

class Train implements Movable
{
	public void speedUp(int amount)
	{
		System.out.println("속도를"+amount+"만큼 증가");
	}
	public void speedDown(int amount)
	{
		System.out.println("속도를"+amount+"만큼 감속");
	}

	public void chickchick()
	{
		System.out.println("칙칙폭폭");
	}

}



class  CarTest3
{
	public static void main(String[] args) 
	{	
		Movable m[];
		m = new Movable[3]; //참조변수 3개 생성

		m[0] = new Train();
		m[1] = new Train();
		m[2] = new Car();

		for (Movable mv : m)
		{
			mv.speedUp(200);
			mv.speedDown(30);
			
			//배열에서 꺼내온 mv가 Train의 객체가 맞나요?
			if(mv instanceof Train)
			{
				((Train)mv).chickchick();
			}
			else if (mv instanceof Car)
			{
				((Car)mv).turnLeft();
				((Car)mv).turnRight();
			}
		}

	}
}
