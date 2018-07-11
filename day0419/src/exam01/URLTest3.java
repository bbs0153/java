package exam01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class URLTest3 extends JFrame {

	JFrame f;

	public URLTest3() {

		f = this;
		setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JTextField jtf = new JTextField("http://www.hanbit.co.kr/store/books/look.php?p_code=B8441457382");
		JButton btn1 = new JButton("읽기");
		JButton btn2 = new JButton("저장");
		JTextArea jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				try {
					URL ur1 = new URL(jtf.getText());

					InputStream is = ur1.openStream();

					byte[] data = new byte[100];
					StringBuffer sb = new StringBuffer();

					while (is.read(data) != -1) {

						String str = new String(data, "utf-8");
						sb.append(str);
						Arrays.fill(data, (byte) 0);
					}
					jta.setText(sb.toString());
					is.close();
				} catch (Exception e) {
					e.getMessage();
				}

			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JFileChooser jfc = new JFileChooser("C:/temp");

				int re = jfc.showSaveDialog(f);

				if (re == JFileChooser.APPROVE_OPTION) {

					File file = jfc.getSelectedFile();
					try {
						FileWriter fw = new FileWriter(file);

						fw.write(jta.getText());
						fw.close();

					} catch (Exception ex) {
						System.out.println(ex.getMessage());
					}

				}

			}
		});

		p1.add(jtf);
		p1.add(btn1);
		p1.add(btn2);

		add(p1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		setSize(550, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new URLTest3();
	}

}
