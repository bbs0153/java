class ArrayTest12 
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5};
		int []b = {1,2,3,4,5};
	
		int i;
		for(i=0; i<a.length; i++)
		{
			if(a[i]!=b[i])
			{
				break;
			}
		}
		

		if(i==a.length)
			System.out.println("배열의 내용이 일치합니다.");
		else
			System.out.println("베열의 내용이 일치하지 않습니다.");
	}
}
