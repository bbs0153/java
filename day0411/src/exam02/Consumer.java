package exam02;

//소비자 클래스를 완성합니다.
public class Consumer extends Thread {

	private Product p;

	public Consumer(Product p) {
		super();
		this.p = p;
	}

	public void run() {

		for (int i = 1; i <= 10; i++) {

			p.getNumber();
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}

}
