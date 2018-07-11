package exam03;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import exam02.InputTab;
import exam02.OutputTab;

public class JavaTable extends JFrame {

	public JavaTable() {

		Text text = new Text();
		Swing swing = new Swing(); 
		Layout layout = new Layout();
		Java java = new Java();

		JTabbedPane jtp = new JTabbedPane();

		jtp.add("Text", text);
		jtp.add("Swing", swing);
		jtp.add("Layout", layout);
		jtp.add("Java", java);

		add(jtp);

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new JavaTable();
	}

}
