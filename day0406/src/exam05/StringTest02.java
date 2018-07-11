package exam05;

public class StringTest02 {

	public static void main(String[] args) {

		String str = "hello     ";
		int n = str.length();
		System.out.println(n);

		String str2 = str.trim();
		int a = str.length();
		int b = str2.length();
		
		System.out.println(a);
		System.out.println(b);

	}

}
