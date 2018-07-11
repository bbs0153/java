package exam02;

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

	ArrayList<GraphicInfo> list;

	public GrimpanPanel() {

		list = new ArrayList<GraphicInfo>();

		addMouseListener(this);
		addMouseMotionListener(this);

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (GraphicInfo info : list) {

			g.drawLine(info.getX1(), info.getY1(), info.getX2(), info.getY2());
		}

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

		list.add(new GraphicInfo(x1, y1, x2, y2));

		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {

		x2 = e.getX();
		y2 = e.getY();

		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
