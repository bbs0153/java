/*
	������ 1���� �迭�� �Ű������� ���޹޾�
	�迭�� ��� ��Ҹ� 1�� �����ϴ� �żҵ带 ���� �մϴ�.

	���� �żҵ带 ȣ���� ����
	���� ���� ȣ������, ������ ���� ȣ������ Ȯ���� ������ �մϴ�.

	������ ���� ȣ���̴�.
	�迭�� �Ű������� ���� �ָ� ������ ���� ȣ���̴�.
*/
class	CvCr
{
	public static void increment(int arr[])
	{
		for (int i=0; i<arr.length ; i++)
		{
			arr[i]=arr[i]+1;
		}
	}
	
	public static void printArr(int []arr)
	{
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		int []age = {27,37,28,40};

		printArr(age);
		increment(age);
		printArr(age);
	}

}
