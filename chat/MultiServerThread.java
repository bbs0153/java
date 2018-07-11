import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class MultiServerThread implements Runnable {

	private Socket socket;
	private MultiServer ms;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;

	public MultiServerThread(MultiServer ms) {

		this.ms = ms;

	}

	@Override
	public synchronized void run() {

		boolean isStop = false;
		try {

			socket = ms.getSocket();
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
			String message = null;

			while (!isStop) {

				message = (String) ois.readObject();
				String[] str = message.split("#");
				if (str[1].endsWith("exit")) {

					broadCasting(message);
					isStop = true;
				} else {

					broadCasting(message);
				}

			}

			ms.getList().remove(this);
			System.out.println(socket.getInetAddress() + "���������� �����ϼ̽��ϴ�.");
			System.out.println("list size : " + ms.getList().size());

		} catch (Exception e) {
			ms.getList().remove(this);
			System.out.println(socket.getInetAddress() + "������������ �����ϼ̽��ϴ�.");
			System.out.println("list size : " + ms.getList().size());
		}
	}

	private void broadCasting(String message) throws IOException {

		for (MultiServerThread ct : ms.getList()) {

			ct.send(message);
		}
	}

	private void send(String message) throws IOException {

		oos.writeObject(message);

	}

}