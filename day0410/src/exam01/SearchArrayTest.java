package exam01;

import java.io.NotActiveException;

/*
  	숫자를 저장하고 있는 배열을 받아서 지정된 숫자를 찾는 클래스 작성
 
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
				System.out.println(v + "는 배열에 있습니다.");
				break;
			}
		}

		 if (i == arr.length) {
		System.out.println(v + "는 배열에 없습니다.");
		 throw new NotActiveException(v + "는 배열에 없습니다");
		 }

		} catch (NotActiveException e) {
		 System.out.println("예외 발생 :" + e.getMessage());
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
