package exam02;

import java.util.Arrays;

public class ArrayTest03 {

	public static void main(String[] args) {

		int []arr = {7,5,1,9,15,2};  

		Arrays.sort(arr); //배열을 정렬 해줌
		
		int n = Arrays.binarySearch(arr,2); //반을 쪼개서 찾기 때문에 정렬을 해서 사용해야한다.
		System.out.println(n);
		
		
		
	
	}

}