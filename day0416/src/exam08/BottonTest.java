package exam08;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BottonTest extends JFrame {

	JButton btn;
	Icon icon01;
	Icon icon02;
	Icon icon03;
	Icon man01;

	// 버튼에 마우스가 올라갔을때 이미지를 다르게 설정합니다.
	// 버튼을 눌렀을때 이미지를 다르게 설정합니다.

	public BottonTest() {

		setLayout(new FlowLayout());
		icon01 = new ImageIcon("btn01.png");
		icon02 = new ImageIcon("btn02.png");
		icon03 = new ImageIcon("btn03.png");
		btn = new JButton(icon01);

		btn.setRolloverIcon(icon02);
		btn.setPressedIcon(icon03);

		add(btn);

		man01 = new ImageIcon("man01.png");
		JLabel lb = new JLabel(man01);

		add(lb);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// btn = new
	}

	public static void main(String[] args) {

		new BottonTest();
	}

}
