package homework;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CoffeeTest extends JFrame implements ActionListener {

	JTextField jtf;
	JRadioButton jrb1;
	JRadioButton jrb2;
	JRadioButton jrb3;

	JLabel jlb2;
	JLabel jlb3;
	JLabel jlb4;

	ButtonGroup bg;

	public CoffeeTest() {

		setLayout(new GridLayout(1, 3));
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();

		add(p1);
		add(p2);
		add(p3);

		p1.setLayout(new GridLayout(4, 1));
		jrb1 = new JRadioButton("Small");
		// jrb1.setHorizontalTextPosition(SwingConstants.LEFT);
		jrb2 = new JRadioButton("Medium");
		jrb3 = new JRadioButton("Large");
		JLabel jlb = new JLabel("커피 크기");

		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
		jrb3.addActionListener(this);

		p1.add(jlb);
		bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);

		p1.add(jrb1);
		p1.add(jrb2);
		p1.add(jrb3);

		p2.setLayout(new GridLayout(4, 1));

		JLabel jlb1 = new JLabel("가격(원)");
		jlb2 = new JLabel("3000");
		jlb3 = new JLabel("4000");
		jlb4 = new JLabel("5000");

		p2.add(jlb1);
		p2.add(jlb2);
		p2.add(jlb3);
		p2.add(jlb4);

		p3.setLayout(new BorderLayout());

		jtf = new JTextField(10);

		p3.add(jtf, BorderLayout.SOUTH);

		setSize(800, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new CoffeeTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Small")) {
			jtf.setText("커피 가격 : " + jlb2.getText());
		} else if (e.getActionCommand().equals("Medium")) {
			jtf.setText("커피 가격 : " + jlb3.getText());
		} else if (e.getActionCommand().equals("Large")) {
			jtf.setText("커피 가격 : " + jlb4.getText());
		}

	}
}
