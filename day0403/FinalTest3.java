final class Person
{
	public void pro()
	{
		System.out.println("Preson�� pro�Դϴ�.");
	}
}

/*class Student extends Person //���Ұ�
{	
	public void pro()
	{
		System.out.println("Student�� pro�Դϴ�.");
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
