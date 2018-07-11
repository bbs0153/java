class MethodTest12 
{
	public static int getMax(int []a)
	{
		int max = a[0];

		for(int i =0; i<a.length; i++)
		{
			if (a[i]>max)
			{
				max = a[i];
			}
		}
		return max;
	} 
	
	public static void main(String[] args) 
	{
		int []a = {1,5,6,8,9,27,10,21};

		int max = getMax(a);

		System.out.println("배열의 가장 큰값은"+max);

	}
}
