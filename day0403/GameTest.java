class GameCharacter
{
	public void draw()
	{
		System.out.println("GameCharacter()�� draw()");
	}
	public void getLife()
	{
		System.out.println("GameCharacter()�� getLife");
	}
}

class Hobitt extends GameCharacter
{
	public void draw()
	{
		System.out.println("ȣ���� �׸��ϴ�.");
	}
	public void getRing()
	{
		System.out.println("GameCharacter()�� getRing");
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
