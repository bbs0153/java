/*
	����ȣ�� ���� �ִ� ������������ ���̸� �迭�� �������� ���
*/
class  ArrayTest2
{
	public static void main(String[] args) 
	{
		int []age = {22,28,27,26,25,20,28};
		int sum = 0;
		for(int i=0; i<=6; i++)
		{
			sum = sum+age[i];
		}
	
		System.out.println(sum/7);
	}
}
