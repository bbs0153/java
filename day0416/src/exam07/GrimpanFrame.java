package exam07;

import java.awt.Color;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GrimpanFrame extends JFrame {

	GrimpanPanel grimpan;
	JFileChooser jfc;
	JColorChooser jcc;

	JFrame f;

	public GrimpanFrame() {

		f = this;

		grimpan = new GrimpanPanel();
		add(grimpan);

		jfc = new JFileChooser("c:/temp");
		jcc = new JColorChooser(Color.BLACK);

		JMenuBar jmb = new JMenuBar();

		JMenu mn_file = new JMenu("����");
		JMenuItem file_new = new JMenuItem("������");
		JMenuItem file_open = new JMenuItem("����");
		JMenuItem file_save = new JMenuItem("����");
		JMenuItem file_exit = new JMenuItem("����");

		file_new.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				grimpan.list.clear();

				grimpan.repaint();

			}
		});
		file_open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int re = jfc.showOpenDialog(f);

				if (re == JFileChooser.APPROVE_OPTION) {

					try {
						File file = jfc.getSelectedFile();

						FileInputStream fis = new FileInputStream(file);
						ObjectInputStream ois = new ObjectInputStream(fis);

						grimpan.list = (ArrayList<GraphicInfo>) ois.readObject();
						grimpan.repaint();

						ois.close();
					} catch (Exception ex) {
						System.out.println(ex.getMessage());
					}

				}

			}
		});
		file_save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int re = jfc.showSaveDialog(f);

				if (re == JFileChooser.APPROVE_OPTION) {

					try {
						File file = jfc.getSelectedFile();
						FileOutputStream fos = new FileOutputStream(file);
						ObjectOutputStream oos = new ObjectOutputStream(fos);

						oos.writeObject(grimpan.list);

						oos.close();
					} catch (Exception ex) {
						System.out.println(ex.getMessage());
					}

				}
			}
		});
		file_exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		mn_file.add(file_new);
		mn_file.add(file_open);
		mn_file.add(file_save);
		mn_file.add(file_exit);

		JMenu mn_color = new JMenu("�׸��� ����");
		JMenuItem color_red = new JMenuItem("����");
		JMenuItem color_green = new JMenuItem("�ʷ�");
		JMenuItem color_black = new JMenuItem("����");
		JMenuItem color_dlg = new JMenuItem("�ٸ�����...");

		color_red.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				grimpan.drawColor = Color.red;
			}
		});
		color_green.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				grimpan.drawColor = Color.green;
			}
		});
		color_black.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				grimpan.drawColor = Color.black;
			}
		});
		color_dlg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				grimpan.drawColor = jcc.showDialog(f, "������ �����ϼ���", Color.RED);
			}
		});

		mn_color.add(color_red);
		mn_color.add(color_green);
		mn_color.add(color_black);
		mn_color.add(color_dlg);

		JMenu mn = new JMenu("�׸��� ����");
		JMenuItem mn_Line = new JMenuItem("�� �׸���");
		JMenuItem mn_Oval = new JMenuItem("�� �׸���");
		JMenuItem mn_Rect = new JMenuItem("�簢�� �׸���");

		mn_Line.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				grimpan.drawType = 0;
			}
		});
		mn_Oval.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				grimpan.drawType = 1;
			}
		});
		mn_Rect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				grimpan.drawType = 2;
			}
		});

		mn.add(mn_Line);
		mn.add(mn_Oval);
		mn.add(mn_Rect);

		jmb.add(mn_file);
		jmb.add(mn);
		jmb.add(mn_color);

		setJMenuBar(jmb);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new GrimpanFrame();
	}

}
