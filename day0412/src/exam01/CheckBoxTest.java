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
	String[] arr = { "사과", "포도", "망고", "체리", "망고스틴" };
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
		 * jcb01 = new JCheckBox("사과"); jcb02 = new JCheckBox("포도"); jcb03 = new
		 * JCheckBox("망고"); jcb04 = new JCheckBox("체리"); jcb05 = new JCheckBox("망고스틴");
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
			jtf01.setText("아무것도 선택하지 않았습니다.");
		} else {
			r = r.substring(0, r.length() - 1);
			jtf01.setText(r + "입니다");
		}
		
		
	}

}
