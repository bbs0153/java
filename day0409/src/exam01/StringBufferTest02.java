package exam01;

public class StringBufferTest02 {
	
	public static void pro(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("insert ");
		
		sb.append("into member");
		sb.append("asldksdflkj");
		
		pro(sb.toString());
	}
	
}
