package exam02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//JRadioButton은 하나의 항목만 선택되도록 하려면 
//원하는 것들을 묶어 그룹을 설정해야 한다. ==> ButtonGroup

public class RadioTest extends JFrame implements ActionListener {

	JRadioButton jrb01;
	JRadioButton jrb02;
	JTextField jtf01;
	ButtonGroup bg;

	public RadioTest() {

		setLayout(new FlowLayout());

		jrb01 = new JRadioButton("남자");
		jrb02 = new JRadioButton("여자");
		jtf01 = new JTextField(10);

		bg = new ButtonGroup();

		bg.add(jrb01);
		bg.add(jrb02);

		add(jrb01);
		add(jrb02);
		add(jtf01);

		jrb01.addActionListener(this);
		jrb02.addActionListener(this);

		setSize(200, 200);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new RadioTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		jtf01.setText("당신은 " + e.getActionCommand() + "이군요");
	}

}
