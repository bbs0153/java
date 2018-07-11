class  MethodTest3
{
	//메소드의 정의
	public static void sayHello(String name)
	{
		for (int i = 1; i<=3; i++)
		{
			System.out.println("안녕,"+name+"!");
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		
		sayHello("태호"); //메소드 호출
		
		int year = 2018;
		System.out.println("올해는"+year+"년 입니다.");
		
		sayHello("현진");

		String addr = "서울시 마포구 신수동";
		System.out.println("주소는"+addr);

		sayHello("동훈");

	}
}
