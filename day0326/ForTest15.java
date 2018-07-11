/*
	중첩반복문 ==> 반복문 안에 포함된 또다른 반복문
*/

class  ForTest15
{
	public static void main(String[] args) 
	{
		int i;
		int j;

		for(i=1; i<=3; i++)
		{
		
			for(j=1; j<=2; j++)
			{
				System.out.println(i+ " hello " +j);
			}
		}
	}
}
