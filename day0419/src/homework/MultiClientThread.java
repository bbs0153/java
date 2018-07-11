package homework;

//��, ���� �ٸ� Ŭ���̾�Ʈ���� �� ���� 
//������ ������ �����ִ� �޼����� ����Ͽ� �޴� ������ �ϴ� Ŭ����
public class MultiClientThread extends Thread {
	// ���� �������� ���� ������ ���� �ִ� MultiClient�� �ɹ��� ���´�.
	private MultiClient mc;

	// �����ÿ� ���޵� MultiClient�� �ɹ��� �����Ѵ�.
	public MultiClientThread(MultiClient mc) {

		this.mc = mc;
	}

	// ����Ͽ� ������ �� �޼����� �ޱ����� �ڵ带 ����Ѵ�.
	public void run() {
		// ���۵� �޼����� �����ϱ� ���� ����
		String message = null;
		// ���۵� �޼����� ���̵�#���� �� ���� ���µ�
		// �̰��� #���� �и��Ͽ� ��� ���� �迭
		String[] receivedMsg = null;
		// ��ȭ�� ����� ������ ���¸� �����ϱ� ���� ����
		// �ʱⰪ false�� ����
		// isStop�� true�� �ԷµǸ� ����
		// �޼����� exit�� ���� true�� ����
		boolean isStop = false;

		// ó���� isStop�� false
		// !false
		while (!isStop) {

			try {
				// �������� �޼����� ����
				message = (String) mc.getOis().readObject();
				// �� �޼����� #���� �и��Ͽ� receivedMsg�� ����
				// receivedMsg[0] : tiger
				// receivedMsg[1]: ������ �ұ�
				receivedMsg = message.split("#");

			} catch (Exception e) {
				e.printStackTrace();
				// Ȥ�� ���ܰ� �߻��Ǹ� isStop�� true�� �����Ͽ� ����� �����ϵ��� �Ѵ�.
				isStop = true;
			}
			// ������ ���� �� �޼����� ����Ѵ�.
			System.out.println(receivedMsg[0] + "," + receivedMsg[1]);

			// ������ ���� �� �޼����� exit���� �Ǻ�
			if (receivedMsg[1].equals("exit")) {
				// exit�޼����� �Է��� id�� �ٷ� "��" ���� �Ǻ�
				if (receivedMsg[0].equals(mc.getId())) {
					// ���� �����ϵ��� �Ѵ�.
					mc.exit();
				} else {
					// �����ϴ� ����� ���� �ƴϸ�
					// ������������ �����մϴ�. �޼����� ���
					mc.getJta().append(receivedMsg[0] + "���� ���� �ϼ̽��ϴ�" + System.getProperty("line.separator"));
					// ���� �������� ������ �ؽ�Ʈ����� ��ũ�Ѹ� �����ִ� ����
					mc.getJta().setCaretPosition(mc.getJta().getDocument().getLength());
				}
			} else {
				// ��ȭ ������ "exit"�� �ƴ� �Ϲ� ��ȭ���� �϶�
				// ���� ���� ���� �ߴ��� �ؽ�Ʈ����� �߰��Ѵ�.
				// System.getProperty("line.separator")�� �ٲ� ���ڸ� �߰��Ѵ�.
				mc.getJta().append(receivedMsg[0] + ": " + receivedMsg[1] + System.getProperty("line.separator"));
				// �ؽ�Ʈ����� ��ġ�� ���� �Է��� ��ġ�� �����Ѵ�.
				mc.getJta().setCaretPosition(mc.getJta().getDocument().getLength());

			}

		}

	}

}
