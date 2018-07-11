class BreakAndContinue3
{
	public static void main(String[] args) 
	{
		int i;
		for(i=1;i<=10;i++)
		{
			if(i%3==0)
			{
				continue;  //1~10까지의 3의 배수는 제외 하고 반복문 수행
			}
			System.out.println(i);
		}
		
		System.out.println("비트캠프"+i);
	}
}
