package exam03;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest extends JFrame {

	String colNames[] = { "이름", "국어", "영어", "수학" };
	String rowDate[][] = { { "이현진", "100", "100", "100" }, { "한상협", "80", "90", "100" }, { "조성재", "90", "80", "100" } };

	public JTableTest() {

		JTable table = new JTable(rowDate, colNames);
		JScrollPane jsp = new JScrollPane(table);

		add(jsp);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new JTableTest();
	}

}
