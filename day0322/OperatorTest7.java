class OperatorTest7 
{
	public static void main(String[] args) 
	{
		int a = 20;
		int b = 30;
		
		int temp;
		temp = a;
		a = b;
		b = temp;

		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}
