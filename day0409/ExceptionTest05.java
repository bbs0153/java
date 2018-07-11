/*
	하나의 try문장에 여러개의 catch절이 올 수 있다.

	이떄 포함관계(is a)에 있을때 반드시 범위가 작은 catch절 순으로 와야 한다.
*/

class ExceptionTest05
{
	public static void main(String[] args) 
	{
		
		try{
	
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println(a/b);
		
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("0으로는 나눌수 없어요");
		}
		catch(Exception e)
		{
			System.out.println("나누기할 두수를 확인하세요");
		}
	
		
	}
}
