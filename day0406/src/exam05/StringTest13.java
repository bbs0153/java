package exam05;

public class StringTest13 {

	public static void main(String[] args) {

		String email = "tiger@nate.com";

		int idxAt = email.indexOf("@");
		// 5
		int idxAt2 = email.indexOf("@", idxAt + 1);
		// -1

		if (idxAt > 0 && idxAt2 == -1) {

			System.out.println("올바른 이메일 입니다.");
		} else {
			System.out.println("올바른 이메일이 아닙니다.");
		}
	}

}
