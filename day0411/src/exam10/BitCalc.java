package exam10;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BitCalc extends JFrame implements ActionListener {

	String arr[] = { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", "C", "=", "/" };

	int op1, op2;
	String op;
	int r;

	JTextField display;

	public BitCalc() {
		display = new JTextField();
		// Frame ���� : display
		// Frame ��� : ���ڹ�ư���� ��� �ִ� �г�
		setLayout(new BorderLayout());
		add(display, BorderLayout.NORTH);

		// ��ư 16�� ���� Panel�� ����
		JPanel p_btn = new JPanel();

		// �г��� layout ����
		p_btn.setLayout(new GridLayout(4, 4));

		// ��ư�迭 16���� ������
		JButton btn[] = new JButton[16];
		// �г��� 16�� ��ư�� �����ؼ� ����
		for (int i = 0; i < arr.length; i++) {

			btn[i] = new JButton(arr[i]);
			p_btn.add(btn[i]);

			btn[i].addActionListener(this);
		}

		add(display, BorderLayout.NORTH);
		add(p_btn, BorderLayout.CENTER);

		setSize(200, 250);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String cmd = e.getActionCommand();

		if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {

			op1 = Integer.parseInt(display.getText());
			op = cmd;
			display.setText("");

		} else if (cmd.equals("=")) {
			op2 = Integer.parseInt(display.getText());
			switch (op) {

			case "+":
				r = op1 + op2;
				break;
			case "-":
				r = op1 - op2;
				break;
			case "*":
				r = op1 * op2;
				break;
			case "/":
				r = op1 / op2;
				break;
			}
			display.setText(r + "");
		} else {
			display.setText(display.getText() + cmd);
		}

	}

	public static void main(String[] args) {
		new BitCalc();
	}
}
