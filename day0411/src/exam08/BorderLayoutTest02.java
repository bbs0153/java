package exam08;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest02 extends JFrame {

	public BorderLayoutTest02() {

		setLayout(new BorderLayout());

		// add(new JButton("����"), BorderLayout.NORTH);
		// add(new JButton("�Ʒ���"), BorderLayout.SOUTH);
		add(new JButton("������"), BorderLayout.EAST);
		add(new JButton("����"), BorderLayout.WEST);
		// add(new JButton("���"), BorderLayout.CENTER);

		setSize(500, 500);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new BorderLayoutTest02();
	}

}
