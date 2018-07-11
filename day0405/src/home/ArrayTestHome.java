package home;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	private String name;
	private String addr;
	private String call;

	public Student() {
	}

	public Student(String name, String addr, String call) {
		super();
		this.name = name;
		this.addr = addr;
		this.call = call;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	public String toString() {
		return "이름: " + name + ", 주소: " + addr + ", 전화번호: " + call;
	}
}

public class ArrayTestHome {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		Student s = new Student("변성인", "인천", "01050067286");
		Student s2 = new Student("홍길동", "서울", "01050067286");
		Student s3 = new Student("도깨비", "부산", "01050067286");
		Student s4 = new Student("저승사자", "진주", "01050067286");

		list.add(s);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		int a;
		String str, b, c; // 이름 ,주소, 번호

		while (true) {

			System.out.println("1번 학생정보 추가 2번 학생정보 삭제 3번 학생정보 확인 4번 학생정보 검색 5번 종료");
			a = sc.nextInt();

			switch (a) {
			case 1:
				System.out.println("학생정보를 추가합니다.");
				System.out.println("학생의 이름");
				str = sc.next();
				System.out.println("학생의 주소");
				b = sc.next();
				System.out.println("학생의 전화번호");
				c = sc.next();

				Student ss = new Student(str, b, c);

				list.add(ss);
				break;

			case 2:
				System.out.println("학생정보를 삭제합니다.");

				System.out.println("학생의 이름");
				str = sc.next();

				for (int i = 0; i < list.size(); i++) {

					if ((list.get(i)).getName().equals(str)) {
						list.remove(i);
						break;
					}
				}
				break;

			case 3:
				for (Object obj : list) {

					System.out.println(obj);
				}
				break;

			case 4:
				System.out.println("학생정보를 검색합니다.");
				System.out.println("학생의 이름");
				str = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if ((list.get(i)).getName().equals(str)) {
						System.out.println(list.get(i));
						break;
					}
				}
				break;

			case 5:
				System.out.println("종료합니다.");
				return;

			}
		}
	}
}
