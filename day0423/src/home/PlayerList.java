package home;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class PlayerList extends JFrame {

	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	JTable table;

	JFrame f;

	public PlayerList() {

		f = this;

		colNames = new Vector<String>();
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
		JTextField jtf_number = new JTextField(10);
		JTextField jtf_name = new JTextField(10);
		JTextField jtf_jumin = new JTextField(10);
		JTextField jtf_addr = new JTextField(10);
		JTextField jtf_phone = new JTextField(10);
		JButton btn1 = new JButton("�߰�");
		JButton btn2 = new JButton("����");
		JButton btn3 = new JButton("����");

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String sql = "insert into playerlist values(?,?,?,?,?)";

				rowData.clear();

				int cnum = Integer.parseInt(jtf_number.getText());
				String cname = jtf_name.getText();
				String cjumin = jtf_jumin.getText();
				String caddr = jtf_addr.getText();
				String cphone = jtf_phone.getText();

				try {

					Class.forName("oracle.jdbc.driver.OracleDriver");

					Connection cnn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.106:1521:XE", "madang",
							"madang");

					PreparedStatement pstmt = cnn.prepareStatement(sql);

					pstmt.setInt(1, cnum);
					pstmt.setString(2, cname);
					pstmt.setString(3, cjumin);
					pstmt.setString(4, caddr);
					pstmt.setString(5, cphone);

					pstmt.executeUpdate();

					jtf_number.setText("");
					jtf_name.setText("");
					jtf_jumin.setText("");
					jtf_addr.setText("");
					jtf_phone.setText("");

					getList();

					pstmt.close();
					cnn.close();

				} catch (Exception ee) {

					System.out.println(ee.getMessage());

				}

			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String sql = "update playerlist set �̸�='" + jtf_name.getText() + "', �ֹι�ȣ='" + jtf_jumin.getText()
						+ "', �ּ�='" + jtf_addr.getText() + "', �ڵ�����ȣ='" + jtf_phone.getText() + "' where ����ȣ="
						+ jtf_number.getText();

				try {

					Class.forName("oracle.jdbc.driver.OracleDriver");

					Connection cnn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.106:1521:XE", "madang",
							"madang");
					Statement stmt = cnn.createStatement();

					int re = stmt.executeUpdate(sql);

					if (re > 0) {

						JOptionPane.showMessageDialog(f, "������ �����߽��ϴ�.");

						jtf_number.setText("");
						jtf_name.setText("");
						jtf_jumin.setText("");
						jtf_addr.setText("");
						jtf_phone.setText("");

					} else {

						JOptionPane.showMessageDialog(f, "������ �����߽��ϴ�.");

					}

					getList();

					stmt.close();
					cnn.close();

				} catch (Exception ee) {

					System.out.println(ee.getMessage());

				}

			}
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int row = table.getSelectedRow();
				Vector<String> v = rowData.get(row);
				int no = Integer.parseInt(v.get(0));

				String sql = "delete playerlist where ����ȣ=?";

				rowData.clear();

				try {

					Class.forName("oracle.jdbc.driver.OracleDriver");

					Connection cnn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.106:1521:XE", "madang",
							"madang");
					PreparedStatement pstmt = cnn.prepareStatement(sql);

					pstmt.setInt(1, no);

					int re = pstmt.executeUpdate();

					if (re > 0) {

						JOptionPane.showMessageDialog(f, "���������� �����Ǿ����ϴ�.");

						jtf_number.setText("");
						jtf_name.setText("");
						jtf_jumin.setText("");
						jtf_addr.setText("");
						jtf_phone.setText("");

					} else {
						JOptionPane.showMessageDialog(f, "������ �����߽��ϴ�.");
					}

					getList();

					pstmt.close();
					cnn.close();

				} catch (Exception ee) {

					System.out.println(ee.getMessage());
				}

			}
		});

		table = new JTable(rowData, colNames);
		// �����ͺ��̽��� �����Ͽ�
		// ������ sql��ɾ �����Ͽ� ������ �����
		// ���̺��� �����͸� ǥ���ϱ� ���� ����(rowData)�� ��´�.

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

		getList();

		JScrollPane jsp = new JScrollPane(table);

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

		String sql = "select * from  playerlist";

		rowData.clear();

		try {
			// jdbc ����̹��� �޸𸮿� �ε��Ѵ�.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// db������ ����
			Connection cnn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.106:1521:XE", "madang",
					"madang");
			// sql��ɾ �����ϱ� ���� Statement��ü ����
			Statement stmt = cnn.createStatement();

			// Statement ��ü�� ���� sql��ɾ ����
			// executeUpdate : ���ڵ带 �߰�,����,����
			// executeQuery : ���ڵ带 �˻�

			// �˻��� ����� ResulteSet���� ��ȯ
			// ResulteSet���� �˻��� ���ڵ�� �߿� Ư�� ���ڵ带 ����Ű�� Ŀ���� �������ִ�.
			// ó�� �������� ���� Ŀ���� ���ڵ���� ����� �ٶ󺸰� �ִ�.
			ResultSet rs = stmt.executeQuery(sql);

			// ��� ���ڵ���� �ϳ��� ��ó���� ���ؼ���
			// Ŀ���� �������ڵ带 �Űܰ��鼭 �۾��� �����ؾ��Ѵ�.
			// �̶� Ŀ���� �������ڵ带 �Ű��ִ� �޼ҵ尡 next()�޼ҵ� �̴�.
			// �� next()�޼ҵ�� Ŀ���� ���������� ���������� �ű�� true�� ��ȯ�Ͽ�
			// ���̻� �������ڵ尡 ���� �ű��� ���ϸ� false�� ��ȯ�Ѵ�.
			while (rs.next()) {
				// ���� Ŀ���� �ٶ󺸰� �ִ� ���ڵ��� ������ ��� ���� Vector ����
				Vector<String> v = new Vector<String>();

				v.add(rs.getInt(1) + ""); // ���� Ŀ���� �ٶ󺸰� �ִ� ���ڵ��� ù���� Į��(����ȣ)�� �о�ͼ� ���Ϳ� ��´�.
				v.add(rs.getString(2)); // ���� Ŀ���� �ٶ󺸰� �ִ� ���ڵ��� �ι��� Į��(���̸�)�� �о�ͼ� ���Ϳ� ��´�.
				v.add(rs.getString(3));
				v.add(rs.getString(4));
				v.add(rs.getString(5));

				// ���� Ŀ���� �ٶ󺸰� �ִ� ������ ��� ��� �ִ� ����(v)�� ��ü�ڷḦ ��� ����(rowData)�� ��´�.
				rowData.add(v);

			}

			table.updateUI();

			rs.close();
			stmt.close();
			cnn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {

		new PlayerList();
	}

}
