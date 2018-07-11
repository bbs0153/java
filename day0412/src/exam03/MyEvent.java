package exam03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class MyEvent implements ActionListener {

	private RadioTest rTest;

	public MyEvent(RadioTest rTest) {

		this.rTest = rTest;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		rTest.jtf01.setText(e.getActionCommand());
	}

}
