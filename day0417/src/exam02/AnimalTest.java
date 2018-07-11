package exam02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class AnimalTest extends JFrame {

	Icon icon1;
	Icon icon2;
	Icon icon3;
	Icon icon4;

	public AnimalTest() {

		setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		ButtonGroup bg = new ButtonGroup();
		JRadioButton btn1 = new JRadioButton("강아지");
		JRadioButton btn2 = new JRadioButton("고양이");
		JRadioButton btn3 = new JRadioButton("거북이");
		JRadioButton btn4 = new JRadioButton("햄스터");
		JLabel lb = new JLabel("");

		icon1 = new ImageIcon("dog.png");
		icon2 = new ImageIcon("cat.png");
		icon3 = new ImageIcon("turtle.png");
		icon4 = new ImageIcon("hamster.png");

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				lb.setIcon(icon1);
			}
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb.setIcon(icon2);
			}
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb.setIcon(icon3);
			}
		});
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb.setIcon(icon4);
			}
		});

		icon1 = new ImageIcon("dog.png");
		icon2 = new ImageIcon("cat.png");
		icon3 = new ImageIcon("turtle.png");
		icon4 = new ImageIcon("hamster.png");

		bg.add(btn1);
		bg.add(btn2);
		bg.add(btn3);
		bg.add(btn4);

		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(btn4);
		p2.add(lb);

		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new AnimalTest();
	}

}
