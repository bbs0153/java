package exam02;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Memo extends JFrame {

	JTextArea text;
	JScrollPane jsp;

	public Memo() {

		setLayout(new BorderLayout());
		JMenuBar bar = new JMenuBar();

		JMenu jm = new JMenu("파일");
		JMenuItem item1 = new JMenuItem("새로만들기");
		JMenuItem item2 = new JMenuItem("열기");
		JMenuItem item3 = new JMenuItem("저장");
		JMenuItem item4 = new JMenuItem("다른이름으로 저장");
		JMenuItem item5 = new JMenuItem("종료");

		text = new JTextArea(10, 10);
		jsp = new JScrollPane(text);

		item1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				text.setText("");
			}
		});
		item2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					FileReader fr = new FileReader("c:/temp/bit.tex");
					int ch;
					String str = "";
					while ((ch = fr.read()) != -1) {
						str += (char) ch;
					}
					text.setText(str);
					fr.close();
				} catch (Exception ex) {
					System.out.println(e.getActionCommand());
				}
			}
		});
		item3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// "저장"버튼을 누르면 텍스트에리어의 모든 내용을
				// C:/temp/bit.txt로 저장하려고 한다.

				try {
					FileWriter fw = new FileWriter("c:/temp/bit.tex");
					fw.write(text.getText());
					fw.close();
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			}
		});
		item4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		jm.add(item1);
		jm.add(item2);
		jm.add(item3);
		jm.add(item4);
		jm.add(item5);
		bar.add(jm);

		add(bar, BorderLayout.NORTH);
		add(jsp);

		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new Memo();
	}

}
