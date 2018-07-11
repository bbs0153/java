package exam02;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class OutputTab extends JPanel {

	public OutputTab() {

		Vector<String> cols = new Vector<String>();

		cols.add("이름");
		cols.add("국어");
		cols.add("영어");
		cols.add("수학");

		Vector<Vector<String>> rows = new Vector<Vector<String>>();

		Vector<String> row1 = new Vector<String>();

		row1.add("이현진");
		row1.add("100");
		row1.add("100");
		row1.add("30");

		Vector<String> row2 = new Vector<String>();

		row2.add("한상협");
		row2.add("100");
		row2.add("100");
		row2.add("30");

		Vector<String> row3 = new Vector<String>();

		row3.add("조성재");
		row3.add("100");
		row3.add("100");
		row3.add("30");

		rows.add(row1);
		rows.add(row2);
		rows.add(row3);

		add(new JScrollPane(new JTable(rows, cols)));
	}

}
