class Person
{
	String name = "������";
	int age = 20;
	final String addr = "����";

}

class  FinalTest
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.name = "ȫ�浿";
		//p1.addr = "����";  ��� �Ұ�  
		/*

		C:\�ڹٽ��͵�\day0403>javac FinalTest.java
		FinalTest.java:15: error: cannot assign a value to final variable addr
						p1.addr = "����";
						  ^
		1 error*/
	}
}
