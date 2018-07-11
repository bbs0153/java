package exam03;

import java.util.HashMap;

public class MapTest01 {

	public static void main(String[] args) {
		
		HashMap str = new HashMap();
		
		str.put(0, "가위");
		str.put(1, "바위");
		str.put(2, "보");
		
		int user = 1;
		int com = 2;
		
		System.out.println("사용자:"+str.get(user)); 
		System.out.println("컴퓨터:"+str.get(com)); 
	}
}
