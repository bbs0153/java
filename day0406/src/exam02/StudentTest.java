package exam02;

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student("�۸���", "010-1234-5678", "��⵵ �Ⱦ��", 28);
		Student s2 = new Student("�۸���", "010-1234-5678", "��⵵ �Ⱦ��", 28);

		// ��ü���� ������ ==�����ڴ� ���� ���ϴ� ���� �ƴ϶�
		// ��� �ٶ󺸰� �ִ��� �˻��Ѵ�.

		if (s1.equals(s2)) {
			System.out.println("���ƿ�");
		}

		else {
			System.out.println("�޶��");
		}

	}

}