class ArrayTest14 
{
	public static void main(String[] args) 
	{
		int []age = {27,28,27,26,25,20,28};

		//���� : ���� ������� ���� ��
		//ū������    : ��������
		//����������  : ��������
		
		//20,25,26,27,27,28,28 ��������
		for (int i=0; i<age.length; i++) 
		{
		
			for (int j=i+1; j<age.length ; j++)
			{
				if(age[j]<age[i])
				{
					int temp;
					temp = age[i];
					age[i] = age[j];
					age[j] = temp;
					
				}
			}
		
		}

		for(int i=0; i<age.length; i++)
		{
			System.out.println(age[i]+" ");
		}
	
	}
}
