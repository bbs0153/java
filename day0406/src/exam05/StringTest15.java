package exam05;

public class StringTest15 {

	public static void main(String []args) {
		
		String email = "tiger@nate.com";
		
		//이메일로 부터 id만 추출하여 출력
		
		System.out.println(email.substring(0, (email.indexOf("@"))));
		System.out.println(email.substring(6, email.indexOf(".")));
		
	}
}
