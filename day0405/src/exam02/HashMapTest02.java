package exam02;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapTest02 {

	public static void main(String[] args) {
		
		LinkedHashMap map = new LinkedHashMap();
		
		map.put("이름", "이태호");
		map.put("나이", 20);
		map.put("키", 183.7);
		map.put("학생", true);
		
		System.out.println(map);
	}
}
