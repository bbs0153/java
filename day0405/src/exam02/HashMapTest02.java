package exam02;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapTest02 {

	public static void main(String[] args) {
		
		LinkedHashMap map = new LinkedHashMap();
		
		map.put("�̸�", "����ȣ");
		map.put("����", 20);
		map.put("Ű", 183.7);
		map.put("�л�", true);
		
		System.out.println(map);
	}
}
