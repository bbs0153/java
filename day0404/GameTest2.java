class GameCharacter
{
	public void draw()
	{
		System.out.println("GameCharacter�� draw()");
	}

	public void getLife()
	{
		System.out.println("GameCharacter()�� getLife()");
	}
}

class Hobbit extends GameCharacter
{
	public void draw()
	{
		System.out.println("ȣ���� �׸��ϴ�.");
	}

	public void getRing()
	{
		System.out.println("GameCharacter()�� getRing()");
	}
}

class Titan extends GameCharacter
{
	public void draw()
	{
		System.out.println("Ÿ��ź�� �׸��ϴ�.");
	}

	public void getRing()
	{
		System.out.println("GameCharacter()�� getRing()");
	}
}

class Sorcerer extends GameCharacter
{
	public void draw()
	{
		System.out.println("�ּ��縦 �׸��ϴ�.");
	}

	public void getRing()
	{
		System.out.println("GameCharacter()�� getRing()");
	}
}

class GameTest2
{
	public static void drawAll(GameCharacter []array)
	{
		//�迭�� �����Ͱ� �ִ� ��ŭ �ݺ� ����
		//�迭�� ������ �ϳ��������ͼ� �迭�� �����Ͱ� �ִ� ��ŭ �ݺ� ����
		for (GameCharacter a : array)
		{
			a.draw();	
		}
		
		
		/*for(int i = 0; i<array.length;i++)
		{
			array[i].draw();
		}*/
	}

	public static void main(String[] args) 
	{
		/*
		GameCharacter g1 = new Hobbit();

		g1.getLife();
		//g1.getRing();
		((Hobbit)g1).getRing();
		*/
		
		
		//[0][1][2][3][4][5]
		GameCharacter []array = new GameCharacter[6];

		for(int i = 0; i<array.length;i++)
		{
			switch(i)
			{
				case 0: case 1: array[i] = new Hobbit(); break;
				case 2: case 3: array[i] = new Titan(); break;
				case 4: case 5: array[i] = new Sorcerer(); break;
			}
		}
		/*
		for(int i = 0; i<array.length;i++)
		{
			array[i].draw();
		}
		*/
		drawAll(array);
	}
}
