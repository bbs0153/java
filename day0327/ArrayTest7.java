class ArrayTest7 
{
	public static void main(String[] args) 
	{
		int []a = {30,40,70,5,35};
		int []b = {20,40,70,6,35};

		int n = 0;

			for(int i=0; i<a.length; i++)
			{
				if(a[i]==b[i])
				{
					n++;
				}
			}
		
			System.out.println("두 배열의 동일한 수는 : "+n);
	}
}
