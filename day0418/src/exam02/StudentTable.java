package exam02;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class StudentTable extends JFrame {

	public StudentTable() {

		InputTab tab01 = new InputTab();
		OutputTab tab02 = new OutputTab();

		JTabbedPane jtp = new JTabbedPane();

		jtp.add("�Է�", tab01);
		jtp.add("���", tab02);

		add(jtp);

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		new StudentTable();
	}

}
