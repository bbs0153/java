package exam02;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListTest03 {

	public static void main(String[] args) {
			
		 ArrayList list = new ArrayList();
		 	
		 list.add("ü��");
		 list.add("����");
		 list.add("���");
		 list.add("���");
		 list.add("����");
		 list.add("����");
		 
		 System.out.println(list);
		 
		  boolean f2 = list.remove("����");
		  boolean f = list.remove("���");
		 
		  System.out.println(list);
		 System.out.println(f);
	}

}
