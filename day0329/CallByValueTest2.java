class CallByValueTest2
{
	public static void increment(int n)
	{
		n = n+1;
		System.out.println("나이"+n); //21
	}
	
	public static void main(String[] args)
	{
		int age = 20;
		
		System.out.println("나이 : "+age); //20
		increment(age);						
		System.out.println("나이 : "+age); //20
		//System.out.println(n);  사용할 수 없다.
		
	}
}
