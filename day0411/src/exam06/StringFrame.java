package exam06;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StringFrame extends JFrame implements ActionListener {

	private JTextField n;
	private JLabel result;

	public StringFrame() {

		setLayout(new FlowLayout());

		JLabel str = new JLabel("0~9사이 정수 입력");
		n = new JTextField(5);

		JButton b = new JButton("한글 변환");

		b.addActionListener(this);

		result = new JLabel("    ");

		add(str);
		add(n);
		add(b);
		add(result);

		setSize(500, 500);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String str1[] = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };

		int r = Integer.parseInt(n.getText());

		result.setText(str1[r]);

	}

}
