package exam05;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class LineFrame extends JFrame {

	LinePanel lp;

	public LineFrame() {

		setLayout(new BorderLayout());
		lp = new LinePanel();

		add(lp, BorderLayout.CENTER);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new LineFrame();

	}

}
