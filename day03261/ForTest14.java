class ForTest14
{
	public static void main(String[] args)
	{
		int []a = {4,5,7,3,13,27,8,21};
		
		int max;
		max = a[0]; //4
		int min = a[0];
		for(int i=1; i<8; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
			if(a[i]<min)
			{
				min = a[i];
			}
		}
	
		System.out.println("가장 큰 수는?"+max);
		System.out.println("가장 작은 수는?"+min);
	}
}
