class MethodTest7 
{
	public static void sum(int n)
	{
		int r = 0;
		for(int i = 1; i<=n; i++)
		{
			r = r + i;
		}

		System.out.println(n+"까지의 합은"+r);
	}

	public static void max(int a, int b)
	{	
		int r = a;
		
		if (b>r)
		{
			b=r;
		}
		
		System.out.println("큰수는"+r);
	}
	
	
	public static void main(String[] args) 
	{
		sum(10); //전달 받은 수 까지의 합을 누적

		max(27,20); //전달받은 두개의 정수 중에 큰 수를 찾아 출력
	}
}
