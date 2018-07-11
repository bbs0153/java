package exam04;

import java.util.concurrent.SynchronousQueue;

public class Student {

	private String name;
	private int kor;
	private int eng;
	private int math;

	@Override
	public boolean equals(Object obj) {

		boolean f = false;
		Student s = (Student) obj;

		if (name.equals(name) && kor == s.kor && eng == s.eng && math == s.math) {
			f = true;
		}
		return f;
	}

	public Student() {
		super();
	}

	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public static void main(String[] args) {

		Student s1 = new Student("변성인",50, 60, 70);
		Student s2 = new Student("변성인",50, 60, 70);

		if (s1.equals(s2)) {
			System.out.println("같아요");
		} else {
			System.out.println("틀려요");
		}
	}

}
