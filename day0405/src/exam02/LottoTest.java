package exam02;

import java.util.Random;
import java.util.TreeSet;

public class LottoTest {

	public static void main(String[] args) {
			
		//Set�� Ramdom�� �̿��Ͽ� 
		//�ζ� ��õ ���α׷��� �ۼ�
		Random random = new Random();
		TreeSet set = new TreeSet();
		
		while(true) {
			set.add(random.nextInt(45)+1);
			if(set.size() == 6){
				break;
			}
		}
		System.out.println(set);
	}
}
