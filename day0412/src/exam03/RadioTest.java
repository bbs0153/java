package exam03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//JRadioButton�� �ϳ��� �׸� ���õǵ��� �Ϸ��� 
//���ϴ� �͵��� ���� �׷��� �����ؾ� �Ѵ�. ==> ButtonGroup
class RadioTest extends JFrame {

	JRadioButton jrb01;
	JRadioButton jrb02;
	JTextField jtf01;
	ButtonGroup bg;

	public RadioTest() {

		setLayout(new FlowLayout());

		jrb01 = new JRadioButton("����");
		jrb02 = new JRadioButton("����");
		jtf01 = new JTextField(10);

		MyEvent me = new MyEvent(this);
		jrb01.addActionListener(me);
		jrb02.addActionListener(me);
	

		bg = new ButtonGroup();

		bg.add(jrb01);
		bg.add(jrb02);

		add(jrb01);
		add(jrb02);
		add(jtf01);

		setSize(200, 200);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new RadioTest();
	}

}
