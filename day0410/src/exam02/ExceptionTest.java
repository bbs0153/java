package exam02;

/*
	RuntimeException�� �ļյ��� ����ڰ� Ư���� ����ó�� ���� �ʾƵ� �ȴ�.
	
	�츮�� ���� ���ܴ� RuntimeException�� �ļ��� �ƴϹǷ� �ݵ�� ����ó�� �ؾ��Ѵ�.
	
	�� �̿��� ��� ���ܴ� �ݵ�� ����ڰ� ����ó���� �ؾ� �Ѵ�.
	
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
		throw new MyException("���� �߻�");
		}catch(Exception e) {
			
		}
		//throw new ArrayIndexOutOfBoundsException();
	}

}
