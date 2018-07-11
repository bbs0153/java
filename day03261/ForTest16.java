/*
	2단부터 9단까지의 구구단을 모두 출력
*/
class ForTest16 
{
	public static void main(String[] args) 
	{

		
		for(int i=2; i<=9; i++)
		{
			for(int a=1; a<=9; a++)
			{
				System.out.println(i+"*"+a+"="+i*a);
			}
			System.out.println();
		}
	}
}
