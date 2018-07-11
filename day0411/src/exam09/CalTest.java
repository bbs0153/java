package exam09;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CalTest extends JFrame {

	public CalTest() {

		setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);

		JTextArea jta = new JTextArea(2, 20);
		String[] str = { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", "c", "=", "/" };
		for (int i = 0; i < str.length; i++) {

			p2.add(new JButton(str[i]));
		}
		p2.setLayout(new GridLayout(4, 4));

		p1.add(jta, BorderLayout.CENTER);

		setSize(200, 250);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

	}

	public static void main(String[] args) {

		new CalTest();
	}

}
