package exam01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuTest extends JFrame {

	public MenuTest() {

		JMenuBar mb = new JMenuBar();
		JMenu mn = new JMenu("파일");
		JMenuItem item1 = new JMenuItem("새파일");
		JMenuItem item2 = new JMenuItem("열기"); 
		JMenuItem item3 = new JMenuItem("저장");
		JMenuItem item4 = new JMenuItem("종료");

		item1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println(e.getActionCommand());

			}
		});
		item2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());

			}
		});
		item3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());

			}
		});
		item4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println(e.getActionCommand());
			}
		});

		mn.add(item1);
		mn.add(item2);
		mn.add(item3);
		mn.add(item4);

		mb.add(mn);

		setJMenuBar(mb);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new MenuTest();
	}

}
