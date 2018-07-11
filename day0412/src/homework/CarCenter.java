package homework;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CarCenter extends JFrame implements ActionListener {

	JTextField jtf;
	JCheckBox jcb[];
	JLabel str[];
	String[] arr = { "����(��)", "45000", "80000", "30000", "100000" };

	public CarCenter() {

		setLayout(new GridLayout(1, 3));
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();

		add(p1);
		add(p2);
		add(p3);

		p1.setLayout(new GridLayout(5, 1));
		jcb = new JCheckBox[4];
		jcb[0] = new JCheckBox("���� ���� ��ȯ");
		jcb[1] = new JCheckBox("�ڵ� ���ӱ� ���� ��ȯ");
		jcb[2] = new JCheckBox("������ ���� ��ȯ");
		jcb[3] = new JCheckBox("Ÿ�̾� ��ȯ");
		JLabel jlb = new JLabel("����");

		jcb[0].addActionListener(this);
		jcb[1].addActionListener(this);
		jcb[2].addActionListener(this);
		jcb[3].addActionListener(this);

		p1.add(jlb);
		p1.add(jcb[0]);
		p1.add(jcb[1]);
		p1.add(jcb[2]);
		p1.add(jcb[3]);

		p2.setLayout(new GridLayout(5, 1));

		str = new JLabel[5];
		for (int i = 0; i < arr.length; i++) {

			str[i] = new JLabel(arr[i]);
			p2.add(str[i]);

		}

		p3.setLayout(new BorderLayout());

		jtf = new JTextField(10);

		p3.add(jtf, BorderLayout.SOUTH);

		setSize(800, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new CarCenter();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int total = 0;
		String cmd = e.getActionCommand();

		for (int i = 0; i < jcb.length; i++) {

			if (jcb[i].isSelected()) {
				total += Integer.parseInt(arr[i + 1]);
			}
		}
		jtf.setText("�Ѱ���: " + total);
	}
}
