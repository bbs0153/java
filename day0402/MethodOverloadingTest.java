/*
	����� ���� �ΰ��� �Ű������� ���� �޾� �� �߿� ū���� ã�� ��ȯ�ϴ� �޼ҵ带 ����

	�ݵ�� ��ü�� �ְ� �� ��ü�� ���ؼ� ���
	��ü ���̵� ���
*/

class BitUtil
{

	public static int max(int a, int b)
	{
		int r = a;
		
		if(b>r)
		{
			r=b;
		}
		return r;
	}
	
	public static double max(double a, double b)
	{
		double r = a;
		
		if(b>r)
		{
			r=b;
		}
		return r;
	}
	
	public static int max(int a, int b, int c)
	{
		int r = max(a,b);
		r = max(r,c);
		return r;
	}
	
	/*
		�Ű����� �̸��� �ƴ϶� �Ű������� ������ �ڷ����� �޶�� ��.

	public static int max(int age1, int age2) 
	{

	}*/
}



class  MethodOverloadingTest
{
	public static void main(String[] args) 
	{
	
		int a = BitUtil.max(4,5);
		double b = BitUtil.max(175.7,178.5);
		int c = BitUtil.max(50,60,70);
			
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
}
