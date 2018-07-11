package exam02;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListTest03 {

	public static void main(String[] args) {
			
		 ArrayList list = new ArrayList();
		 	
		 list.add("Ã¼¸®");
		 list.add("¸Á°í");
		 list.add("¸á·Ð");
		 list.add("»ç°ú");
		 list.add("¼ö¹Ú");
		 list.add("¸Á°í");
		 
		 System.out.println(list);
		 
		  boolean f2 = list.remove("µþ±â");
		  boolean f = list.remove("¸á·Ð");
		 
		  System.out.println(list);
		 System.out.println(f);
	}

}
