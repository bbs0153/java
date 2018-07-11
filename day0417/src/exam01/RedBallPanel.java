package exam01;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class RedBallPanel extends JPanel implements Runnable {

	int x = 0, y = 400;
	int width = 500;
	int height = 500;

	int stepX = 10;
	int stepY = -10;

	public RedBallPanel() {

		(new Thread(this)).start();

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		g.setColor(Color.RED);
		g.fillOval(x, y, 50, 50);
		repaint();
	}

	@Override
	public void run() {

		while (true) {

			width = (int) getSize().getWidth();
			height = (int) getSize().getHeight();

			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}

			x = x + stepX;
			y = y + stepY;
			repaint();

			if (x + 70 > width || x < 0) {
				stepX = stepX * -1;
			}
			if (y + 70 > height || y < 0) {

				stepY = stepY * -1;
			}

		}

	}

}
