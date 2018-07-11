class MethodTest11
{
	public static String getSeason(int a)
	{
		//String []str = {"겨울","겨울","봄","봄","봄","여름","여름","여름","가을","가을","가을","겨울"};
		//return str[a-1];
		
		String str = "";

		if(a==2||a==1||a==12)
		{
			str = "겨울";
		}
		else if(a==3||a==4||a==5)
		{
			str = "봄";
		}
		else if(a==6||a==7||a==8)
		{
			str = "여름";	
		}
		else
			str = "가을";

		return str;

	
	}

	public static int getmax(int a, int b)
	{
		int r = a;
			if(a<b)
			{
				r = b;
			}
		
		return r;
	}
	
	
	
	public static void main(String[] args) 
	{
		
		//월을 매개변수로 전달받아 해당월의 계정명을 반환하는 메소드를 정의
		String str = getSeason(3);
		System.out.println(3+"월은" +str);
	
		
		//두개의 정수를 매개변수로 전달받아 그 중에 큰수를 찾아 반환하는 메소드를 정의
		int max = getmax(20,27);
		System.out.println("큰수는"+max);
		
		
	}
}
