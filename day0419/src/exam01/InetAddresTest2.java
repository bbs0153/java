package exam01;

import java.net.InetAddress;

public class InetAddresTest2 {

	public static void main(String[] args) {

		try {
			InetAddress[] addr = InetAddress.getAllByName("www.naver.com");

			for (InetAddress ad : addr) {

				System.out.println(ad);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
