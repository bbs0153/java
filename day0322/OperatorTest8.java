class OperatorTest8
{
	public static void main(String[] args) 
	{
		int a = 20;
		int b = 30;
		
		a = a^b;
		b = b^a;
		a = a^b;

		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}
