/*
	 0 1 2 3 4
	0[][][][][] 
	1[][][][][]		�迭�� �� ��ҿ� 1���� 1�� ������ ���� ��������
	2[][][][][]		��, �� ���� ������ ĭ���� �� ���� ���� ���� �ϵ��� �Ѵ�.
	3[][][][][]     �迭�� ���� �� �߰��ϰ� ������ �࿡�� �� ���� ���� ���� �ǵ��� �մϴ�.

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
		
		
		//���
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
