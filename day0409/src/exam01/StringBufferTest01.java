package exam01;

public class StringBufferTest01 {

	public static void main(String[] args) {

		StringBuffer sb2 = new StringBuffer("친구를 사랑했네");
		sb2.insert(0, "친구의 ");
		System.out.println(sb2);

		StringBuffer sb = new StringBuffer("hello");

		System.out.println(sb.append(" java"));
		System.out.println(sb);
	}

}
