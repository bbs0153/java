package exam05;

public class StringTest10 {

	public static void main(String[] args) {

		String msg = "hello korea hello java";

		// "k" ���ڰ� ���° ��ġ�� �ֳ���?

		int a = msg.indexOf("k");
		System.out.println(a);
		
		int b = msg.indexOf("hello");
		System.out.println(b);
		
		int c = msg.indexOf(" ");
		System.out.println(c);
		
		int d = msg.lastIndexOf("hello");
		System.out.println(d);
		
		int e = msg.indexOf("����ȣ");
		System.out.println(e);
	}

}
