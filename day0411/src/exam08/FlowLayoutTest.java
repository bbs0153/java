package exam08;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// ��ư�� 15���� �����Ͽ� ȭ�鿡 ��ġ
public class FlowLayoutTest extends JFrame {

	public FlowLayoutTest() {

		setLayout(new FlowLayout());

		for (int i = 1; i < 16; i++) {

			add(new JButton("��ư" + i));
		}

		setSize(500, 500);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new FlowLayoutTest();
	}

}
