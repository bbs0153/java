package exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxTest extends JFrame implements ActionListener {

	JCheckBox jcb01;

	JTextField jtf01;
	String[] arr = { "���", "����", "����", "ü��", "����ƾ" };
	JCheckBox str[];

	public CheckBoxTest() {

		setLayout(new FlowLayout());

		str = new JCheckBox[5];
		for (int i = 0; i < arr.length; i++) {

			str[i] = new JCheckBox(arr[i]);
			add(str[i]);
			str[i].addActionListener(this);
		}

		/*
		 * jcb01 = new JCheckBox("���"); jcb02 = new JCheckBox("����"); jcb03 = new
		 * JCheckBox("����"); jcb04 = new JCheckBox("ü��"); jcb05 = new JCheckBox("����ƾ");
		 */

		jtf01 = new JTextField(30);

		// jcb02.addActionListener(this);

		/*
		 * add(jcb02); add(jcb03); add(jcb04); add(jcb05);
		 */
		add(jtf01);

		setSize(800, 200);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new CheckBoxTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String cmd = e.getActionCommand();
		String r = "";

		for (int i = 0; i < str.length; i++) {

			if (str[i].isSelected()) {
				r += arr[i]+",";
			}

		}
		if (r.equals("")) {
			jtf01.setText("�ƹ��͵� �������� �ʾҽ��ϴ�.");
		} else {
			r = r.substring(0, r.length() - 1);
			jtf01.setText(r + "�Դϴ�");
		}
		
		
	}

}
