package exam04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FiledelTest extends JFrame {

	JFrame f;

	public FiledelTest() {

		f = this;
		setLayout(new FlowLayout());

		JButton btn = new JButton("Hello2.java �����");

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				File file = new File("C:\\�ڹٽ��͵�\\day0320\\Hello2.java");

				boolean re = file.delete();

				if (re == true) {
					JOptionPane.showMessageDialog(f, "������ �����Ͽ����ϴ�.", "Ȯ��", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(f, "������ ���� �����߽��ϴ�.", "Ȯ��", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new FiledelTest();
	}

}
