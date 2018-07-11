package exam02;

import java.util.ArrayList;

public class ArrayListTest05 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		//살면서 제일 중요하게 생각하는 것
		list.add("돈");
		list.add("건강");
		list.add("행복");
		list.add("사랑");
		list.add("자신");
		
		for(Object str :list){
			
			System.out.println(str);
		}
	}
}
