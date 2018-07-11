class MatrixTest 
{
	public static void main(String[] args) 
	{
		int [][]a = new int[2][3];
		int n = 1;

		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				a[i][j] = n++;
			}
		}

		//배열의 데이터를 출력
		for (int i=0; i<2 ; i++)
		{
			for (int j=0; j<3 ; j++)
			{
				System.out.print(a[i][j]+" ");
			}
		}
	}
}
