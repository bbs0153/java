class ArrayTest12 
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5};
		int []b = {1,2,3,4,5};
	
		int i;
		for(i=0; i<a.length; i++)
		{
			if(a[i]!=b[i])
			{
				break;
			}
		}
		

		if(i==a.length)
			System.out.println("�迭�� ������ ��ġ�մϴ�.");
		else
			System.out.println("������ ������ ��ġ���� �ʽ��ϴ�.");
	}
}
