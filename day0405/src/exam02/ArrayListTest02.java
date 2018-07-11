package exam02;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListTest02 {

	public static void main(String[] args) {
			
		 ArrayList list = new ArrayList();
		 	
		 list.add("Ã¼¸®");
		 list.add("¸Á°í");
		 list.add("¸á·Ð");
		 list.add("»ç°ú");
		 list.add("¼ö¹Ú");
		 list.add("¸Á°í");
		 
		 System.out.println(list);
		 
		String removed = (String)list.remove(2);
		 
		System.out.println(removed); 
		System.out.println(list);
		 
		
	}

}
