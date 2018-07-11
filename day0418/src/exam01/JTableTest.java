package exam01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JTableTest extends JFrame {

	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	JTable table;

	JTextField name_jft;
	JTextField kor_jft;
	JTextField eng_jft;
	JTextField math_jft;

	JFrame f;

	public JTableTest() {

		f = this;

		setLayout(new GridLayout(2, 1));

		JLabel name = new JLabel("�̸�");
		JLabel kor = new JLabel("����");
		JLabel eng = new JLabel("����");
		JLabel math = new JLabel("����");
		name_jft = new JTextField(10);
		kor_jft = new JTextField(10);
		eng_jft = new JTextField(10);
		math_jft = new JTextField(10);

		colNames = new Vector<String>();
		rowData = new Vector<Vector<String>>();

		colNames.add("�̸�");
		colNames.add("����");
		colNames.add("����");
		colNames.add("����");

		Vector<String> v1 = new Vector<String>();
		v1.add("������");
		v1.add("100");
		v1.add("100");
		v1.add("100");

		Vector<String> v2 = new Vector<String>();
		v2.add("�ѻ���");
		v2.add("100");
		v2.add("100");
		v2.add("100");

		Vector<String> v3 = new Vector<String>();
		v3.add("������");
		v3.add("100");
		v3.add("100");
		v3.add("100");

		rowData.add(v1);
		rowData.add(v2);
		rowData.add(v3);

		table = new JTable(rowData, colNames);

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

				name_jft.setText(v.get(0));
				kor_jft.setText(v.get(1));
				eng_jft.setText(v.get(2));
				math_jft.setText(v.get(3));

			}
		});

		JScrollPane jsp = new JScrollPane(table);

		JPanel p_up = new JPanel();
		JPanel p_up_1 = new JPanel();
		JPanel p_up_2 = new JPanel();

		p_up.setLayout(new BorderLayout());
		p_up.add(p_up_1, BorderLayout.CENTER);
		p_up.add(p_up_2, BorderLayout.SOUTH);
		p_up_1.setLayout(new GridLayout(4, 2));

		p_up_1.add(name);
		p_up_1.add(name_jft);
		p_up_1.add(kor);
		p_up_1.add(kor_jft);
		p_up_1.add(eng);
		p_up_1.add(eng_jft);
		p_up_1.add(math);
		p_up_1.add(math_jft);

		JButton btn_add = new JButton("�߰�");
		JButton btn_update = new JButton("����");
		JButton btn_delete = new JButton("����");

		btn_add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (name_jft.getText().equals("") || kor_jft.getText().equals("") || eng_jft.getText().equals("")
						|| math_jft.getText().equals("")) {

					JOptionPane.showMessageDialog(f, "�߰��Ϸ��� ������ �Է��ϼ���", "����", JOptionPane.INFORMATION_MESSAGE);
					return;

				}

				Vector<String> info = new Vector<String>();

				info.add(name_jft.getText());
				info.add(kor_jft.getText());
				info.add(eng_jft.getText());
				info.add(math_jft.getText());
				// ����ڰ� �Է��� ����(�̸�,����,����,����)��
				// ���Ϳ� ��´�.
				rowData.add(info);
				// �Է��� �ѻ���� �л��� ������ ��� ���͸�
				// ��ü�л��� ������ ��� �ִ� rowData�� ��´�.

				name_jft.setText("");
				kor_jft.setText("");
				eng_jft.setText("");
				math_jft.setText("");

				table.updateUI();
				// ���Ϳ� ����� ������ �ٽ� �о� �ͼ� ���̺� �ݿ�
			}
		});
		btn_update.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Vector<String> v = new Vector<String>();
				int idx = table.getSelectedRow();

				if (idx == -1) {

					JOptionPane.showMessageDialog(f, "������ �׸��� �����ϼ���", "����", JOptionPane.ERROR_MESSAGE);
					return;
				}

				v.add(name_jft.getText());
				v.add(kor_jft.getText());
				v.add(eng_jft.getText());
				v.add(math_jft.getText());

				rowData.setElementAt(v, idx);

				table.updateUI();
			}
		});
		btn_delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// ������ �׸��� �������� �ʾҴ��� �˻�
				if (table.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(f, "������ �׸��� �����ϼ���", "����", JOptionPane.ERROR_MESSAGE);
					return;
				}

				rowData.remove(table.getSelectedRow());

				table.updateUI();
			}
		});

		p_up_2.add(btn_add);
		p_up_2.add(btn_update);
		p_up_2.add(btn_delete);

		add(p_up);
		add(jsp);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new JTableTest();
	}

}
