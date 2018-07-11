class GameCharacter
{
	public void draw()
	{
		System.out.println("GameCharacter의 draw()");
	}

	public void getLife()
	{
		System.out.println("GameCharacter()의 getLife()");
	}
}

class Hobbit extends GameCharacter
{
	public void draw()
	{
		System.out.println("호빗을 그립니다.");
	}

	public void getRing()
	{
		System.out.println("GameCharacter()의 getRing()");
	}
}

class Titan extends GameCharacter
{
	public void draw()
	{
		System.out.println("타이탄을 그립니다.");
	}

	public void getRing()
	{
		System.out.println("GameCharacter()의 getRing()");
	}
}

class Sorcerer extends GameCharacter
{
	public void draw()
	{
		System.out.println("주술사를 그립니다.");
	}

	public void getRing()
	{
		System.out.println("GameCharacter()의 getRing()");
	}
}

class GameTest3
{
	public static void drawAll(Object []array)
	{
		//배열에 데이터가 있는 만큼 반복 수행
		//배열의 내용을 하나씩꺼내와서 배열의 데이터가 있는 만큼 반복 수행
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
	자바의 모든 클래스들은 Object의 후손이다.

*/
