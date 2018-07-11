package exam06;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class CheatServer {

	public static void main(String[] args) {

		try {
			byte[] data = new byte[100];

			ServerSocket server = new ServerSocket(1993);

			while (true) {

				Socket socket = server.accept();
				InputStream is = socket.getInputStream();

				is.read(data);
				String msg = new String(data);
				System.out.println("수신된 데이터: " + msg);

				Arrays.fill(data, (byte) 0);

				is.close();
				socket.close();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
