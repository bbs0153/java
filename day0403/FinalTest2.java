class Person
{
	public final void info()
	{
		System.out.println("����Դϴ�.");
	}
	public void pro()
	{
		System.out.println("Preson�� pro�Դϴ�.");
	}
}

class Student extends Person
{
	
	/*public void info()  ���Ұ�
	{
		System.out.println("�ΰ��Դϴ�.");
	}
			FinalTest2.java:16: error: info() in Student cannot override info() in Person
				public void info()
							^
		  overridden method is final
		1 error*/
	
	public void pro()
	{
		System.out.println("Student�� pro�Դϴ�.");
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
