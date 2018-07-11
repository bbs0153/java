package exam02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		
		int []lotto = {7,14,1,8,33,21};
			
		//Arrays 클래스의 static메소드인
		//sort를 사용하여 배열을 정렬 해 봅시다.
		Arrays.sort(lotto);
		
		//Arrays 클래스의 static toString()을 이용하여
		//로또 배열의 내용을 문자열로 만들어 봅시다
		
		String str = Arrays.toString(lotto);
		
		System.out.println(str);
	}

}
