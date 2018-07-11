package homework;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Chekup {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		GregorianCalendar calendar = new GregorianCalendar();

		int year = calendar.get(Calendar.YEAR);

		System.out.println("�ֹι�ȣ 7�ڸ��� �Է��ϼ��� (-����)");
		String age = sc.next();

		if (age.length() != 7) {
			System.out.println("�߸��Է��ϼ̽��ϴ� �ٽ��Է��� �ּ���.");
			return;
		}

		int age1 = Integer.parseInt(age.substring(0, 2));

		if (year - (age1 + 1900) <= 40 || (year - (age1 + 1900)) % 2 == 1) {

			System.out.println("�ϰ��� ����� �ƴմϴ�.");
			return;
		}

		if (age.substring(6).equals("1") && year - (age1 + 1900) <= 49) {
			System.out.println("40�� �̻� ���� ==> ����, ����");
		} else if (age.substring(6).equals("1") && year - (age1 + 1900) >= 50) {
			System.out.println("50�� �̻� ���� ==> ����, ����, �����");
		} else if (age.substring(6).equals("2") && year - (age1 + 1900) <= 49) {
			System.out.println("40�� �̻� ���� ==> ����, ����, �����, �ڱþ�");
		} else if (age.substring(6).equals("2") && year - (age1 + 1900) >= 50) {
			System.out.println("50�� �̻� ���� ==> ����, ����, �����, �����, �ڱþ�");
		}

	}
}
