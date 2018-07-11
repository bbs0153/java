package exam02;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();

		list.add("김종호");
		list.add("조성재");
		list.add("송명준");
		list.add("이태호");
		list.add("강서영");
		list.add("양동훈");
		System.out.println(list);

		list.add(2, "한상협");
		System.out.println(list);

		list.add(3, "이현진");
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		
		/*
		ArrayList<String> list = new ArrayList<String>();

		list.add("김종호");
		list.add("조성재");
		list.add("송명준");
		list.add("이태호");
		list.add("강서영");
		list.add("양동훈");
		System.out.println(list);

		list.add(2, "한상협");
		System.out.println(list);

		list.add(3, "이현진");
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		*/
	}

}
