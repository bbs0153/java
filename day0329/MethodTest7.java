class MethodTest7 
{
	public static void sum(int n)
	{
		int r = 0;
		for(int i = 1; i<=n; i++)
		{
			r = r + i;
		}

		System.out.println(n+"������ ����"+r);
	}

	public static void max(int a, int b)
	{	
		int r = a;
		
		if (b>r)
		{
			b=r;
		}
		
		System.out.println("ū����"+r);
	}
	
	
	public static void main(String[] args) 
	{
		sum(10); //���� ���� �� ������ ���� ����

		max(27,20); //���޹��� �ΰ��� ���� �߿� ū ���� ã�� ���
	}
}
