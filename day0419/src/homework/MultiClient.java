package homework;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//Ŭ���̾�Ʈ�� ���� Ŭ����
//�̺�Ʈ ó���� �ڱ� �ڽ��� �ϵ��� ����
public class MultiClient implements ActionListener {

	// ������ �����͸� �ְ� �ޱ� ���� socket�� ����
	private Socket socket;
	// ������ �� �޼����� �ޱ����� stream
	private ObjectInputStream ois;
	// �������� �����͸� �������� ���� stream
	private ObjectOutputStream oos;
	// â�� ���� ����� ���� Frame�� ����
	private JFrame jframe;
	// ���� �޼����� �Է��ϱ� ���� TexrField
	private JTextField jtf;
	private JTextArea jta;
	private JLabel jlb1, jlb2;
	private JPanel jp1, jp2;

	// ����ϰ��� �ϴ� ������ ip�� ������ ����
	private String ip;
	// ��ȭ���� ���̵� �����ϱ� ���� ����
	private String id;
	private JButton jbtn;

	// �����ÿ� ����ϰ��� �ϴ� ������ ip�ּҿ� ��ȭ���� id�� ���� �޴´�
	public MultiClient(String argIp, String argId) {

		// ���޹��� ip�� �ɹ������� �����Ѵ�
		ip = argIp;
		// ���޹��� id�� �ɹ������� �����Ѵ�
		id = argId;
		// �������� �����Ѵ�
		jframe = new JFrame("Multi Chatting");
		// ��ȭ�� �Է��ϱ� ���� �ؽ�Ʈ�ʵ带 �����Ѵ�
		jtf = new JTextField(30);
		// ��� ��ȭ������ ����ϱ� ���� �ؽ�Ʈ����� �����Ѵ�.
		jta = new JTextArea("", 10, 50);
		// ������ ��ȭ���� �̸��� ����ϱ� ���� ���� �����Ѵ�.
		jlb1 = new JLabel("Usage ID : [[" + id + "]]");
		// ����� ���ϴ� ������ ip�ּҸ� ����ϱ� ���� ���� �����Ѵ�.
		jlb2 = new JLabel("IP : " + ip);
		jbtn = new JButton("����");
		jp1 = new JPanel();
		jp2 = new JPanel();
		jlb1.setBackground(Color.yellow);
		jlb2.setBackground(Color.green);
		jta.setBackground(Color.pink);
		jp1.setLayout(new BorderLayout());
		jp2.setLayout(new BorderLayout());

		jp1.add(jbtn, BorderLayout.EAST);
		jp1.add(jtf, BorderLayout.CENTER);
		jp2.add(jlb1, BorderLayout.CENTER);
		jp2.add(jlb2, BorderLayout.EAST);

		jframe.add(jp1, BorderLayout.SOUTH);
		jframe.add(jp2, BorderLayout.NORTH);

		JScrollPane jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jframe.add(jsp, BorderLayout.CENTER);

		// �ؽ�Ʈ�ʵ�� ����ڰ� �޼����� �Է��ϴ� �뵵
		// ����Ű�� ���������� �̺�Ʈ ���
		jtf.addActionListener(this);
		// "����"��ư�� �̺�Ʈ ����
		jbtn.addActionListener(this);

		// �����ӿ� â�� ������ ������ �̺�Ʈ�� ����Ѵ�.
		jframe.addWindowListener(new WindowListener() {

			// �������� ������ �ؽ�Ʈ�ʵ忡 �ڵ����� ��Ŀ���� �����Ѵ�.
			@Override
			public void windowOpened(WindowEvent e) {

				jtf.requestFocus();
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			// â�� ���� ��
			// �������� id#exit�� �������� �Ѵ�.
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					oos.writeObject(id + "#exit");
				} catch (IOException ee) {

					ee.printStackTrace();
				}
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		// �ؽ�Ʈ������� ��� ��ȭ������ �����ֱ� �뵵�� ���������
		// ������ �� ������(�۾��� ���� ������) ����.
		jta.setEditable(false);
		// �������� ũ�⸦ �о� ��
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();

		int screenHeight = d.height;
		int screenWidth = d.width;
		// �������� ũ�⸦ ������Ʈ��
		// ���� �� �� �ֵ��� ũ�⸦ ����.
		jframe.pack();
		// �������� ��ġ�� ȭ����
		// ��ǻ�� ȭ���� ��� ǥ��
		jframe.setLocation((screenWidth - jframe.getWidth()) / 2, (screenHeight - jframe.getHeight()) / 2);
		// �������� ũ�⸦ ������ �� ������ ����
		jframe.setResizable(false);
		// �������� �����ֵ��� ����
		jframe.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// �̺�Ʈ�� �߻� ��ü(source)�� ������?
		// obj�� jtf�̰ų� jbtn�� �� �ִ�.
		Object obj = e.getSource();
		// �ؽ�Ʈ�ʵ忡 �Է��� ������ msg�� �����Ѵ�.
		String msg = jtf.getText();
		// �̺�Ʈ�� ��ü�� jtf���� ����Ű �Ƴ�?
		// �Է��� �޼����� �������� ������ �۾�
		if (obj == jtf) {

			// �ؽ�Ʈ�ʵ忡 ���ʹ� �ƴµ� �ƹ����ڵ� �Է����� �ʾҳ�?
			if (msg == null || msg.length() == 0) {
				// ���� �Է��ϵ��� �ȳ��Ѵ�.
				JOptionPane.showMessageDialog(jframe, "����������", "���", JOptionPane.WARNING_MESSAGE);
			} else {
				// �ؽ�Ʈ �ʵ忡 ���� �Է��ϰ� ���͸� �ƴٸ�
				// �� ������ �������� ������ �Ѵ�.
				try {
					// �������� �����͸� ������ ���� stream��
					// oos�� ���ؼ�
					// ���� ������ id#�޼��� ���·� �����͸� ������.
					oos.writeObject(id + "#" + msg);
				} catch (Exception ee) {
					ee.printStackTrace();
				}
				// ���� ��ȭ�� ���Ͽ� �ؽ�Ʈ�ʵ��� ������ �����.
				jtf.setText("");
			}
		}
		// �̺�Ʈ �߻��� ��ü�� ��ư(����)�̶��
		else if (obj == jbtn) {

			try {
				// �������� ������ id#exit�� �����Ѵ�.
				oos.writeObject(id + "#exit");

			} catch (IOException ee) {
				ee.printStackTrace();
			}

			System.exit(0);
		}

	}

	public void exit() {

		System.exit(0);
	}

	// Ŭ���̾�Ʈ�� �����ǰ� Ŭ���̾�Ʈ�� ��������
	// �ʱ�ȭ �ϱ� ���� ������ ��� �ִ� init�޼ҵ带 ���� �Ѵ�.
	public void init() throws IOException {

		// �������� "����ϰ� �;��"��� ��û�ϱ� ����
		// socket��ü�� �����Ѵ�.
		// �����ÿ� ����� ���ϴ� ������ ip�ּҿ� ����� port��ȣ�� ���� �����Ѵ�.
		// �̶� ���������� �� ��û�� �����ϴ� accept�޼ҵ尡 �����Ѵ�.
		// accept�� �����ϰ� �� Ŭ���̾�Ʈ�� ����ϴ� socket�� �����Ѵ�.
		socket = new Socket(ip, 5000);
		// ����Ǿ����� ����Ѵ�.
		System.out.println("connected...");
		// �������� �����͸� �������� ���� stream�� �����Ѵ�.
		oos = new ObjectOutputStream(socket.getOutputStream());
		// �����κ��� �����͸� �ޱ����� stream�� �����Ѵ�.
		ois = new ObjectInputStream(socket.getInputStream());

		// �ٸ� Ŭ���̾�Ʈ�� ��ȭ������ ������ ������ ���Ӿ��� �����ִ�
		// �����͸� �ޱ� ���Ͽ� ���������� �ñ��.
		// ���� �ϰ� ���� ���� ������ �����ִ� �����͸� �޴� �۾���
		// ���ÿ� �Ͼ�� �Ѵ�. ���� �ִ� �޼����� �ؽ�Ʈ �ʵ忡 ������ �Է��ϰ�
		// ���͸� ġ�� �������� �Ǿ��ְ�
		// ������ �ִ� �����ʹ� ���� �����ų�?
		// ���� ���� �̺�Ʈ(��ư�� �����ų� �ϴ� ���� �ƴϰ�) ��� �޾ƾ� �Ѵ�.
		// ==> Thread�� ǥ���Ѵ�.

		// ������ ���� ���� �����͸� �ޱ� ���� MultiClientThread��ü�� �����Ѵ�.
		// ���� �ϰ� ���� ���� �ؽ�Ʈ �ʵ忡 �Է��ϰ� ����ġ�� ������
		// �ٸ������ �ϴ� ���� MultiClientThread�� ��� �޾ƿ´�

		// MultiClientThread ��ü �����ÿ� �� (MultiClient)��
		// �Ű������� �����Ѵ�.
		MultiClientThread ct = new MultiClientThread(this);
		// ����Ͽ� ������ �޾� ������ Thread�� �����Ѵ�.
		Thread t = new Thread(ct);
		t.start();
	}

	public static void main(String args[]) throws IOException {

		JFrame.setDefaultLookAndFeelDecorated(true);
		Scanner sc = new Scanner(System.in);
		System.out.print("ip : ");
		String ip = sc.next();
		System.out.print("id : ");
		String id = sc.next();

		MultiClient cc = new MultiClient(ip, id);

		cc.init();
		sc.close();
	}

	public ObjectInputStream getOis() {
		return ois;
	}

	public JTextArea getJta() {
		return jta;
	}

	public String getId() {

		return id;
	}

}
