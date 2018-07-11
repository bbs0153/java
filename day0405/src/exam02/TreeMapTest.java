package exam02;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapTest {

	public static void main(String[] args) {
		
		TreeMap map = new TreeMap();
		
		map.put("이름", "이태호");
		map.put("나이", 20);
		map.put("키", 183.7);
		map.put("학생", true);
		
		int age = (Integer)map.get("나이");
		
		System.out.println(age);
		
		//System.out.println(map);
		
	}

}
