class MethodTest8 
{
	public static void printDay(int a)
	{
		
		if(a==1 || a==3 || a==5 || a==7 || a==8 || a==10 || a==12)
		{
			System.out.println(a+"달의 마지막 날짜는 : 31일 입니다.");
		}
			else if(a==4 || a==6 || a==9 || a==11)
			{
				System.out.println(a+"달의 마지막 날짜는 : 30일 입니다.");
			}
				else
				{
					System.out.println(a+"달의 마지막 날짜는 : 28일 입니다.");
				}
	}
	
	public static void factorial(int b)
	{
		int r = 1;
		for (int i=b; i>=1; i--)
		{
			r = r*i;
			System.out.print(i);
				
				if(i!=1)
				{
					System.out.print("*");
				}
		}
		
		System.out.println("="+r);
	}
	
	public static void digiToKor(int c)
	{
		String []name = {"영","일","이","삼","사","오","육","칠","팔","구"};
		
		System.out.println(name[c]);
	}
	
	public static void power(int d, int e)
	{
		int f = 1;
		for (int i=1; i<=e; i++)
		{
		   f = f * d ;
		}
		System.out.println(d+"의"+e+"제곱승은 : "+f);
	}
	
	public static void main(String[] args) 
	{
		printDay(3); //전달된 달의 마지막 날짜를 출력
		
		
		factorial(5); //전달된 수의 팩토리얼을 계산하여 출력
					  //5*4*3*2*1

		digiToKor(7); //전달된 수를 한글로 출력

		power(2,3); //앞의 수를 뒤에 수 만큼 제곱승 하여 출력
	
	}
}
