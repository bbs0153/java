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

	public void TurnLeft()
	{
		System.out.println("자동차가 좌회전 합니다.");
	}
	public void TurnRight()
	{
		System.out.println("자동차가 우회전 합니다.");
	}
}



class  CarTest2
{
	public static void main(String[] args) 
	{
		Movable m = new Car();

		m.speedUp(200);
		m.speedDown(30);
		
		((Car)m).TurnLeft();
		((Car)m).TurnRight();
		
		
		
		
		//m.turnLeft();
		//m.turnRight();	
				
	/*
	상속관계(is a)에 있을 때 부모의 참조변수가 자식의 객체를 참조할 수 있다.
	그러나 자식클래스에 추가된 메소드는 호출 할 수 없다.

	호출하기 위해서는 해당 자식 클래스로 형변환(casting)하여 호출한다.

				CarTest2.java:43: error: cannot find symbol
						m.turnLeft();
						 ^
		  symbol:   method turnLeft()
		  location: variable m of type Movable
		CarTest2.java:44: error: cannot find symbol
						m.turnRight();
						 ^
		  symbol:   method turnRight()
		  location: variable m of type Movable
		2 errors*/
	}
}
