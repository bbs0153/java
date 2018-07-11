package homework;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiServer {
	// ������ ��û�� Ŭ���̾�Ʈ�� ��� ���� list �� ����
	// list�� ��� �ڷ��� MultiServerThread�� �Ѹ��� Ŭ���̾�Ʈ��
	// ����ϱ� ���� Thread
	private ArrayList<MultiServerThread> list;

	// Ŭ���̾�Ʈ�� ������ ��û�ϸ� �� ��û�� �����Ͽ�
	// Ŭ���̾�Ʈ�� �����͸� �ְ� �ޱ� ���� ������ socket�� ����
	private Socket socket;

	public MultiServer() throws IOException {

		// list�� ����
		list = new ArrayList<MultiServerThread>();
		// TCP����� ����� ���Ͽ� ��Ʈ��ȣ 5000������ ���������� ����
		ServerSocket serverSocket = new ServerSocket(5000);
		// Ŭ���̾�Ʈ�� ������ ��û�ϸ�
		// �� Ŭ���̾�Ʈ�� 1:1�� ����ϱ� ���� Thread ����
		MultiServerThread mst = null;
		// ������ ��� ������ ������ ���¸� ���� ����
		// �ʱⰪ�� false�� ����
		boolean isStop = false;

		// !false == > true ==> ��� ����
		// ���Ḧ ���ϴ� ������ ��𿡼��� isStop�� true�� �����ϸ� ������ ����
		while (!isStop) {

			// ���ٰ� �����Ǿ����� ��Ÿ���� ���Ͽ� ���
			System.out.println("Server ready....");
			// Ŭ���̾�Ʈ�� ������ ��û�ϴ� ���� ��û�� �����ϴ�
			// accept�޼ҵ尡 ���۵ǰ� �� Ŭ���̾�Ʈ�� �����͸� �ְ� �ޱ� ���� ������ ������ ����
			// Ŭ���̾�Ʈ�� ��û�� �� ���� ������ socket�� ������
			socket = serverSocket.accept();

			// ������ ���ÿ� �������� ����ؾ� �ϱ� ������
			// ������ Ŭ���̾�Ʈ�� ����ϱ� ���ؼ���
			// ������ Ŭ���̾�Ʈ�� 1:1 ����ϴ� ����
			// MultiServerThread���� �ñ��.

			// ���� ��û�� Ŭ���̾�Ʈ�� ����ϱ� ���Ͽ�
			// �� �ڽ�(MultiServer ==> Socket,list)�� �Ű������� �ϴ�
			// MultiServerThread ��ü�� �����Ͽ� �׿��� �ñ��.
			mst = new MultiServerThread(this);
			// ��û�� Ŭ���̾�Ʈ�� ���� ��� 3���̶�� ��������
			// ������,�۸���,����ȣ
			// ���� �������� hello? ��� �ϸ�
			// ���� ������ ��� Ŭ���̾�Ʈ�� ���� �������� ���� "hello?"�� ����ؾ� �Ѵ�.
			// �׷��� ���� ��û�� Ŭ���̾�Ʈ���� ��� �����ϰ� �־�� �� ���̴�.
			// ��û�� ���� Ŭ���̾�Ʈ�� ����ϴ� ��ü MultiServerThread ��ü ������
			// mst�� list�� ��´�.
			list.add(mst);
			// Thread�� �����Ѵ�.
			// MultiSeverThread�� run�޼ҵ忡��
			// Ŭ���̾�Ʈ�� ����Ͽ� ����ϴ� �ڵ带 �ű⿡ ����Ѵ�.
			// �ű�==> MultiServerThread�� run
			// Ŭ���̾�Ʈ�� �ִ� �޼�����
			// ��� �ٸ� Ŭ���̾�Ʈ(���� ����)���� �� �޼����� ����ϴ� �ڵ尡 �;� �Ѵ�.
			Thread t = new Thread(mst);
			t.start();

		}

	}

	public ArrayList<MultiServerThread> getList() {

		return list;
	}

	public Socket getSocket() {

		return socket;
	}

	public static void main(String arg[]) throws IOException {

		new MultiServer();
	}

}
