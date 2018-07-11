package exam03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Swing extends JPanel {

	public Swing() {

		ButtonGroup bg = new ButtonGroup();
		JRadioButton btn1 = new JRadioButton("JCheckBox");
		JRadioButton btn2 = new JRadioButton("JButton");
		JRadioButton btn3 = new JRadioButton("JComboBox");
		JRadioButton btn4 = new JRadioButton("JLabel");
		JTextField jtf = new JTextField(20);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				jtf.setText("JCheckBox");
			}
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf.setText("JButton");
			}
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf.setText("JComboBox");
			}
		});
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf.setText("JLabel");
			}
		});

		bg.add(btn1);
		bg.add(btn2);
		bg.add(btn3);
		bg.add(btn4);

		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(jtf);

	}

}
