package exam02;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(1992);

			Random r = new Random();

			while (true) {

				Socket socket = server.accept();

				System.out.println("클라이언트가 접속 했어요");

				OutputStream os = socket.getOutputStream();
				Thread.sleep(1000);

				for (int i = 1; i <= 10; i++) {
					int n = r.nextInt(101);
					os.write(n);
				}
				os.close();
				socket.close();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
