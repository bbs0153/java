package exam02;

import java.util.Arrays;

public class ArrayTest04 {

	public static void main(String[] args) {

		int []arr = {7,5,1,9,15,2};  

		Arrays.sort(arr); //�迭�� ���� ����
		
		int n = Arrays.binarySearch(arr,2); //���� �ɰ��� ã�� ������ ������ �ؼ� ����ؾ��Ѵ�.
		System.out.println(n);
		
		System.out.println(Arrays.toString(arr));
		
		//arr�迭�� ��� ����� ���� 1�� ä�� ����
		
		Arrays.fill(arr,1);
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
	
	}

}