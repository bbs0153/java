package exam02;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapTest {

	public static void main(String[] args) {
		
		TreeMap map = new TreeMap();
		
		map.put("�̸�", "����ȣ");
		map.put("����", 20);
		map.put("Ű", 183.7);
		map.put("�л�", true);
		
		int age = (Integer)map.get("����");
		
		System.out.println(age);
		
		//System.out.println(map);
		
	}

}
