package exam02;

import java.util.Random;
import java.util.TreeSet;

public class LottoTest02 {

	public static void main(String[] args) {
			
		//Set�� Ramdom�� �̿��Ͽ� 
		//�ζ� ��õ ���α׷��� �ۼ�
		Random random = new Random();
		TreeSet set = new TreeSet();
		
		while(set.size()<6){
			set.add(random.nextInt(45)+1);
		}
		System.out.println(set);
	}
}
