class MyUtil
{
	public void div(int a, int b)throws ArithmeticException
	{
		int r = a/b;
		System.out.println("������ ���:"+r);
	}

	public void add(int a, int b)
	{
		int r = a+b;
		System.out.println("���ϱ� ���:"+r);
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
			System.out.println("������ ���� ������ �߻�:"+e.getMessage());
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
