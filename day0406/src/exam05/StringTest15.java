package exam05;

public class StringTest15 {

	public static void main(String []args) {
		
		String email = "tiger@nate.com";
		
		//�̸��Ϸ� ���� id�� �����Ͽ� ���
		
		System.out.println(email.substring(0, (email.indexOf("@"))));
		System.out.println(email.substring(6, email.indexOf(".")));
		
	}
}
