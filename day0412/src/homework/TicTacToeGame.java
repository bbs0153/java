package homework;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTacToeGame extends JFrame implements ActionListener {

	JButton b[];
	String[] arr = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };

	Random r = new Random();
	int r1 = r.nextInt(3);
	

	public TicTacToeGame() {

		setLayout(new GridLayout(3, 3));

		b = new JButton[9];
		for (int i = 0; i < b.length; i++) {

			b[i] = new JButton(arr[i]);
			add(b[i]);
			b[i].addActionListener(this);
		}

		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
			if(r1==1) {
				
				e.getActionCommand();
			}
		
	}

	public static void main(String[] args) {
		new TicTacToeGame();
	}
}
