package exam03;

import java.util.HashMap;

public class MapTest01 {

	public static void main(String[] args) {
		
		HashMap str = new HashMap();
		
		str.put(0, "����");
		str.put(1, "����");
		str.put(2, "��");
		
		int user = 1;
		int com = 2;
		
		System.out.println("�����:"+str.get(user)); 
		System.out.println("��ǻ��:"+str.get(com)); 
	}
}
