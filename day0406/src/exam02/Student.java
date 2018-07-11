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
		// ���� �̸� ��ȭ �ּҰ� �Ű������� ���޹��� ��ü�� �̸� ��ȭ �ּҰ�
		// �������� �Ǻ��Ͽ� true false�� ��ȯ
		Student s = (Student) obj;
		if (name.equals(s.name) && tel.equals(s.tel) && addr.equals(s.addr) && age == s.age) {
			f = true;
		}
		return f;
	}

}
