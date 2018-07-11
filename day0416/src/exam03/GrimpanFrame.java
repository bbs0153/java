package exam03;

import javax.swing.JFrame;

public class GrimpanFrame extends JFrame {

	GrimpanPanel grimpan;

	public GrimpanFrame() {

		grimpan = new GrimpanPanel();

		setSize(400, 300);
		add(grimpan);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new GrimpanFrame();
	}

}
