package exam03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Java extends JPanel implements ActionListener {

	String[] arr = { "������", "���ǿ�", "�۸���","�̼���" };
	JCheckBox str[];
	JTextField jtf01;

	public Java() {

		str = new JCheckBox[4];
		for (int i = 0; i < arr.length; i++) {

			str[i] = new JCheckBox(arr[i]);
			add(str[i]);
			str[i].addActionListener(this);
		}

		jtf01 = new JTextField(30);

		add(jtf01);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String cmd = e.getActionCommand();
		String r = "";

		for (int i = 0; i < str.length; i++) {

			if (str[i].isSelected()) {
				r += arr[i] + ",";
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
