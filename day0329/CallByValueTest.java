class CallByValueTest 
{
	public static void increment(int n)
	{
		n = n+1;
		System.out.println("����"+n); //21
	}
	
	public static void main(String[] args)
	{
		int age = 20;
		
		System.out.println("���� : "+age); //20
		increment(age);						
		System.out.println("���� : "+age); //20
		
	}
}
