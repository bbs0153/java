package exam02;

import java.io.InputStream;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {

		try {
			Socket socket = new Socket("203.236.209.107", 1992);

			InputStream is = socket.getInputStream();

			for (int i = 1; i <= 10; i++) {

				int n = is.read();
				System.out.println("서버로 부터 받은 데이터: " + n);
			}

			is.close();
			socket.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
