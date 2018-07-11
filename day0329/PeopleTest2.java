/*
	사람이라는 클래스를 설계 해 봅니다.
	속성
			이름	 String name
	   왼쪽 시력	double left_eye
	 오른쪽 시력	double right_eye
			나이	int age
	동작
		먹는다	void eat(String some)
		달린다	void run(String where)

*/
class People
{
	private String name;
	private double left_eye;
	private double right_eye;
	private int age;
	
	//gettet(접근자)
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
	
	//setter(설정자)
	public void setName(String n)
	{
		name=n;
	}
	public void setLeft_eye(double a)
	{
		left_eye = a;
	}
	public void setRight_eye(double b)
	{
		right_eye = b;
	}
	public void setAge(int c)
	{
		age = c;
	}
	
	
	public void eat(String some)
	{
		System.out.println(name+"이(가)"+some+"을(를) 먹어요");	
	}

	public void run(String where)
	{
		System.out.println(name+"이(가)"+where+"에서 달려요");
	}

}


class  PeopleTest2
{
	public static void main(String[] args) 
	{
		People p1 = new People();
		
		p1.setName("차건우");
		p1.setLeft_eye(0.7);
		p1.setRight_eye(0.7);
		p1.setAge(26);

		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		
		p1.run("경의선 숲길");
		p1.run("신촌 로터리");
		p1.eat("포카리");
		p1.eat("초코파이");

		People p2 = new People();

		p2.setName("변성인");
		p2.setLeft_eye(1.5);
		p2.setRight_eye(1.5);
		p2.setAge(26);

		p2.run("한강");
		p2.run("해운대");
		p2.eat("한우");
		p2.eat("생선구이");


	}
}
