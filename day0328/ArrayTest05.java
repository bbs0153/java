class ArrayTest05 
{
	public static void main(String[] args) 
	{
		int [][]a = new int[3][];

		a[0] = new int[10];
		a[1] = new int[2];
		a[2] = new int[5];

		int n = 1;
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				a[i][j] = n++;
				
				System.out.print(a[i][j]+" ");
			}
				System.out.println();
		}
	}
}
