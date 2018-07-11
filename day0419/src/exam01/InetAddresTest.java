package exam01;

import java.net.InetAddress;

public class InetAddresTest {

	public static void main(String[] args) {

		try {
			InetAddress addr = InetAddress.getByName("www.naver.com");
			System.out.println(addr);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
