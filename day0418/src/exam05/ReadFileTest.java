package exam05;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ReadFileTest extends JFrame {

	Vector<String> data;
	JList<String> list;
	JTextArea jta;

	public ReadFileTest() {

		data = new Vector<String>();
		// 파일목록을 읽어와서 list에 담는다.
		loadFile();

		list = new JList<String>(data);

		jta = new JTextArea(20, 80);

		JScrollPane jsp = new JScrollPane(jta);
		JScrollPane jspList = new JScrollPane(list);

		JPanel p1 = new JPanel();
		JButton btn1 = new JButton("수정");
		JButton btn2 = new JButton("삭제");

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					FileWriter fw = new FileWriter("C:\\자바스터디\\day03261\\" + list.getSelectedValue());
					fw.write(jta.getText());
					fw.close();
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			}
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				File file = new File("C:\\자바스터디\\day03261\\" + list.getSelectedValue());

				data.remove(list.getSelectedValue());
				file.delete();

				jspList.updateUI();

			}
		});

		list.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {

				try {

					FileReader fr = new FileReader("C:\\자바스터디\\day03261\\" + list.getSelectedValue());
					int ch = 0;
					String str = "";

					while ((ch = fr.read()) != -1) {
						str += (char) ch;
					}
					jta.setText(str);
					fr.close();
				} catch (Exception ex) {
				}

			}

		});

		add(jspList, BorderLayout.WEST);
		add(jsp, BorderLayout.CENTER);
		p1.add(btn1);
		p1.add(btn2);
		add(p1, BorderLayout.SOUTH);

		setSize(800, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void loadFile() {

		File file = new File("C:\\자바스터디\\day03261");
		String[] fileList = file.list();

		for (String fname : fileList) {

			if (fname.contains(".java") && !fname.contains(".bak")) {
				data.add(fname);
			}
		}
	}

	public static void main(String[] args) {

		new ReadFileTest();
	}

}
