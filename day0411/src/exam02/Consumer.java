package exam02;

//�Һ��� Ŭ������ �ϼ��մϴ�.
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
