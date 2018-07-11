package exam03;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Memo extends JFrame {

	JFrame f; // �����Ͻðڽ��ϱ�?, �����ϰų�, ������ �� ������ �����ϱ� ���� �ٵ��α׸�
				// ���� Frame�� �Ű������� �䱸�ϴµ� ���� �ڽ��� ������ ����
	JTextArea text; // ���� �ۼ��� �ؽ�Ʈ������
	JScrollPane jsp;
	File file; // ���࿡ ������ �Ͽ��ٸ� ������ ������ ������ ��� ���� ����
	JFileChooser jfc; // ������ ���ų� ������ �� ������ ������ �� �ֵ��� �ϴ� ���̾�α�

	boolean isChanged = false; // ���� �� �� ���������� �ִ��� ���������� ���� ����

	public Memo() {

		text = new JTextArea(10, 10); // ���� �ۼ��ϱ� ���� �ؽ�Ʈ����� ����
		text.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {

				isChanged = true;
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		setLayout(new BorderLayout()); // �������� ���̾ƾ��� ��,��,��,�� ����� ��ġ��

		jfc = new JFileChooser("c:/temp"); // ���ϼ����� ���� ���̾�α׸� ����
		f = this; // �ڽ��� JFrame�ɹ����� f�� ����
		JMenuBar bar = new JMenuBar(); // �޴��� ����
		JMenu jm = new JMenu("����"); // �ָ޴� ����
		JMenuItem item1 = new JMenuItem("���θ����"); // �θ޴� ����
		JMenuItem item2 = new JMenuItem("����");
		JMenuItem item3 = new JMenuItem("����");
		JMenuItem item4 = new JMenuItem("�ٸ��̸����� ����");
		JMenuItem item5 = new JMenuItem("����");

		jsp = new JScrollPane(text); // �ؽ�Ʈ����� ������ ���� �� �Ⱥ��̴� �͵��� �����ֵ���

		// ������ �޴��� ���� �̺�Ʈ ó��
		item1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// ���࿡ �ؽ�Ʈ�������� ��,���� ������ �����ϰ� ���ڱ��̰� 0���� ũ�ٸ�
				if (text.getText().trim().length() > 0) {

					// ����� ������ ���� �� ������ ����� ���࿡ showConfirmDialog �� ����ڰ� "��"�� �������� �ְ�
					// "�ƴϿ�"�� �������� �ְ� "���"�� �������� �ִ� ����ڰ� ������ �������� ������ ��ȯ�Ѵ�.
					// �� ������ int re�� ��ڴ�.
					int re = -1;
					// "�����Ͻðڽ��ϱ�?"��� ���̾�α״� ����� ������ ������
					// isChanged true�� ��

					if (isChanged == true) {
						re = JOptionPane.showConfirmDialog(f, "����� ������ �����Ͻðڽ��ϱ�?");
						// ��=0, �ƴϿ�=1 , ���=2
					}
					// ����ڰ� "��","�ƴϿ�","���"
					switch (re) {

					case 0: // ��
						saveFile(); // �����ϰ�
						text.setText(""); // �ؽ�Ʈ�������� ������ �����ش�.
						break;
					case 1: // �ƴϿ�
						text.setText("");
						break;
					case -1:
						text.setText("");

					case 2: // ���
						break;

					}
				}

			}
		});
		// "����"�� ���� ó��
		item2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// ����� ������ �����ϵ��� ���̾�α׸� ����.
				// "����"�� ��� �� ���� �ְ�, "����" ���߸� �������� �ִ�.
				// showOpenDialog �޼ҵ尡 "����" ������ 0 ��Ҹ� ������ 1
				int re = jfc.showOpenDialog(f);

				if (re == 0) { // ���⸦ �����°�?

					try {
						// ����ڰ� ���⸦ ������ ������ ������
						// JFileChooser ��ü�� jfc�� ����ִ�.
						// jfc.getSelectedFile() �޼ҵ带 ���� ����ڰ� ���⸦ ������ ������ ���� �´�.
						// ������ ������ �޸𸮷� �о� ���̱� ���Ͽ�
						// FileReader�� �̿��Ѵ�
						FileReader fr = new FileReader(jfc.getSelectedFile());

						int ch; // ������ ������ �ѱ��ھ� �о� ���̱� ���� ������ ����
								// read()�޼ҵ�� �� ������ �ڵ带 ��ȯ�ϹǷ�
								// ������ ������ �����.
						String str = ""; // ������ ���ڸ� �ѱ��ھ� �о�ͼ� ���ڿ��� �����Ϸ��� �Ѵ�.

						// ���Ϸκ��� �ѱ��ھ� �о�� ch�� ��´�
						// ������ ���� �����ϸ� -1�� ��ȯ�Ѵ�.
						// ������ ��Ÿ�� �ѱ��ھ� �о�´�.
						while ((ch = fr.read()) != -1) {
							str += (char) ch; // �о�� ������ �ڵ尪�� char�� ��ȯ�ϸ�
												// ���ڸ� ���� �� �ְ�
												// str�� �����Ѵ�.

						}
						text.setText(str); // ���Ϸ� ���� �о�� ������ ���ڿ��� �ؽ�Ʈ����� ��´�.
						fr.close(); // ������ ����� �������Ƿ� ������ �ݴ´�.
					} catch (Exception ex) {
						System.out.println(e.getActionCommand());
					}
				}
			}
		});
		item3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				saveFile();
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

	protected void saveFile() {
		// "����"��ư�� ������ �ؽ�Ʈ�������� ��� ������
		// C:/temp/bit.txt�� �����Ϸ��� �Ѵ�.

		// ����ڰ� ������ ���ϸ��� �Է��ϴ� ���̾�α׸� �����
		int re = -1;
		if (file == null) {
			re = jfc.showSaveDialog(f);
			file = jfc.getSelectedFile();
		} else {

			re = 0;
		}

		if (re == 0) {

			try {

				FileWriter fw = new FileWriter(file);

				fw.write(text.getText());
				fw.close();

				// ������ ������ ������ ������ ���ٴ� ǥ�÷� isChanged�� false�� �ɴ´�.
				isChanged = false;

			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}

	}

	public static void main(String[] args) {

		new Memo();
	}

}
