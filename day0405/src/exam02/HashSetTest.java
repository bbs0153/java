package exam02;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�츮���� �����ϴ� �����̸����� 
		//�����ϰ��� �Ѵ�
		
		//String names[] = {};
		
		HashSet names = new HashSet();
		
		names.add("�ٳ���");
		names.add("����");
		names.add("������");
		names.add("���ξ���");
		boolean a = names.add("������");
		boolean b = names.add("����");
		
		System.out.println(names.toString());
		System.out.println(a);
		System.out.println(b);
		
	
	
	}

}
