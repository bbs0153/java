package exam02;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�츮���� �����ϴ� �����̸����� 
		//�����ϰ��� �Ѵ�
		
		//String names[] = {};
		
		TreeSet names = new TreeSet();
		
		names.add("�ٳ���");
		names.add("����");
		names.add("������");
		names.add("���ξ���");
		boolean a = names.add("������");
		boolean b = names.add("����");
		
		System.out.println(names.toString());
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(names.size());
		
	
	
	}

}
