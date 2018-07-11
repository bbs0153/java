final class Person
{
	public void pro()
	{
		System.out.println("Preson의 pro입니다.");
	}
}

/*class Student extends Person //사용불가
{	
	public void pro()
	{
		System.out.println("Student의 pro입니다.");
	}

}

FinalTest3.java:9: error: cannot inherit from final Person
class Student extends Person
                      ^
1 error*/

class  FinalTest3
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.pro();
	}
}
