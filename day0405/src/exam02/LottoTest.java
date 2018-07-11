package exam02;

import java.util.Random;
import java.util.TreeSet;

public class LottoTest {

	public static void main(String[] args) {
			
		//Set과 Ramdom을 이용하여 
		//로또 추천 프로그램을 작성
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
