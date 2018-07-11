class  MethodTest2
{
	//메소드의 정의
	public static void sayHello()
	{
		for (int i = 1; i<=3; i++)
		{
			System.out.println("안녕, 태호!");
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		
		sayHello(); //메소드 호출
		
		int year = 2018;
		System.out.println("올해는"+year+"년 입니다.");
		
		sayHello();

		String addr = "서울시 마포구 신수동";
		System.out.println("주소는"+addr);

		sayHello();

	}
}
