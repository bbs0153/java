package exam08;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// ��ư�� 15���� �����Ͽ� ȭ�鿡 ��ġ
public class GreidLayoutTest extends JFrame {

	public GreidLayoutTest() {

		setLayout(new GridLayout(3,5));

		for (int i = 1; i < 16; i++) {

			add(new JButton("��ư" + i));
		}

		setSize(500, 500);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new GreidLayoutTest();
	}

}
