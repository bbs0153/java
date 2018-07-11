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

	public void turnLeft()
	{
		System.out.println("�ڵ����� ��ȸ�� �մϴ�.");
	}
	public void turnRight()
	{
		System.out.println("�ڵ����� ��ȸ�� �մϴ�.");
	}
}

class Train implements Movable
{
	public void speedUp(int amount)
	{
		System.out.println("�ӵ���"+amount+"��ŭ ����");
	}
	public void speedDown(int amount)
	{
		System.out.println("�ӵ���"+amount+"��ŭ ����");
	}

	public void chickchick()
	{
		System.out.println("ĢĢ����");
	}

}



class  CarTest3
{
	public static void main(String[] args) 
	{	
		Movable m[];
		m = new Movable[3]; //�������� 3�� ����

		m[0] = new Train();
		m[1] = new Train();
		m[2] = new Car();

		for (Movable mv : m)
		{
			mv.speedUp(200);
			mv.speedDown(30);
			
			//�迭���� ������ mv�� Train�� ��ü�� �³���?
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
