package exam02;

import java.util.ArrayList;

public class ArrayListTest05 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		//��鼭 ���� �߿��ϰ� �����ϴ� ��
		list.add("��");
		list.add("�ǰ�");
		list.add("�ູ");
		list.add("���");
		list.add("�ڽ�");
		
		for(Object str :list){
			
			System.out.println(str);
		}
	}
}
