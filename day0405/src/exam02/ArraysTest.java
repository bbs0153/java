package exam02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		
		int []lotto = {7,14,1,8,33,21};
			
		//Arrays Ŭ������ static�޼ҵ���
		//sort�� ����Ͽ� �迭�� ���� �� ���ô�.
		Arrays.sort(lotto);
		
		//Arrays Ŭ������ static toString()�� �̿��Ͽ�
		//�ζ� �迭�� ������ ���ڿ��� ����� ���ô�
		
		String str = Arrays.toString(lotto);
		
		System.out.println(str);
	}

}
