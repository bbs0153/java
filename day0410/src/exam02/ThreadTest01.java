package exam02;

import java.sql.Date;

class Count extends Thread {

	public void run() {

		while (true) {
			
			Date today = new Date(0);
			System.out.println("æ»≥Á«œººø‰" + today);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

public class ThreadTest01 {

	public static void main(String[] args) {

		Count c = new Count();

		c.start();
	}
}