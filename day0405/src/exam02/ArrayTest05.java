package exam02;

import java.util.Arrays;

public class ArrayTest05 {

	public static void main(String[] args) {

		int []a = {7,5,1,9,15,2};  
		int []b = {7,5,1,9,15,2,5};  
		
		boolean c = Arrays.equals(a,b);
		
		if(c==true){
			
			System.out.println("배열이 같습니다.");
		}
		else {
			System.out.println("배열이 같지않습니다.");
		}

		
		
		
		
		
	
	}

}