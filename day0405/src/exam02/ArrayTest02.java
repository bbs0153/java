package exam02;

import java.util.Arrays;

public class ArrayTest02 {

	public static void main(String[] args) {

		int []arr = {10,20,30,40,50};
		//�迭�ȿ� �� 40�� �����ϰ� �ִ� Ȯ��
		//ArraysŬ������ static binarySearch�� �̿��غ���
		
		int n = Arrays.binarySearch(arr,40);
		
		System.out.println(n);
		
		int a = Arrays.binarySearch(arr,90);
		
		System.out.println(a);
	}

}
