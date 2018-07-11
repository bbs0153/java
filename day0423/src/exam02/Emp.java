package exam02;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Emp extends JFrame {

	JFrame f;

	JTextField jtf_eno = new JTextField(10);
	JTextField jtf_ename = new JTextField(10);
	JTextField jtf_dno = new JTextField(10);
	JTextField jtf_esal = new JTextField(10);
	JTextField jtf_elevel = new JTextField(10);
	JTextField jtf_ejumin = new JTextField(10);
	JTextField jtf_eaddr = new JTextField(10);
	JTextField jtf_ehiredate = new JTextField(10);

	Vector<String> colNames;
	Vector<Vector<String>> rowData;

	JTable table;

	String url = "jdbc:oracle:thin:@203.236.209.106:1521:XE";

	public Emp() {

		f = this;

		colNames = new Vector<String>();
		colNames.add("사원번호");
		colNames.add("사원이름");
		colNames.add("부서번호");
		colNames.add("급여");
		colNames.add("직책");
		colNames.add("주민번호");
		colNames.add("주소");
		colNames.add("입사일");

		rowData = new Vector<Vector<String>>();

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		JLabel jlb_eno = new JLabel("사원번호");
		JLabel jlb_ename = new JLabel("사원이름");
		JLabel jlb_dno = new JLabel("부서번호");
		JLabel jlb_esal = new JLabel("급여");
		JLabel jlb_elevel = new JLabel("직책");
		JLabel jlb_ejumin = new JLabel("주민번호");
		JLabel jlb_eaddr = new JLabel("주소");
		JLabel jlb_ehiredate = new JLabel("입사일");

		JButton btn1 = new JButton("추가");
		JButton btn2 = new JButton("수정");
		JButton btn3 = new JButton("삭제");

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

				jtf_eno.setText(v.get(0));
				jtf_ename.setText(v.get(1));
				jtf_dno.setText(v.get(2));
				jtf_esal.setText(v.get(3));
				jtf_elevel.setText(v.get(4));
				jtf_ejumin.setText(v.get(5));
				jtf_eaddr.setText(v.get(6));
				jtf_ehiredate.setText(v.get(7));

			}
		});

		JScrollPane jsp = new JScrollPane(table);

		getList();

		p1.setLayout(new GridLayout(8, 2));
		p1.add(jlb_eno);
		p1.add(jtf_eno);
		p1.add(jlb_ename);
		p1.add(jtf_ename);
		p1.add(jlb_dno);
		p1.add(jtf_dno);
		p1.add(jlb_esal);
		p1.add(jtf_esal);
		p1.add(jlb_elevel);
		p1.add(jtf_elevel);
		p1.add(jlb_ejumin);
		p1.add(jtf_ejumin);
		p1.add(jlb_eaddr);
		p1.add(jtf_eaddr);
		p1.add(jlb_ehiredate);
		p1.add(jtf_ehiredate);

		p2.setLayout(new FlowLayout());
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		p2.add(jsp);

		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);

		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void getList() {

		String sql = "select * from emp";
		rowData.clear();

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cnn = DriverManager.getConnection(url, "madang", "madang");
			Statement stmt = cnn.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				Vector<String> v = new Vector<String>();

				v.add(rs.getInt(1) + "");
				v.add(rs.getString(2) + "");
				v.add(rs.getInt(3) + "");
				v.add(rs.getInt(4) + "");
				v.add(rs.getString(5) + "");
				v.add(rs.getString(6) + "");
				v.add(rs.getString(7) + "");
				v.add(rs.getDate(8) + "");

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

		new Emp();
	}

}
