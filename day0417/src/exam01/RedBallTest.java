package exam01;

import javax.swing.JFrame;

public class RedBallTest extends JFrame {

	RedBallPanel graphic;

	public RedBallTest() {

		graphic = new RedBallPanel();
		add(graphic);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new RedBallTest();
	}

}
