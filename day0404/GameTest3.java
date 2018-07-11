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

class GameTest3
{
	public static void drawAll(Object []array)
	{
		//�迭�� �����Ͱ� �ִ� ��ŭ �ݺ� ����
		//�迭�� ������ �ϳ��������ͼ� �迭�� �����Ͱ� �ִ� ��ŭ �ݺ� ����
		for (Object a : array)
		{
			((GameCharacter)a).draw();
		}
	}

	public static void main(String[] args) 
	{
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
		drawAll(array);
	}
}

/*
	�ڹ��� ��� Ŭ�������� Object�� �ļ��̴�.

*/
