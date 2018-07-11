package homework;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Chekup {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		GregorianCalendar calendar = new GregorianCalendar();

		int year = calendar.get(Calendar.YEAR);

		System.out.println("주민번호 7자리를 입력하세요 (-제외)");
		String age = sc.next();

		if (age.length() != 7) {
			System.out.println("잘못입력하셨습니다 다시입력해 주세요.");
			return;
		}

		int age1 = Integer.parseInt(age.substring(0, 2));

		if (year - (age1 + 1900) <= 40 || (year - (age1 + 1900)) % 2 == 1) {

			System.out.println("암건진 대상이 아닙니다.");
			return;
		}

		if (age.substring(6).equals("1") && year - (age1 + 1900) <= 49) {
			System.out.println("40세 이상 남성 ==> 위암, 간암");
		} else if (age.substring(6).equals("1") && year - (age1 + 1900) >= 50) {
			System.out.println("50세 이상 남성 ==> 위암, 간암, 대장암");
		} else if (age.substring(6).equals("2") && year - (age1 + 1900) <= 49) {
			System.out.println("40세 이상 여성 ==> 위암, 간암, 유방암, 자궁암");
		} else if (age.substring(6).equals("2") && year - (age1 + 1900) >= 50) {
			System.out.println("50세 이상 여성 ==> 위암, 간암, 대장암, 유방암, 자궁암");
		}

	}
}
