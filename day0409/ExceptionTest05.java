/*
	�ϳ��� try���忡 �������� catch���� �� �� �ִ�.

	�̋� ���԰���(is a)�� ������ �ݵ�� ������ ���� catch�� ������ �;� �Ѵ�.
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
			System.out.println("0���δ� ������ �����");
		}
		catch(Exception e)
		{
			System.out.println("�������� �μ��� Ȯ���ϼ���");
		}
	
		
	}
}
