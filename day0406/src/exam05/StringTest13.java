package exam05;

public class StringTest13 {

	public static void main(String[] args) {

		String email = "tiger@nate.com";

		int idxAt = email.indexOf("@");
		// 5
		int idxAt2 = email.indexOf("@", idxAt + 1);
		// -1

		if (idxAt > 0 && idxAt2 == -1) {

			System.out.println("�ùٸ� �̸��� �Դϴ�.");
		} else {
			System.out.println("�ùٸ� �̸����� �ƴմϴ�.");
		}
	}

}
