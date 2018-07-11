package exam03;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest extends JFrame {

	String colNames[] = { "�̸�", "����", "����", "����" };
	String rowDate[][] = { { "������", "100", "100", "100" }, { "�ѻ���", "80", "90", "100" }, { "������", "90", "80", "100" } };

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