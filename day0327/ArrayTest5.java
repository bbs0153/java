/*
	�ڽ��� ������������ �̸��� ���̸� ���� �迭�� �����ϰ� ���
*/
class ArrayTest5 
{
	public static void main(String[] args) 
	{
		String []name = {"������","���ǿ�","���α�","�ӿ���","�迵ȣ","������","��ȣ��","¯��"};
			int []age = {26,26,25,26,27,29,29,5};

		//���� ���̰� � ����� �̸� ���
		int min = age[0];
		int n = 0;	
			for(int i = 1; i<age.length; i++)
			{	
				if(age[i]<min)
				{
					min = age[i];
					n=i;
				}
			}

			System.out.println("���̰� ���� � �����?"+name[n]);
			
				
	}
}
