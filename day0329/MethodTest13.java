class MethodTest13 
{
	public static boolean compareArray(int []a, int []b)
	{		
		
		boolean	t = true;
		
		// �� �迭�� ���̰� ���� ���� �� �ݺ����� ���� �ʿ䰡 ����.
		if (a.length != b.length)
		{
			return false;
		}
			
		for(int i = 0; i<a.length; i++)
		{		
			// �� �迭�� ���̰� ���� ��	
			if(a[i]!=b[i])
			{
				t = false;
				break;
			}
		}	
		return t;
	}
	
	public static void main(String[] args) 
	{
		int []a = {10,20,30,40,50};
		int []b = {10,20,30,40,50,60};

		 boolean f = compareArray(a,b);

		 if(f==true)
		{
			System.out.println("�� �迭�� ���� ���ƿ�");
		}
		else
		{
			System.out.println("�� �迭�� ���� Ʋ����");
		}


	}
}