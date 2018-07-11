package exam10;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GraphicPanel extends JPanel implements KeyListener, Runnable {

	Image image01;
	Image image02;
	Image image03;
	Image image04;
	int x = 0, y = 400;

	int step = 10;

	int n = 1;

	public GraphicPanel() {
		setFocusable(true);
		image01 = Toolkit.getDefaultToolkit().getImage("man01.png");
		image02 = Toolkit.getDefaultToolkit().getImage("man02.png");
		image03 = Toolkit.getDefaultToolkit().getImage("man03.png");
		image04 = Toolkit.getDefaultToolkit().getImage("man04.png");
		addKeyListener(this);

		(new Thread(this)).start();

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		switch (n) {

		case 1:
			g.drawImage(image01, x, y, null);
			break;
		case 2:
			g.drawImage(image02, x, y, null);
			break;
		case 3:
			g.drawImage(image03, x, y, null);
			break;
		case 4:
			g.drawImage(image04, x, y, null);
			break;

		}
		repaint();

	}

	@Override
	public void keyPressed(KeyEvent e) {

		int code = e.getKeyCode();

		System.out.println(code);

		// ÁÂ 37
		// À§ 38
		// ¿ì 39
		// ¾Æ·¡ 40

		switch (code) {

		case 37:
			x = x - step;
			break;
		case 38:
			y = y - step;
			break;
		case 39:
			x = x + step;
			break;
		case 40:
			y = y + step;
			break;

		}
		repaint();

		n++;

		if (n >= 5) {

			n = 1;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {

		while (true) {

			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			x = x + step;
			repaint();
		}

	}

}
