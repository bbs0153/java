package exam06;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class LinePanel extends JPanel implements MouseListener {

	int x1;
	int y1;
	int x2;
	int y2;

	ArrayList<LineInfo> list;

	// 생성자에서 마우스 이벤트를 등록한다. 
	public LinePanel() {

		list = new ArrayList<LineInfo>();
		addMouseListener(this);

	}

	@Override
	protected void paintComponent(Graphics g) {

		// g.drawLine(x1, y1, x2, y2);

		// list에 담긴 것 만큼 그래픽을 그려준다.
		for (LineInfo info : list) {

			g.drawLine(info.getX1(), info.getY1(), info.getX2(), info.getY2());

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

		list.add(new LineInfo(x1, x2, y1, y2));
		repaint(); // 다시 그려주세요
	}

}
