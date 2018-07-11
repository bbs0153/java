package exam09;

import javax.swing.JFrame;

public class GraphicTest extends JFrame {

	GraphicPanel graphic;

	public GraphicTest() {

		graphic = new GraphicPanel();
		add(graphic);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new GraphicTest();
	}

}
