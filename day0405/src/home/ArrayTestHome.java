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
		return "�̸�: " + name + ", �ּ�: " + addr + ", ��ȭ��ȣ: " + call;
	}
}

public class ArrayTestHome {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		Student s = new Student("������", "��õ", "01050067286");
		Student s2 = new Student("ȫ�浿", "����", "01050067286");
		Student s3 = new Student("������", "�λ�", "01050067286");
		Student s4 = new Student("���»���", "����", "01050067286");

		list.add(s);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		int a;
		String str, b, c; // �̸� ,�ּ�, ��ȣ

		while (true) {

			System.out.println("1�� �л����� �߰� 2�� �л����� ���� 3�� �л����� Ȯ�� 4�� �л����� �˻� 5�� ����");
			a = sc.nextInt();

			switch (a) {
			case 1:
				System.out.println("�л������� �߰��մϴ�.");
				System.out.println("�л��� �̸�");
				str = sc.next();
				System.out.println("�л��� �ּ�");
				b = sc.next();
				System.out.println("�л��� ��ȭ��ȣ");
				c = sc.next();

				Student ss = new Student(str, b, c);

				list.add(ss);
				break;

			case 2:
				System.out.println("�л������� �����մϴ�.");

				System.out.println("�л��� �̸�");
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
				System.out.println("�л������� �˻��մϴ�.");
				System.out.println("�л��� �̸�");
				str = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if ((list.get(i)).getName().equals(str)) {
						System.out.println(list.get(i));
						break;
					}
				}
				break;

			case 5:
				System.out.println("�����մϴ�.");
				return;

			}
		}
	}
}
