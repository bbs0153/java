package exam02;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ListStudent extends JFrame {
	JTable jtb;
	JTextField jtf_name;
	JTextField jtf_kor;
	JTextField jtf_eng;
	JTextField jtf_math;
	Vector<Vector<String>> rowData;

	public ListStudent() {

		setLayout(new BorderLayout());

		Vector<String> colName = new Vector<String>();
		rowData = new Vector<Vector<String>>();

		colName.add("이름");
		colName.add("국어");
		colName.add("영어");
		colName.add("수학");

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JLabel lb_name = new JLabel("이름");
		JLabel lb_kor = new JLabel("국어");
		JLabel lb_eng = new JLabel("영어");
		JLabel lb_math = new JLabel("수학");
		jtf_name = new JTextField(10);
		jtf_kor = new JTextField(10);
		jtf_eng = new JTextField(10);
		jtf_math = new JTextField(10);
		jtb = new JTable(rowData, colName);
		JScrollPane jsp = new JScrollPane(jtb);
		JButton btn = new JButton("추가");

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					String sql = "insert into student values('" + jtf_name.getText() + "'," + jtf_kor.getText() + ","
							+ jtf_eng.getText() + "," + jtf_math.getText() + ")";

					Class.forName("oracle.jdbc.driver.OracleDriver");

					Connection cnn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.106:1521:XE", "madang",
							"madang");

					Statement stmt = cnn.createStatement();

					stmt.executeUpdate(sql);

					printTable();

					jtb.updateUI();

					stmt.close();
					cnn.close();

				} catch (Exception ee) {
					System.out.println(ee.getMessage());
				}
			}
		});

		printTable();

		p1.add(lb_name);
		p1.add(jtf_name);
		p1.add(lb_kor);
		p1.add(jtf_kor);
		p1.add(lb_eng);
		p1.add(jtf_eng);
		p1.add(lb_math);
		p1.add(jtf_math);
		p1.setLayout(new GridLayout(4, 2));

		p2.setLayout(new BorderLayout());
		p2.add(btn, BorderLayout.NORTH);
		p2.add(jsp, BorderLayout.CENTER);

		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void printTable() {

		String sql = "select * from student";

		rowData.clear();

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.106:1521:XE", "madang",
					"madang");

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				Vector<String> v = new Vector<String>();

				v.add(rs.getString(1));
				v.add(rs.getInt(2) + "");
				v.add(rs.getInt(3) + "");
				v.add(rs.getInt(4) + "");

				rowData.add(v);

			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {
		new ListStudent();
	}

}
