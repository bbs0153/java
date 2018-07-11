package exam07;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame {

	String[] arr;

	public ChatClient() {

		setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		JTextArea jta = new JTextArea();
		JTextField jtf = new JTextField(20);
		JButton btn = new JButton("ют╥б");

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				jta.setText(jtf.getText());

				String msg = jtf.getText();

				try {

					Socket socket = new Socket("203.236.209.116", 1993);

					OutputStream os = socket.getOutputStream();

					os.write(msg.getBytes());

					os.close();
					socket.close();

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}
		});

		p1.add(jtf);
		p1.add(btn);

		add(jta);
		add(p1, BorderLayout.SOUTH);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new ChatClient();

	}

}
