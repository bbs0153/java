class ArrayTest13
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5};
		int []b = {1,2,3,4,5};
	
		boolean f = true;

		for(int i = 0; i<a.length; i++)
		{
			if(a[i]!=b[i])
			{
				f = false;
				System.out.println("달라요");
				break;
			}
		}
	
		if(f==true)
		{
			System.out.println("같아요");
		}

	}
}
