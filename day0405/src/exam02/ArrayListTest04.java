package exam02;

import java.util.ArrayList;

public class ArrayListTest04 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		//��鼭 ���� �߿��ϰ� �����ϴ� ��
		list.add("��");
		list.add("�ǰ�");
		list.add("�ູ");
		list.add("���");
		list.add("�ڽ�");
		
		for(int i = 0; i<list.size(); i++){
		
			System.out.println(list.get(i));
		}
		
		/*
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		*/
	}

}
