class ArrayTest10 
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5};
		int []b = new int[5];

		a=b;
		a[2] = 300;

		System.out.println("a배열의 출력");
		for(int i : a)
		{
			System.out.print(i+" ");
		}

		System.out.println();
		System.out.println("b배열의 출력");
		for(int i : b)
		{
			System.out.print(i+" ");
		}
	}
}
