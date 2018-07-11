class MyUtil
{
	public int sum(int a, int b)
	{
		int c = a+b;
		return c;
	}

	public double sum(double a, double b, double c)
	{
		double d = a+b+c;
		return d;
	}

	public int sum(int []arr)
	{
		int r = 0;
		for (int i =0; i<arr.length; i++)
		{
			r = r+arr[i];
		}
		
		return r;
	}
}

class  MethodOverloading4
{
	public static void main(String[] args) 
	{
		MyUtil mu = new MyUtil();

		System.out.println("합은:"+mu.sum(1,2));
		System.out.println("합은:"+mu.sum(52.7,36.7,78.9));

		int []arr = {10,20,30,40,50,60};
		System.out.println("합은:"+mu.sum(arr));
	}
}
