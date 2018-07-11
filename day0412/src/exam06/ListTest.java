package exam06;

import java.awt.BorderLayout;
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

public class ListTest extends JFrame implements ActionListener {

	Vector<String> data;
	JTextField jtf;
	JList<String> list;
	JButton btnAdd;
	JButton btnDel;
	JButton btnDelAll;

	public ListTest() {

		data = new Vector<String>();
		jtf = new JTextField(15);

		data.add("���");
		data.add("��ȭ");
		data.add("��");

		list = new JList<String>(data);

		JScrollPane jsp = new JScrollPane(list);

		setLayout(new BorderLayout());
		add(jsp, BorderLayout.CENTER);

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4, 1));

		btnAdd = new JButton("�߰�");
		btnDel = new JButton("����");
		btnDelAll = new JButton("��ü����");

		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		btnDelAll.addActionListener(this);
		p.add(jtf);
		p.add(btnAdd);
		p.add(btnDel);
		p.add(btnDelAll);

		add(p, BorderLayout.SOUTH);

		setSize(200, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("�߰�")) {
			data.add(jtf.getText());
			list.updateUI();
		} else if (e.getActionCommand().equals("����")) {

			data.remove(list.getSelectedIndex());
			list.updateUI();
		} else if (e.getActionCommand().equals("��ü����")) {

			data.removeAll(data);
			list.updateUI();
		}

	}

	public static void main(String[] args) {
		new ListTest();
	}

}
