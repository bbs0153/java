package exam02;

public class Producer extends Thread {

	private Product p;

	// �ɹ������� ���� �ʱ�ȭ???? >>>>>> �����ڿ���!!!!

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
