class MethodTest10
{
	//매개변수 n을 전달받아 n까지의 합을 누적하여 return 한다.(반환한다)
	public static int getSum(int n)
	{
		int r = 0;
		for(int i = 1; i<=n; i++)
		{
			r = r + i;
		}
	
		return r;
	}

	
	public static void main(String[] args) 
	{
		int hap = getSum(2); //전달 받은 수 까지의 합을 누적
		
		System.out.println("결과"+hap);
		System.out.println("종료");
	}
}
