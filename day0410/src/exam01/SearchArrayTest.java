package exam01;

import java.io.NotActiveException;

/*
  	���ڸ� �����ϰ� �ִ� �迭�� �޾Ƽ� ������ ���ڸ� ã�� Ŭ���� �ۼ�
 
 */

class NotFoundException extends Exception {

	public NotFoundException(String msg) {
		super(msg);
	}

}

class SearchArray {

	public SearchArray(int[] arr, int v) {

		 try {
		int i;
		for (i = 0; i < arr.length; i++) {

			if (arr[i] == v) {
				System.out.println(v + "�� �迭�� �ֽ��ϴ�.");
				break;
			}
		}

		 if (i == arr.length) {
		System.out.println(v + "�� �迭�� �����ϴ�.");
		 throw new NotActiveException(v + "�� �迭�� �����ϴ�");
		 }

		} catch (NotActiveException e) {
		 System.out.println("���� �߻� :" + e.getMessage());
		 }
	}
}

public class SearchArrayTest {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		int v = 300;
		
			SearchArray s = new SearchArray(arr, v);
		
	
	}

}
