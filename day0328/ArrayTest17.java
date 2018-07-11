class  ArrayTest17
{
	public static void main(String[] args) 
	{
		int []a = new int[5];

		for (int i=0; i<5; i++)
		{
			a[i] = i+1;
		}
		
		for(int i : a)
		{
			System.out.println(i);
		}
		
		/*
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}*/
	}
}
