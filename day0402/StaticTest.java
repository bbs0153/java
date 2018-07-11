/*
	자바는 프로그램에 필요한 일반적인 많은 클래스들을 미리 만들어 두었다.
	이 중에 integer 클래스에 있는 static 메소드를 사용해 보자.
	그 중에 parselInt() 메소드는 문자열을 int로 변환하는 기능
*/
class  StaticTest
{
	public static void main(String[] args) 
	{
		String a = "20";
		String b = "40";

		int i = Integer.parseInt(a) + Integer.parseInt(b);
	
		System.out.println(i);
	}
}

    