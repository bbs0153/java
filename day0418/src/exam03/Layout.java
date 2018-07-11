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

		box.addItem("변성인");
		box.addItem("차건우");
		box.addItem("송명준");
		box.addItem("이서희");

		add(box);
		add(jtf);

	}

}
