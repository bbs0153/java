/*
	 0 1 2 3 4
	0[][][][][] 
	1[][][][][]		배열의 각 요소에 1부터 1씩 증가한 값을 저장장한
	2[][][][][]		단, 각 줄의 마지막 칸에는 그 줄의 합을 누적 하도록 한다.
	3[][][][][]     배열의 행을 더 추가하고 마지막 행에는 각 열의 합이 누적 되도록 합니다.

*/
class MatrixTest3
{
	public static void main(String[] args) 
	{
		int [][]a = new int[5][5];
		int n = 1;
	
		for(int i = 0; i<4; i++)
		{
			for(int j = 0; j<4 ; j++)
			{
				a[i][j] = n++;
				a[i][4] = a[i][4] + a[i][j];
				a[4][j] = a[4][j] + a[i][j];			
				a[4][4] = a[4][4] + a[i][j];
			}
		}
		
		
		//출력
		for (int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print(a[i][j]+"\t");
			}			
			
			
			System.out.println();
		}

	}
}
