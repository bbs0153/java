package exam07;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MandG extends JFrame implements ActionListener {

	private JTextField jtf01;

	public MandG() {

		setLayout(new FlowLayout());

		JButton b1 = new JButton("����");
		JButton b2 = new JButton("����");
		jtf01 = new JTextField(20);

		b1.addActionListener(this);
		b2.addActionListener(this);

		add(b1);
		add(b2);
		add(jtf01);

		setSize(500, 500);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String cmd = e.getActionCommand();

		jtf01.setText("����� " + cmd + "�Դϴ�.");
	}

	public static void main(String[] args) {

		new MandG();
	}
}
