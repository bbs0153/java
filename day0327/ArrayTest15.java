class ArrayTest15
{
	public static void main(String[] args) 
	{
		int []age = {27,28,27,26,25,20,28};
		String []name = {"조성재","한상협","김종호","양동훈","강서영","이태호","송명준"};
		
		
		for (int i=0; i<age.length; i++) 
		{
		
			for (int j=i+1; j<age.length ; j++)
			{
				if(age[j]<age[i])
				{
					int temp;
					temp = age[i];
					age[i] = age[j];
					age[j] = temp;
				
					String temp1;
					temp1 = name[i];
					name[i] = name[j];
					name[j] = temp1;
				}
			}
		
		}

		for(int i=0; i<age.length; i++)
		{
			System.out.println(name[i]+age[i]);
		}
	
	}
}
