package homework;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

//��û�� Ŭ���̾�Ʈ�� 1:1 ����� ���� Ŭ����
public class MultiServerThread implements Runnable {
	// �����͸� �ְ� �ޱ� ���� ������ socket�� �ɹ������� ����.
	private Socket socket;
	// �� Ŭ������ MultiServer�� ���ؼ� �����ǰ�
	// �� �� �Ű������� MultiServer�� ���� �޴´�.
	// �װ��� ��� ���� ����
	private MultiServer ms;

	// Ŭ���̾�Ʈ�� ������ �����͸� �� �����⵵ �ϰ� �о���̱⵵ �ؾ� �� ���̴�.

	// ������ ������ �����͸� �б� ���� stream
	private ObjectInputStream ois;
	// ���� �ϰ� ���� ���� ������ ������ ���� stream
	private ObjectOutputStream oos;

	// MultiServerThread�� ������
	// MultiServer�� ���ؼ� �����ǰ�
	// �����ÿ� �����ؿ� MultiServer ������ ms�� ��´�.
	public MultiServerThread(MultiServer ms) {

		this.ms = ms;

	}

	// MultiSever���� Thread�� ������Ű�� ����
	// start�� ȣ���ϸ�
	// run�� ������
	// ���� ������ Ŭ���̾�Ʈ�� 1:1 ����Ͽ� ��ȭ�ϴ� ������ ����Ѵ�.
	// Ŭ���̾����� ���� �� �޼����� �ٸ� ���Ŭ���̾�Ʈ���� ����Ѵ�.
	@Override
	public synchronized void run() {
		// ���� ����ϰ� �ִ� Ŭ���̾�Ʈ�� ����� �ߴ��ϱ� ���� ���º����� ����
		// ó���� false�� ����
		// ���Ḧ ���ϴ� �������� isStop true�� �����Ͽ� �����ϵ��� �Ѵ�.
		boolean isStop = false;

		try {
			// ��û�� Ŭ���̾�Ʈ�� ������ ��� �ִ� ms ��ü�� ���
			// �����͸� �ְ� �ޱ� ���� socket�� ��� �´�.
			socket = ms.getSocket();
			// socket���� ���� �����͸� �б� ���� stream�� �����Ѵ�.
			ois = new ObjectInputStream(socket.getInputStream());
			// socket���� ���� �����͸� �� ������ ���� stream�� �����Ѵ�.
			oos = new ObjectOutputStream(socket.getOutputStream());
			// Ŭ���̾�Ʈ�� ���� �� �޼����� ������ ����
			String message = null;
			// isStop == false
			// !false ��� ���� ��Ȳ ==>
			// ����� �ߴ��ϱ� ���ؼ��� ��𼱰� isStop�� true��
			// �����Ͽ� �����Ѵ�.
			while (!isStop) {
				// ���� ���� ��� �ϰ� �ִ� Ŭ���̾�Ʈ�� �� �޼�����
				// message�� �����Ѵ�.
				message = (String) ois.readObject();
				// Ŭ���̾�Ʈ�� ���� ���� �޼����� ������̸�#�ϰ���� ��
				// ������#hello?
				// ����� �̸��� �޼����� �и��Ѵ�.
				// str[0]: ������
				// str[1]: hello?
				String[] str = message.split("#");
				// ���� �� Ŭ���̾�Ʈ�� �� �޼����� ������ "exit"�̸�
				// endsWith�� StringŬ������ �޼ҵ��̸�
				// �� ���ڿ��� Ư�� �������� ��������? �Ǻ��ϴ� �޼ҵ�
				if (str[1].endsWith("exit")) {
					// �� Ŭ���̾�Ʈ�� �� �޼�����
					// ��� �ٸ�Ŭ���̾�Ʈ�� ���� ����Ѵ�.
					broadCasting(message);
					// �� Ŭ���̾�Ʈ�� ��ȭ�� �����ϱ� ���Ͽ�
					// isStop�� true�� ����
					isStop = true;

				} else {
					// ��ȭ�� ������ "exit"�� �ƴ϶��
					// �ٸ� ��� Ŭ���̾�Ʈ������ �� �޼����� ����Ѵ�.
					broadCasting(message);
				}

			}
			// ���� while�� Ż�� �ߴٴ� �̾߱��
			// list�� ���� �� Ŭ���̾�Ʈ�� �����Ѵ�.
			ms.getList().remove(this);
			// ������ ��Ȳ�� ����Ѵ�
			System.out.println(socket.getInetAddress() + "���������� �����ϼ̽��ϴ�.");
			System.out.println("list size : " + ms.getList().size());

		} catch (Exception e) {
			ms.getList().remove(this);
			System.out.println(socket.getInetAddress() + "������������ �����ϼ̽��ϴ�.");
			System.out.println("list size : " + ms.getList().size());
		}
	}

	// Ư�� Ŭ���̾�Ʈ�� �� �޼����� �ٸ� ��� Ŭ���̾�Ʈ�� ���� ����Ѵ�.
	private void broadCasting(String message) throws IOException {

		// �Ű� ������ ���޹��� �޼����� ������
		// ��� Ŭ���̾�Ʈ�� ������ ��� list�� ���� �ϳ��� ������
		// ������ Ŭ���̾�Ʈ�� ���� �޼����� �����Ѵ�.
		for (MultiServerThread ct : ms.getList()) {

			ct.send(message);
		}
	}

	private void send(String message) throws IOException {

		// �޼����� �Ű������� ���� �޾�
		// ��� stream�� ���� �޼����� �� ������.
		oos.writeObject(message);

	}

}
