package exam05;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class LinePanel extends JPanel implements MouseListener {

	int x1;
	int y1;
	int x2;
	int y2;

	// 생성자에서 마우스 이벤트를 등록한다.
	public LinePanel() {

		addMouseListener(this);

	}

	@Override
	protected void paintComponent(Graphics g) {

		g.drawLine(x1, y1, x2, y2);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {

		x1 = e.getX();
		y1 = e.getY();

	}

	@Override
	public void mouseReleased(MouseEvent e) {

		x2 = e.getX();
		y2 = e.getY();

		repaint(); // 다시 그려주세요
	}

}
