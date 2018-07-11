package exam08;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// 버튼을 15개를 생성하여 화면에 배치
public class FlowLayoutTest extends JFrame {

	public FlowLayoutTest() {

		setLayout(new FlowLayout());

		for (int i = 1; i < 16; i++) {

			add(new JButton("버튼" + i));
		}

		setSize(500, 500);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new FlowLayoutTest();
	}

}
