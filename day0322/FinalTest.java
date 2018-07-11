class Member
{
	String name = "변성인";
	int age = 20;
	final String ADDR = "인천 남구 주안";
	
}

class FinalTest
{
	public static void main(String[] args) 
	{
		Member m = new Member();
		m.name = "변유정";
		m.age = 29;

		//m.ADDR = "서울 마포 대홍동";
/*
c:\자바스터디\day0322>javac FinalTest.java
FinalTest.java:17: error: cannot assign a value to final variable ADDR
                m.ADDR = "서울 마포 대홍동";
                 ^
1 error*/
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.ADDR);


	}
}
