/*
	���α׷� ����ÿ� ����� ���� �ΰ��� ������ ���޹޾�
	�������� ����� ����ϴ� ���α׷�
	
	java ExceptionTest01 4 2
	2

	���α׷� ����ÿ� ���޵Ǵ� ���� main�޼ҵ��� �迭�� ��Ұ� �ȴ�.
	���޵Ǵ� ���� �� ��ŭ �迭�� ũ�Ⱑ ��������.
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
			System.out.println("0���δ� ������ �����");
		}
		catch(Exception e)
		{
			System.out.println("�������� �μ��� Ȯ���ϼ���");
		}
	
		
	}
}
