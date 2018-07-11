package exam05;

public class StringTest10 {

	public static void main(String[] args) {

		String msg = "hello korea hello java";

		// "k" 글자가 몇번째 위치에 있나요?

		int a = msg.indexOf("k");
		System.out.println(a);
		
		int b = msg.indexOf("hello");
		System.out.println(b);
		
		int c = msg.indexOf(" ");
		System.out.println(c);
		
		int d = msg.lastIndexOf("hello");
		System.out.println(d);
		
		int e = msg.indexOf("이태호");
		System.out.println(e);
	}

}
