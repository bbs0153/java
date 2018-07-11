package exam07;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ListTest extends JFrame {

	Vector<String> data;
	JTextField jtf;
	JList<String> list;
	JButton btnAdd;
	JButton btnDel;
	JButton btnDelAll;

	JButton right;
	JButton left;
	JButton rightAll;
	JButton leftAll;

	Vector<String> data2;
	JTextField jtf2;
	JList<String> list2;
	JButton btnAdd2;
	JButton btnDel2;
	JButton btnDelAll2;

	public ListTest() {

		setLayout(new FlowLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();

		add(p1);
		add(p2);
		add(p3);

		p1.setLayout(new BorderLayout());

		data = new Vector<String>();
		jtf = new JTextField(15);

		data.add("돈");
		data.add("사랑");
		data.add("명예");
		list = new JList<String>(data);
		JScrollPane jsp = new JScrollPane(list);
		p1.add(jsp, BorderLayout.CENTER);

		JPanel p1_1 = new JPanel();
		p1_1.setLayout(new GridLayout(4, 1));

		btnAdd = new JButton("추가");
		btnDel = new JButton("삭제");
		btnDelAll = new JButton("전체삭제");

		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				data.add(jtf.getText());
				list.updateUI();
			}
		});
		btnDel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				data.remove(list.getSelectedIndex());
				list.updateUI();
			}
		});
		btnDelAll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				data.removeAll(data);
				list.updateUI();
			}
		});
		p1_1.add(jtf);
		p1_1.add(btnAdd);
		p1_1.add(btnDel);
		p1_1.add(btnDelAll);
		p1.add(p1_1, BorderLayout.SOUTH);

		p2.setLayout(new GridLayout(4, 1));

		right = new JButton(">");
		left = new JButton("<");
		rightAll = new JButton(">>");
		leftAll = new JButton("<<");

		p2.add(right);
		p2.add(left);
		p2.add(rightAll);
		p2.add(leftAll);

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				data2.add(data.get(list.getSelectedIndex()));
				data.remove(list.getSelectedIndex());
				list.updateUI();
				list2.updateUI();
			}
		});
		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				data.add(data2.get(list2.getSelectedIndex()));
				data2.remove(list2.getSelectedIndex());
				list2.updateUI();
				list.updateUI();
			}
		});
		rightAll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				for (int i = 0; i < data.size(); i++) {

					data2.add(data.get(i));
				}
				data.clear();
				list.updateUI();
				list2.updateUI();
			}
		});
		leftAll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				for (int i = 0; i < data2.size(); i++) {

					data.add(data2.get(i));
				}
				data2.clear();
				list.updateUI();
				list2.updateUI();

			}
		});

		p3.setLayout(new BorderLayout());

		data2 = new Vector<String>();
		jtf2 = new JTextField(15);

		data2.add("가족");
		data2.add("와이프");
		data2.add("친구");
		list2 = new JList<String>(data2);
		JScrollPane jsp2 = new JScrollPane(list2);
		p3.add(jsp2, BorderLayout.CENTER);

		JPanel p3_1 = new JPanel();
		p3_1.setLayout(new GridLayout(4, 1));

		btnAdd2 = new JButton("추가");
		btnDel2 = new JButton("삭제");
		btnDelAll2 = new JButton("전체삭제");

		btnAdd2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				data2.add(jtf2.getText());
				list2.updateUI();
			}
		});
		btnDel2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				data2.remove(list2.getSelectedIndex());
				list2.updateUI();
			}
		});
		btnDelAll2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				data2.removeAll(data2);
				list2.updateUI();
			}
		});

		p3_1.add(jtf2);
		p3_1.add(btnAdd2);
		p3_1.add(btnDel2);
		p3_1.add(btnDelAll2);
		p3.add(p3_1, BorderLayout.SOUTH);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new ListTest();
	}
}
