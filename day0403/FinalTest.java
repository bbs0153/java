class Person
{
	String name = "이현진";
	int age = 20;
	final String addr = "포항";

}

class  FinalTest
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.name = "홍길동";
		//p1.addr = "서울";  사용 불가  
		/*

		C:\자바스터디\day0403>javac FinalTest.java
		FinalTest.java:15: error: cannot assign a value to final variable addr
						p1.addr = "서울";
						  ^
		1 error*/
	}
}
