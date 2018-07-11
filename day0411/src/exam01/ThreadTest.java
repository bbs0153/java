package exam01;

class Person extends Thread {

	String name;

	public Person(String name) {

		this.name = name;
	}

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("hello " + name + "!");

			try {
				Thread.sleep(100);
			} catch (Exception e) {

			}
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {

		Person p1 = new Person("이현진");
		Person p2 = new Person("이태호");

		p1.start();
		p2.start();
	}

}
