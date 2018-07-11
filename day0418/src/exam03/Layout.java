package exam03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Layout extends JPanel {

	public Layout() {

		JComboBox<String> box = new JComboBox<String>();
		JTextField jtf = new JTextField(10);

		box.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				jtf.setText(box.getSelectedItem() + "");
			}
		});

		box.addItem("������");
		box.addItem("���ǿ�");
		box.addItem("�۸���");
		box.addItem("�̼���");

		add(box);
		add(jtf);

	}

}
