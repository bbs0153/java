package exam05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BFream extends JFrame implements ActionListener {

	private JTextField a;
	private JTextField b;
	private JLabel label;

	public BFream() {

		setLayout(new FlowLayout());

		JLabel a1 = new JLabel("첫번째 수");
		a = new JTextField(10);
		JLabel a2 = new JLabel("두번째 수");
		b = new JTextField(10);

		JButton button = new JButton("큰수 찾기");

		button.addActionListener(this);

		label = new JLabel("         ");

		add(a1);
		add(a);
		add(a2);
		add(b);
		add(button);
		add(label);

		setSize(500, 500);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int c = Integer.parseInt(a.getText());
		int d = Integer.parseInt(b.getText());

		int f = c;
		if (f < d) {
			f = d;
		}

		label.setText(f + " ");
	}

}
