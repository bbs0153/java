package home2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

//�� �ڵ忡 ������ �ڽŸ��� ���� ���� ���ϴ�.
public class BookDB extends JFrame {

	JTextField jtf_num = new JTextField(10);
	JTextField jtf_name = new JTextField(10);
	JTextField jtf_pub = new JTextField(10);
	JTextField jtf_price = new JTextField(10);

	Vector<String> colNames;
	Vector<Vector> rowData;
	JTable table;
	JFrame f;

	String url = "jdbc:oracle:thin:@203.236.209.91:1521:XE";

	public BookDB() {

		f = this;
		colNames = new Vector<String>();
		rowData = new Vector<Vector>();

		colNames.add("������ȣ");
		colNames.add("�����̸�");
		colNames.add("���ǻ�");
		colNames.add("����");

		table = new JTable(rowData, colNames);

		// ���̺� ���콺�� Ŭ���ϸ� ������ ������ ������
		// ������ �ؽ�Ʈ�ʵ忡 ���
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
				// TODO Auto-generated method stub

				// ���̺��� ������ ���ȣ�� �˾ƿ´�.
				int row = table.getSelectedRow();

				// ��ü���������� ��� ����(rowData)����
				// ������ �࿡ �ش��ϴ� ������ �̾ƿ´�.
				Vector<String> v = rowData.get(row);

				// ���Ϳ� ��� ������ �ϳ��� �ؽ�Ʈ�ʵ忡 ����Ѵ�.
				jtf_num.setText(v.get(0));
				jtf_name.setText(v.get(1));
				jtf_pub.setText(v.get(2));
				jtf_price.setText(v.get(3));
			}
		});

		JScrollPane jsp = new JScrollPane(table);

		listClient();

		JButton jbt = new JButton("����");
		JButton jbtUpdate = new JButton("����");
		JButton jbtDelete = new JButton("����");

		JPanel p = new JPanel();

		p.add(new JLabel("������ȣ"));
		p.add(jtf_num);
		p.add(new JLabel("�����̸�"));
		p.add(jtf_name);
		p.add(new JLabel("���ǻ�"));
		p.add(jtf_pub);
		p.add(new JLabel("����"));
		p.add(jtf_price);
		p.add(jbt);
		p.add(jbtUpdate);
		p.add(jbtDelete);

		// ������ ���� ó��
		jbtDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				int no;
				// ����ڰ� ������ ������ å��ȣ�� no�� �����Ѵ�.

				// 1) ���̺��� ������ ���ȣ�� �˾ƿ´�.
				int row = table.getSelectedRow();

				// 2) �� ���ȣ�� �ش��ϴ� �����͸� ���Ϳ��� �˾ƿ´�.
				Vector<String> v = rowData.get(row);

				// 3) �� ������ ù��° �����Ͱ� �ٷ� å��ȣ
				no = Integer.parseInt(v.get(0));

				// ����ڰ� ������ å��ȣ�� �ش��ϴ� ������ �����ϱ����� sql��ɾ�
				String sql = "delete book where bnum=" + no;

				try {

					// 1. jdbc����̹��� �޸𸮷� �ε��Ѵ�.
					Class.forName("oracle.jdbc.driver.OracleDriver");

					// 2. database Server�� �����Ѵ�.
					Connection conn = DriverManager.getConnection(url, "madang", "madang");

					// 3. sql��ɾ �����ϱ� ���� Statement ��ü�� �����Ѵ�.
					Statement stmt = conn.createStatement();

					// 4. Statement ��ü�� ���� sql��ɾ �����Ѵ�.
					// executeUpdate : ���ڵ带 �߰�,����,������ ��
					// executeQuery : ���ڵ带 �˻�

					int re = stmt.executeUpdate(sql);
					// executeUpate��
					// sql��ɾ �����ͺ��̽��� ������ �ִ� ��ɾ�
					// (insert, update, delete)�϶� ����ϸ�
					// ���������� ����� ������ ���ڵ��� ���� ��ȯ�Ѵ�.

					if (re > 0) {
						JOptionPane.showMessageDialog(f, "�ش� ������ �����Ͽ����ϴ�.");
					} else {
						JOptionPane.showMessageDialog(f, "���� ������ �����Ͽ����ϴ�.");
					}

					// ����ߴ� �ڿ��� ��� �ݾ� �ش�.
					stmt.close();
					conn.close();

				} catch (Exception ex) {
					// TODO: handle exception
					System.out.println(ex.getMessage());
				}

				listClient();

			}
		});

		// ������ ���� ó��
		jbtUpdate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				// ������ȣ�� 5���� ������ �������� '����ִ� �ǰ�'
				// ������ 8500��, ���ǻ�� ��Ʈ�������� �����ϱ� ���� sql ��ɾ�

				int bnum = Integer.parseInt(jtf_num.getText());
				String bname = jtf_name.getText();
				int bprice = Integer.parseInt(jtf_price.getText());
				String bpub = jtf_pub.getText();

				String sql = "update book set bname='" + bname + "',bprice=" + bprice + ",bpub='" + bpub
						+ "' where bnum=" + bnum;

				// �����ͺ��̽��� �����Ͽ� ���� sql��ɾ �����ϵ��� �Ѵ�.

				try {
					// 1. jdbc ����̹��� �޸𸮷� �ε��Ѵ�.
					Class.forName("oracle.jdbc.driver.OracleDriver");

					// 2. Database Server�� �����Ѵ�.
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.91:1521:XE", "madang",
							"madang");

					// 3. Sql ��� ���� ������� Statement ��ü�� �����Ѵ�.
					Statement stmt = conn.createStatement();

					// 4. Statement ��ü�� ���ؼ� sql��ɾ �����Ѵ�.
					// executeUpdate : sql��ɾ �����ͺ��̽��� ������ �ִ� ��ɾ�(insert, update, delete)�� �����ϰ�
					// ���������� sql��ɾ ������ ���ڵ��� ���� ��ȯ
					// executeQuery : sql��� �˻�(select)�϶� ����ϸ�
					// �˻��� ����� ResultSet���� ��ȯ

					int re = stmt.executeUpdate(sql);
					if (re > 0) {
						JOptionPane.showConfirmDialog(f, "������ �����Ͽ����ϴ�.");
					} else {
						JOptionPane.showMessageDialog(f, "������ �����Ͽ����ϴ�.");
					}

					stmt.close();
					conn.close();

					listClient();

				} catch (Exception ex) {
					// TODO: handle exception
					System.out.println(ex.getMessage());
				}

			}
		});

		jbt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String sql = "insert into book values(" + jtf_num.getText() + ",'" + jtf_name.getText() + "','"
						+ jtf_pub.getText() + "'," + jtf_price.getText() + ")";
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");

					Connection conn = DriverManager.getConnection(url, "madang", "madang");
					Statement stmt = conn.createStatement();

					stmt.executeUpdate(sql);

				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
				listClient();
			}
		});

		add(p, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		setSize(900, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// ��� ��������� �˻��Ͽ� rowData�� ��´�.
	private void listClient() {

		String sql = "select * from book";
		rowData.clear();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection(url, "madang", "madang");
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);

			while (rs.next()) {
				Vector<String> v = new Vector<String>();
				v.add(rs.getInt(1) + "");
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getInt(4) + "");

				rowData.add(v);
			}
			table.updateUI();

			rs.close();
			stat.close();
			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {

		new BookDB();
	}

}
