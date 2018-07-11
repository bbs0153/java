package exam02;

public class Producer extends Thread {

	private Product p;

	// 맴버변수는 언제 초기화???? >>>>>> 생성자에서!!!!

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {

			p.makeNumber();
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}

	public Producer(Product p) {
		this.p = p;
	}
}
