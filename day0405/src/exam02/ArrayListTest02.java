package exam02;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListTest02 {

	public static void main(String[] args) {
			
		 ArrayList list = new ArrayList();
		 	
		 list.add("ü��");
		 list.add("����");
		 list.add("���");
		 list.add("���");
		 list.add("����");
		 list.add("����");
		 
		 System.out.println(list);
		 
		String removed = (String)list.remove(2);
		 
		System.out.println(removed); 
		System.out.println(list);
		 
		
	}

}
