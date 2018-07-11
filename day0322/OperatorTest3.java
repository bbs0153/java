class OperatorTest3
{
	public static void main(String []args)
	{
		int i = 1;
		int sum = 0;

		sum = sum + i;
		i++;
	
		sum = sum + i;
		++i;

		sum = sum + i;
		++i;

		System.out.println("i="+i);
		System.out.println("sum="+sum);
	}
}

