package exam04;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JTableTest extends JFrame {

	Vector<String> v1;
	Vector<Vector> v2;
	Vector<String> v3;
	Vector<String> v4;
	Vector<String> v5;
	Vector<String> v6;

	JTable table;

	JTextField jtf1;
	JTextField jtf2;
	JTextField jtf3;
	JTextField jtf4;

	public JTableTest() {

		setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();

		JButton btn1 = new JButton("추가");
		JButton btn2 = new JButton("삭제");
		JButton btn3 = new JButton("수정");

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				v6 = new Vector<String>();

				v6.add(jtf1.getText());
				v6.add(jtf2.getText());
				v6.add(jtf3.getText());
				v6.add(jtf4.getText());
				v2.add(v6);

				table.updateUI();
			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				v2.remove(table.getSelectedRow());

				table.updateUI();
			}
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

			}
		});

		JLabel lb1 = new JLabel("이름");
		JLabel lb2 = new JLabel("국어");
		JLabel lb3 = new JLabel("영어");
		JLabel lb4 = new JLabel("수학");
		jtf1 = new JTextField(10);
		jtf2 = new JTextField(10);
		jtf3 = new JTextField(10);
		jtf4 = new JTextField(10);

		p1.add(lb1);
		p1.add(jtf1);
		p1.add(lb2);
		p1.add(jtf2);
		p1.add(lb3);
		p1.add(jtf3);
		p1.add(lb4);
		p1.add(jtf4);
		p1.setLayout(new GridLayout(4, 2));
		add(p1, BorderLayout.NORTH);

		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		// p2.setLayout(new BorderLayout());
		add(p2, BorderLayout.CENTER);

		v1 = new Vector<String>();
		v2 = new Vector<Vector>();
		v3 = new Vector<String>();
		v4 = new Vector<String>();
		v5 = new Vector<String>();

		v1.add("이름");
		v1.add("국어");
		v1.add("영어");
		v1.add("수학");

		v3.add("변성인");
		v3.add("100");
		v3.add("100");
		v3.add("100");

		v4.add("차건우");
		v4.add("100");
		v4.add("50");
		v4.add("100");

		v5.add("이서희");
		v5.add("100");
		v5.add("100");
		v5.add("50");

		v2.add(v3);
		v2.add(v4);
		v2.add(v5);

		table = new JTable(v2, v1);
		JScrollPane jsp = new JScrollPane(table);

		p3.add(jsp);
		add(p3, BorderLayout.SOUTH);

		setSize(500, 650);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new JTableTest();

		Scanner sc = new Scanner(System.in);
	}

}
