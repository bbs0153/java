package exam08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Grimpan extends JFrame {

	GraphicPanel lp;

	public Grimpan() {

		lp = new GraphicPanel();

		setLayout(new BorderLayout());
		add(lp, BorderLayout.CENTER);

		JMenuBar jmb = new JMenuBar();
		JMenu jm1 = new JMenu("����");
		JMenuItem item1 = new JMenuItem("������");
		JMenuItem item2 = new JMenuItem("����");
		JMenuItem item3 = new JMenuItem("����");
		JMenuItem item4 = new JMenuItem("����");

		jm1.add(item1);
		jm1.add(item2);
		jm1.add(item3);
		jm1.add(item4);

		JMenu jm2 = new JMenu("�⸮�⵵��");
		JMenuItem item1_1 = new JMenuItem("��");
		JMenuItem item2_1 = new JMenuItem("��");
		JMenuItem item3_1 = new JMenuItem("�簢��");

		item1_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				lp.drawType = 0;

			}
		});
		item2_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				lp.drawType = 1;
			}
		});
		item3_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				lp.drawType = 2;
			}
		});

		jm2.add(item1_1);
		jm2.add(item2_1);
		jm2.add(item3_1);

		JMenu jm3 = new JMenu("�׸��� ����");
		JMenuItem item1_2 = new JMenuItem("����");
		JMenuItem item2_2 = new JMenuItem("����");
		JMenuItem item3_2 = new JMenuItem("���");

		item1_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				lp.drawColor = Color.BLACK;
			}
		});
		item2_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				lp.drawColor = Color.RED;
			}
		});
		item3_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				lp.drawColor = Color.BLUE;
			}
		});

		jm3.add(item1_2);
		jm3.add(item2_2);
		jm3.add(item3_2);

		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);

		setJMenuBar(jmb);

		lp = new GraphicPanel();

		setLayout(new BorderLayout());
		add(lp, BorderLayout.CENTER);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new Grimpan();
	}

}
