/*
	�������̽��� �����߻��� �������� ����� �߻�޼ҵ常���� �����ȴ�.
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
	��Ӱ���(is a)�� ���� �� �θ��� ���������� �ڽ��� ��ü�� ������ �� �ִ�.
	�׷��� �ڽ�Ŭ������ �߰��� �޼ҵ�� ȣ�� �� �� ����.

	ȣ���ϱ� ���ؼ��� �ش� �ڽ� Ŭ������ ����ȯ(casting)�Ͽ� ȣ���Ѵ�.

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
