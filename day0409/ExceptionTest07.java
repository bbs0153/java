class MyUtil
{
	public void div(int a, int b)throws ArithmeticException
	{
		int r = a/b;
		System.out.println("나누기 결과:"+r);
	}

	public void add(int a, int b)
	{
		int r = a+b;
		System.out.println("더하기 결과:"+r);
	}

}

class MyUtilTest
{

	public static void pro()
	{
		MyUtil ob = new MyUtil();

		try
		{
			ob.div(4,0);
		}
		catch (ArithmeticException e)
		{
			System.out.println("다음과 같은 문제가 발생:"+e.getMessage());
		}
	
		ob.add(4,2);
	}


}

class  ExceptionTest07
{
	public static void main(String[] args) 
	{
		
		MyUtilTest.pro();
	}
}
