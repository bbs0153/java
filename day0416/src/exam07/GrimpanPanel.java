package exam07;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GrimpanPanel extends JPanel implements MouseListener, MouseMotionListener {

	int x1;
	int y1;
	int x2;
	int y2;
	int drawType;

	Color drawColor;

	ArrayList<GraphicInfo> list;

	boolean isDrag;

	public GrimpanPanel() {

		list = new ArrayList<GraphicInfo>();

		addMouseListener(this);
		addMouseMotionListener(this);

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (GraphicInfo info : list) {

			int width = info.getX2() - info.getX1();
			int height = info.getY2() - info.getY1();
			int x = info.getX1();
			int y = info.getY1();

			if (info.getX1() > info.getX2()) {
				width = info.getX1() - info.getX2();
				x = info.getX2();
			}
			if (info.getY1() > info.getY2()) {
				height = info.getY1() - info.getY2();
				y = info.getY2();
			}

			g.setColor(info.getDrawColor());
			switch (info.getDrawType()) {
			case 0:
				g.drawLine(info.getX1(), info.getY1(), info.getX2(), info.getY2());
				break;
			case 1:
				g.drawOval(x, y, width, height);
				break;
			case 2:
				g.drawRect(x, y, width, height);
				break;

			}

		}

		int width = x2 - x1;
		int height = y2 - y1;
		int x = x1;
		int y = y1;

		if (x1 > x2) {
			width = x1 - x2;
			x = x2;
		}
		if (y1 > y2) {
			height = y1 - y2;
			y = y2;
		}

		g.setColor(drawColor);

		if (isDrag) {
			switch (drawType) { // 마우스 드래그 일떄만 만도록하고 마우스 mouseRelease일떄는 만나지 않도록 합니다.

			case 0:

				g.drawLine(x1, y1, x2, y2);
				break;

			case 1:
				g.drawOval(x, y, width, height);
				break;

			case 2:
				g.drawRect(x, y, width, height);
				break;

			}
		}
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

		list.add(new GraphicInfo(x1, y1, x2, y2, drawType, drawColor));
		isDrag = false;
		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {

		x2 = e.getX();
		y2 = e.getY();
		isDrag = true;
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
