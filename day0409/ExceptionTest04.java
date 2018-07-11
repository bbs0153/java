/*
	프로그램 실행시에 사용자 한테 두개의 정수를 전달받아
	나눗셈의 결과를 출력하는 프로그램
	
	java ExceptionTest01 4 2
	2

	프로그램 실행시에 전달되는 값은 main메소드의 배열의 요소가 된다.
	전달되는 값의 수 만큼 배열의 크기가 정해진다.
*/

class ExceptionTest04
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
