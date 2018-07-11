package exam02;

public class ProducerAndConsumerTest {

	public static void main(String[] args) {

		Product p = new Product();
		Producer pro = new Producer(p);
		Consumer con = new Consumer(p);

		pro.start();
		con.start();

	}

}
