class Member
{
	String name = "������";
	int age = 20;
	final String ADDR = "��õ ���� �־�";
	
}

class FinalTest
{
	public static void main(String[] args) 
	{
		Member m = new Member();
		m.name = "������";
		m.age = 29;

		//m.ADDR = "���� ���� ��ȫ��";
/*
c:\�ڹٽ��͵�\day0322>javac FinalTest.java
FinalTest.java:17: error: cannot assign a value to final variable ADDR
                m.ADDR = "���� ���� ��ȫ��";
                 ^
1 error*/
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.ADDR);


	}
}
