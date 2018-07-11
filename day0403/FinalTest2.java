class Person
{
	public final void info()
	{
		System.out.println("사람입니다.");
	}
	public void pro()
	{
		System.out.println("Preson의 pro입니다.");
	}
}

class Student extends Person
{
	
	/*public void info()  사용불가
	{
		System.out.println("인간입니다.");
	}
			FinalTest2.java:16: error: info() in Student cannot override info() in Person
				public void info()
							^
		  overridden method is final
		1 error*/
	
	public void pro()
	{
		System.out.println("Student의 pro입니다.");
	}

}

class  FinalTest2
{
	public static void main(String[] args) 
	{
		
		Student s = new Student();
		s.pro();
		s.info();
	}
}
