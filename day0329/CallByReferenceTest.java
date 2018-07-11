class Member
{
	String name;
	int age;
}


class CallByReferenceTest 
{
	
	public static void increment(Member ob)
	{
		ob.age = ob.age + 1;
		System.out.println(ob.age);
	}
	
	
	public static void main(String[] args) 
	{
		Member m = new Member();
		
		m.name = "ÀÌÅÂÈ£";
		m.age = 20;

		System.out.println(m.age);
		increment(m);
		System.out.println(m.age);
	
	}
}
