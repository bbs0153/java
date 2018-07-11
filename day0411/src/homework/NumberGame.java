package homework;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberGame extends JFrame implements ActionListener {

	int com;
	JTextField jtf;
	JTextField jlb;
	JLabel test;
	int count;
	JButton b1;
	JButton b2;

	Random r = new Random();
	int r1 = r.nextInt(101);

	public NumberGame(String title) {

		super(title);
		setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();

		JLabel jbl3 = new JLabel("숫자를 추측하시오:");
		jtf = new JTextField(10);

		p1.add(jbl3);
		p1.add(jtf);
		add(p1, BorderLayout.NORTH);

		jlb = new JTextField(5);
		// jlb.setHorizontalAlignment(SwingConstants.CENTER);
		test = new JLabel("         ");
		p2.add(jlb);
		p2.add(test);
		add(p2, BorderLayout.CENTER);

		b1 = new JButton("다시한번");
		b2 = new JButton("종료");
		p3.add(b1);
		p3.add(b2);
		add(p3, BorderLayout.SOUTH);

		b1.addActionListener(this);
		b2.addActionListener(this);

		setSize(250, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("종료")) {
			System.exit(0);
		}
		if (e.getActionCommand().equals("다시한번")) {

			int a = Integer.parseInt(jtf.getText());
			count++;

			test.setText(count + "째 시도");

			if (count == 7) {
				b1.setEnabled(false);
			}

			if (r1 < a) {
				jlb.setText("높습니다");
				jlb.setBackground(Color.YELLOW);
			} else if (r1 > a) {
				jlb.setText("낮습니다");
				jlb.setBackground(Color.RED);
			} else {
				jlb.setText("정답");
				jlb.setBackground(Color.GREEN);
				r1 = r.nextInt(101);
			}

		}

	}

	public static void main(String[] args) {

		new NumberGame("숫자게임");
	}
}
