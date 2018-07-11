class ArrayTest04
{
	public static void main(String[] args) 
	{
		int [][][]a = new int[2][4][3];

		for(int i=0; i<2; i++)
		{
			for(int j=0; j<4; j++)
			{
				for(int k=0; k<3; k++)
				{
					a[i][j][k] = i+1;
				}
			}
		
		}

		for(int i=0; i<2; i++)
		{
			for(int j=0; j<4; j++)
			{
				for(int k=0; k<3; k++)
				{
					System.out.print(a[i][j][k]+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}	
	}
}
