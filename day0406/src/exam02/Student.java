package exam02;

public class Student {

	private String name;
	private String tel;
	private String addr;
	private int age;

	public Student() {
		super();
	}

	public Student(String name, String tel, String addr, int age) {
		super();
		this.name = name;
		this.tel = tel;
		this.addr = addr;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {

		boolean f = false;
		// 나의 이름 전화 주소가 매개변수로 전달받은 객체의 이름 전화 주소가
		// 동일한지 판별하여 true false를 반환
		Student s = (Student) obj;
		if (name.equals(s.name) && tel.equals(s.tel) && addr.equals(s.addr) && age == s.age) {
			f = true;
		}
		return f;
	}

}
