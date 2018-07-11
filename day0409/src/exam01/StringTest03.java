package exam01;

import java.util.ArrayList;

public class StringTest03 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("java");
		list.add("oracle");

		int year = 2018;

		// list.add(year); 오류발생
		list.add(String.valueOf(year));
		
		double height = 168.7;
		list.add(height + "");

	}

}
