/*
	����� ���� �ΰ��� �Ű������� ���� �޾� �� �߿� ū���� ã�� ��ȯ�ϴ� �޼ҵ带 ����

	�ݵ�� ��ü�� �ְ� �� ��ü�� ���ؼ� ���
	��ü ���̵� ���
*/

class BitUtil
{

	public static double max(double a, double b) // double ���� int�� �ݿ��Ѵ�.
	{
		double r = a;
		
		if(b>r)
		{
			r=b;
		}
		return r;
	}
	
	/*
		�Ű����� �̸��� �ƴ϶� �Ű������� ������ �ڷ����� �޶�� ��.

	public static int max(int age1, int age2) 
	{

	}*/
}



class  MethodOverloadingTest2
{
	public static void main(String[] args) 
	{
			
		System.out.println(BitUtil.max(4,5));
		System.out.println(BitUtil.max(175.7,178.5));
		//System.out.println(BitUtil.max(50,60,70);

	}
}
