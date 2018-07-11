package exam02;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InsertStudent extends JFrame {

	public InsertStudent() {

		setLayout(new FlowLayout());

		JPanel p1 = new JPanel();
		JLabel lb_name = new JLabel("이름");
		JLabel lb_kor = new JLabel("국어");
		JLabel lb_eng = new JLabel("영어");
		JLabel lb_math = new JLabel("수학");
		JTextField jtf_name = new JTextField(10);
		JTextField jtf_kor = new JTextField(10);
		JTextField jtf_eng = new JTextField(10);
		JTextField jtf_math = new JTextField(10);
		JTextField jtf = new JTextField(10);
		JButton btn = new JButton("추가");

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String name = jtf_name.getText();
				String kor = jtf_kor.getText();
				String eng = jtf_eng.getText();
				String math = jtf_math.getText();

				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");

					String url = "jdbc:oracle:thin:@203.236.209.106:1521:XE";
					String user = "madang";
					String pwd = "madang";

					Connection conn = DriverManager.getConnection(url, user, pwd);

					java.sql.Statement stmt = conn.createStatement();

					stmt.executeUpdate(
							"insert into student values('" + name + "'," + kor + "," + eng + "," + math + ')');
					stmt.close();
					conn.close();

					jtf.setText("추가됨");

				} catch (Exception ee) {
					System.out.println(ee.getMessage());
				}

			}
		});

		add(lb_name);
		add(jtf_name);
		add(lb_kor);
		add(jtf_kor);
		add(lb_eng);
		add(jtf_eng);
		add(lb_math);
		add(jtf_math);
		add(jtf);
		add(btn);

		setSize(800, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new InsertStudent();
	}
}
