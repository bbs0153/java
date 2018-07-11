package exam02;

/*
	RuntimeException의 후손들은 사용자가 특별히 예외처리 하지 않아도 된다.
	
	우리가 만든 예외는 RuntimeException의 후손이 아니므로 반드시 예외처리 해야한다.
	
	그 이외의 모든 예외는 반드시 사용자가 예외처리를 해야 한다.
	
	java.io
	java.net
	java.sql
	
 */

class MyException extends Exception {
	
	public MyException(String msg) {
		super(msg);
	}
}

public class ExceptionTest {

	public static void main(String[] args) {

		try {
		throw new MyException("예외 발생");
		}catch(Exception e) {
			
		}
		//throw new ArrayIndexOutOfBoundsException();
	}

}
