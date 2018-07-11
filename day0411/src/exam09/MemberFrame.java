package exam09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemberFrame extends JFrame {

	public MemberFrame() {

		setLayout(new GridLayout(2, 1));

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		p1.setBackground(Color.RED);
		p2.setBackground(Color.BLUE);

		add(p1);
		add(p2);

		JTextArea jta = new JTextArea(20, 80);
		JButton btn01 = new JButton("저장");
		JButton btn02 = new JButton("종료");

		p2.setLayout(new BorderLayout());
		p2.add(jta, BorderLayout.CENTER);

		JPanel p2_1 = new JPanel();
		p2_1.add(btn01);
		p2_1.add(btn02);

		p2.add(p2_1, BorderLayout.SOUTH);

		setSize(300, 400);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new MemberFrame();
	}

}
