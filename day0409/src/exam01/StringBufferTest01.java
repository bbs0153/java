package exam01;

public class StringBufferTest01 {

	public static void main(String[] args) {

		StringBuffer sb2 = new StringBuffer("ģ���� ����߳�");
		sb2.insert(0, "ģ���� ");
		System.out.println(sb2);

		StringBuffer sb = new StringBuffer("hello");

		System.out.println(sb.append(" java"));
		System.out.println(sb);
	}

}
