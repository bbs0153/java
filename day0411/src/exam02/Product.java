package exam02;

import java.util.Random;

public class Product {

	private int n;

	// 생산자는 계속하여 새로운 정수 n을 만드는 일을 하도록 한다.
	// 소비자는 생산자가 생산한 새로운 정수를 가져다 쓰는 일을 하도록 한다.

	// 새로운 정수가 생산되었는지 그렇지 않은지 상태를 저장할 변수
	boolean isNew;
	// 생산자가 새로운 정수를 만들어 n에 담는 순간 isNew를 true를 담고
	// 소비자가 이 정수를 가져다 쓰는 순간 isNew False 담을 예정.

	// 생산자가 새로운 정수 만드는 메소드
	public synchronized void makeNumber() {

		// 1~100 사이의 난수를 만들어 n에다 저장
		while (isNew == true) {
			try {
				wait();
			} catch (Exception e) {
			}
		}

		Random r = new Random();
		n = r.nextInt(100) + 1;

		System.out.println("생산자가 새로운 제품을 생산함:" + n);

		notify();
		isNew = true;

	}

	// 소비자가 정수를 가져다 쓰는 메소드
	public synchronized int getNumber() {

		while (isNew == false) {
			try {
				wait();
			} catch (Exception e) {
			}
		}

		System.out.println("소비자가 새로운 제품을 소비함:" + n);

		notify();
		isNew = false;
		return n;
	}

}
