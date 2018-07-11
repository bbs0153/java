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

public class MultiClient implements ActionListener {

	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private JFrame jframe;
	private JTextField jtf;
	private JTextArea jta;
	private JLabel jlb1, jlb2;
	private JPanel jp1, jp2;
	private String ip;
	private String id;
	private JButton jbtn;

	public MultiClient(String argIp, String argId) {

		ip = argIp;
		id = argId;
		jframe = new JFrame("Multi Chatting");
		jtf = new JTextField(30);
		jta = new JTextArea("", 10, 50);
		jlb1 = new JLabel("Usage ID : {{" + id + "}}");
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

		jtf.addActionListener(this);
		jbtn.addActionListener(this);
		jframe.addWindowListener(new WindowListener() {

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
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent arg0) {
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

		jta.setEditable(false);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int screenHeight = d.height;
		int screenWidth = d.width;
		jframe.setLocation((screenWidth - jframe.getWidth()) / 2, (screenHeight - jframe.getHeight()) / 2);
		jframe.setResizable(false);
		jframe.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();
		String msg = jtf.getText();
		if (obj == jtf) {

			if (msg == null || msg.length() == 0) {

				JOptionPane.showMessageDialog(jframe, "����������", "���", JOptionPane.WARNING_MESSAGE);
			} else {
				try {

					oos.writeObject(id + "#" + msg);
				} catch (Exception ee) {
					ee.printStackTrace();
				}

				jtf.setText("");
			}
		} else if (obj == jbtn) {

			try {
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

	public void init() throws IOException {

		socket = new Socket(ip, 5000);
		System.out.println("connected...");
		oos = new ObjectOutputStream(socket.getOutputStream());
		ois = new ObjectInputStream(socket.getInputStream());
		MultiClientThread ct = new MultiClientThread(this);
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