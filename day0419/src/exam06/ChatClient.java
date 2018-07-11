package exam06;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

	public static void main(String[] args) {

		try {

			String ip = args[0];
			int port = Integer.parseInt(args[1]);

			Socket socket = new Socket(ip, port);

			OutputStream os = socket.getOutputStream();
			Scanner sc = new Scanner(System.in);

			while (true) {

				System.out.print("ют╥б==>");
				String msg = sc.next();

				os.write(msg.getBytes());

				if (msg.equals("q!")) {
					break;
				}
			}

			os.close();
			socket.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
