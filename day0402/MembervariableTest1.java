class Person
{	
	//객체 맴버변수 
	private String name; //객체마다 별도의 메모리 확보
	private int age;
	//객체 생성시에 메모리가 확보되어 객체 참조변수가 참조되고 있는 동안 유지된다.
	//더이상 참조되지 않을때 메모리를 반환한다.
	
	//클래스 변수
	public static String addr = "서울"; //프로그램 살아 있는 동안에는 계속 유지된다.

	public Person(String name, int age) //매게 변수  그 block안에서만 유효하다.
	{
		this.name = name;
		this.age = age;
	}

	public void pro(String title)
	{
		int year = 2018; // 지역변수 ==> 그 메소드 안에서만 유효
		System.out.println(title);
		System.out.println(year);
		System.out.println(name+","+age+","+addr);  //메소드 안에서 사용했던 변수들은 메소드 끝날때 소멸된다. 매게 변수 포함
	}

	public void info()
	{
		//System.out.println(title);
		//System.out.println(year);
		System.out.println(name+","+age+","+addr);
	}


}
class MembervariableTest1
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("홍길동",20);
		Person p2 = new Person("이순신",30);
		
		p1 = p2;
	}
}
