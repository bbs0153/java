package exam03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) {

		try {

			DatagramSocket socket = new DatagramSocket();

			String ip = args[0];
			int port = Integer.parseInt(args[1]);
			String msg = args[2];

			InetAddress addr = InetAddress.getByName(ip);
			byte[] data = msg.getBytes();

			DatagramPacket packet = new DatagramPacket(data, data.length, addr, port);
			socket.send(packet);
			socket.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
