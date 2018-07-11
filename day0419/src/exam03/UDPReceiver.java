package exam03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class UDPReceiver {

	public static void main(String[] args) {
		try {

			DatagramSocket socket = new DatagramSocket(1990);
			byte[] data = new byte[100];
			DatagramPacket packet = new DatagramPacket(data, data.length);

			while (true) {
				socket.receive(packet);
				// socket.close();
				String str = new String(data);
				System.out.println("수신된 데이터: " + str);

				Arrays.fill(data, (byte) 0);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}
}
