class ArrayTest10 
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5};
		int []b = new int[5];

		a=b;
		a[2] = 300;

		System.out.println("a�迭�� ���");
		for(int i : a)
		{
			System.out.print(i+" ");
		}

		System.out.println();
		System.out.println("b�迭�� ���");
		for(int i : b)
		{
			System.out.print(i+" ");
		}
	}
}
