class ArrayTest18 
{
	public static void main(String[] args) 
	{
		int []age = {27,26,30,45,70};

		/*for(int i =0; i<age.length; i++)  //�ε����� ����
		{
			System.out.println(age[i]);
		}*/

		for(int i : age)   //���� ����
		{
			System.out.println(i);
		}
	}
}
