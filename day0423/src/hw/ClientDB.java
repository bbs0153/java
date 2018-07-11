package hw;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ClientDB extends JFrame {

	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	JTable table;

	JFrame f;

	ClientDAO dao;

	JTextField jtf_number = new JTextField(10);
	JTextField jtf_name = new JTextField(10);
	JTextField jtf_jumin = new JTextField(10);
	JTextField jtf_addr = new JTextField(10);
	JTextField jtf_phone = new JTextField(10);

	public ClientDB() {

		f = this;

		colNames = new Vector<String>();
		dao = new ClientDAO();
		rowData = new Vector<Vector<String>>();

		colNames.add("����ȣ");
		colNames.add("�̸�");
		colNames.add("�ֹι�ȣ");
		colNames.add("�ּ�");
		colNames.add("�ڵ�����ȣ");

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JLabel jlb_number = new JLabel("����ȣ");
		JLabel jlb_name = new JLabel("�̸�");
		JLabel jlb_jumin = new JLabel("�ֹι�ȣ");
		JLabel jlb_addr = new JLabel("�ּ�");
		JLabel jlb_phone = new JLabel("�ڵ�����ȣ");
		JButton btn1 = new JButton("�߰�");
		JButton btn2 = new JButton("����");
		JButton btn3 = new JButton("����");

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				ClientVO cv = new ClientVO();

				cv.setCno(Integer.parseInt(jtf_number.getText()));
				cv.setCname(jtf_name.getText());
				cv.setCjumin(jtf_jumin.getText());
				cv.setCaddr(jtf_addr.getText());
				cv.setCphone(jtf_phone.getText());

				int re = dao.updateClient(cv);

				if (re > 0) {
					JOptionPane.showMessageDialog(f, "���������� �����Ͽ����ϴ�.");
					getList();
				} else {
					JOptionPane.showMessageDialog(f, "������ �����߽��ϴ�.");
				}

			}
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int row = table.getSelectedRow();
				Vector<String> v = rowData.get(row);
				int cno = Integer.parseInt(v.get(0));

				int re = dao.deletcClient(cno);

				if (re > 0) {

					JOptionPane.showMessageDialog(f, "���������� �����Ͽ����ϴ�");
					getList();

				} else {

					JOptionPane.showMessageDialog(f, "���� �����Ͽ����ϴ�");
				}

			}
		});

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ClientVO cv = new ClientVO();

				cv.setCno(Integer.parseInt(jtf_number.getText()));
				cv.setCname(jtf_name.getText());
				cv.setCjumin(jtf_jumin.getText());
				cv.setCaddr(jtf_addr.getText());
				cv.setCphone(jtf_phone.getText());

				int re = dao.insertClient(cv);

				if (re > 0) {

					JOptionPane.showMessageDialog(f, "���������� �߰��Ͽ����ϴ�.");
					getList();

				} else {
					JOptionPane.showMessageDialog(f, "�߰� �����߽��ϴ�.");
				}

			}
		});

		table = new JTable(rowData, colNames);

		// ���̺� ���콺 �̺�Ʈ�� ����Ͽ� ������ ���� ������ ������ �ؽ�Ʈ�ʵ忡 ���
		table.addMouseListener(new MouseListener() {

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
			public void mouseClicked(MouseEvent e) {

				int row = table.getSelectedRow();
				Vector<String> v = rowData.get(row);

				jtf_number.setText(v.get(0));
				jtf_name.setText(v.get(1));
				jtf_jumin.setText(v.get(2));
				jtf_addr.setText(v.get(3));
				jtf_phone.setText(v.get(4));

			}
		});

		JScrollPane jsp = new JScrollPane(table);

		getList();

		p1.setLayout(new GridLayout(5, 2));
		p1.add(jlb_number);
		p1.add(jtf_number);
		p1.add(jlb_name);
		p1.add(jtf_name);
		p1.add(jlb_jumin);
		p1.add(jtf_jumin);
		p1.add(jlb_addr);
		p1.add(jtf_addr);
		p1.add(jlb_phone);
		p1.add(jtf_phone);

		p2.setLayout(new FlowLayout());
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);

		p2.add(jsp);

		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void getList() {

		rowData.clear();

		ArrayList<ClientVO> arr = new ArrayList<ClientVO>();
		arr = dao.selectAll();

		for (ClientVO cv : arr) {
			Vector<String> v = new Vector<String>();

			v.add(cv.getCno() + "");
			v.add(cv.getCname());
			v.add(cv.getCjumin());
			v.add(cv.getCaddr());
			v.add(cv.getCphone());

			rowData.add(v);
		}
		table.updateUI();
	}

	public static void main(String[] args) {

		new ClientDB();
	}

}
