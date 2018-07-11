/*
break :
switch, 반복문에서 사용되며 해당 switch나 반복문을 탈출시키고자 할 때 사용한다.
*/

class ForTest21 
{
	public static void main(String[] args) 
	{
		int i = 1;
		for( ; ;)
		{
			System.out.println("hello");
			i++;
			if(i>3)
			{	
				break;
			}
		}
		System.out.println(i);
	}
}
