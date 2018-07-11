package exam05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ComboBoxTest extends JFrame {

	JLabel jtf;

	public ComboBoxTest() {

		Vector<String> v = new Vector<String>();

		jtf = new JLabel();

		v.add("��ȭ");
		v.add("��");
		v.add("ģ��");
		v.add("������");
		v.add("������");
		v.add("�Ƿ�");
		v.add("�ǰ�");
		v.add("���");
		v.add("��");

		JComboBox<String> jcb = new JComboBox<String>(v);

		jcb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf.setText(jcb.getSelectedItem() + "");

			}
		});

		setLayout(new FlowLayout());
		add(jcb);
		add(jtf);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new ComboBoxTest();
	}

}
