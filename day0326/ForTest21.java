/*
break :
switch, �ݺ������� ���Ǹ� �ش� switch�� �ݺ����� Ż���Ű���� �� �� ����Ѵ�.
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
