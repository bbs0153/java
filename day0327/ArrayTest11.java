class ArrayTest11
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5};
		int []b = new int[a.length];
		
		for(int i=0; i<a.length; i++)
		{
			b[i] = a[i];
		}
		
		a[2] = 300;

		System.out.println("a�迭�� ���");
		for(int v : a)
		{
			System.out.print(v+" ");
		}

		System.out.println();
		System.out.println("b�迭�� ���");
		for(int v : b)
		{
			System.out.print(v+" ");
		}
	}
}
