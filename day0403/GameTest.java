class GameCharacter
{
	public void draw()
	{
		System.out.println("GameCharacter()의 draw()");
	}
	public void getLife()
	{
		System.out.println("GameCharacter()의 getLife");
	}
}

class Hobitt extends GameCharacter
{
	public void draw()
	{
		System.out.println("호빗을 그립니다.");
	}
	public void getRing()
	{
		System.out.println("GameCharacter()의 getRing");
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

class  GameTest
{
	public static void main(String[] args) 
	{	
		

		GameCharacter array[] = new GameCharacter[6];
		
		array[0] = new Hobitt();
		array[1] = new Titan();
		array[2] = new Sorcerer();
		array[3] = new Hobitt();
		array[4] = new Titan();
		array[5] = new Sorcerer();
		

		for (int i=0; i<6 ; i++)
		{
			array[i].draw();
		}

		/*(Hobitt)g1).getRing();
			GameTest.java:60: error: not a statement
							(Hobitt)g1).getRing();
							^
			GameTest.java:60: error: ';' expected
							(Hobitt)g1).getRing();
									  ^
			2 errors*/

	}
}
