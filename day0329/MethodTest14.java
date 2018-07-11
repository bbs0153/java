class MethodTest14
{
	public static boolean compareArray(int []a, int []b)
	{		
		// 두 배열의 길이가 같지 않을 때 반복문을 돌릴 필요가 없다.
		if (a.length != b.length)
		{
			return false;
		}
			
		for(int i = 0; i<a.length; i++)
		{		
			// 두 배열의 길이가 같을 때	
			if(a[i]!=b[i])
			{
				return false;
			}
		}	
		return true;
	}
	
	public static void main(String[] args) 
	{
		int []a = {10,20,30,40,50};
		int []b = {10,20,30,40,50,60};

		 boolean f = compareArray(a,b);

		 if(f==true)
		{
			System.out.println("두 배열은 서로 같아요");
		}
		else
		{
			System.out.println("두 배열은 서로 틀려요");
		}


	}
}
