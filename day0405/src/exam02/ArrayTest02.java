package exam02;

import java.util.Arrays;

public class ArrayTest02 {

	public static void main(String[] args) {

		int []arr = {10,20,30,40,50};
		//배열안에 값 40을 포함하고 있는 확인
		//Arrays클래스의 static binarySearch를 이용해보자
		
		int n = Arrays.binarySearch(arr,40);
		
		System.out.println(n);
		
		int a = Arrays.binarySearch(arr,90);
		
		System.out.println(a);
	}

}
