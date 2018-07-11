class OperatorTest11
{
	public static void main(String []args)
	{
		int i = 1;
		int sum = 0;

		sum += i;
		i++;
	
		sum += i;
		++i;

		sum += i;
		++i;

		System.out.println("i="+i);
		System.out.println("sum="+sum);
	}
}

