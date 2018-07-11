package exam08;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import exam06.LineInfo;

// �׷��� ���� ���� (x1,y1,x2,y2)�� ������� �����Ƿ�
// â�� ũ�⸦ �����Ҷ� �������.
// �̰��� �����ؾ� �ڴ�
// �����Ϸ��� ����ڰ� ��� ���� �׸��� �𸣴�
// ArrayList�� ����ϸ� ���� ���̴�.
// �׷��� ArrayList�� ���� ������Ÿ���� ������ ������?
// �ϳ��� �׷���(��)�� ǥ���ϱ� ���ؼ��� x1,y1,x2,y2�� �ʿ��ϴ�
// �׷��� �̰��� ���� ����� ���� �ڷ������� ������!!!!!!

public class GraphicPanel extends JPanel implements MouseListener {

	int x1;
	int y1;
	int x2;
	int y2;

	int drawType = 0;
	Color drawColor = Color.BLACK;
	// �� 0
	// �� 1
	// �簢�� 2

	ArrayList<GraphicInfo> list;

	// �츮�� ���� LinePanel�� ���콺 �̺�Ʈ�� ����ؾ� �Ѵ�
	// �����ڿ���
	public GraphicPanel() {
		// ���� list�� �����Ͱ� ��⳪��?
		// �ϳ��� ���� �ϼ��� �ɶ�
		// ���콺�� ���� ������ ���� �������
		list = new ArrayList<GraphicInfo>();
		addMouseListener(this);
	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		// g.drawLine(x1, y1, x2, y2);

		// list�� ��� ���� ���� ��ŭ ���� �ٽ� �׷��ش�.
		for (GraphicInfo info : list) {

			g.setColor(info.getDrawColor());

			int width = info.getX2() - info.getX1();
			int height = info.getY2() - info.getY1();

			switch (info.getDrawType()) {

			case 0:
				g.drawLine(info.getX1(), info.getY1(), info.getX2(), info.getY2());
				break;
			case 1:
				g.drawOval(info.getX1(), info.getY1(), width, height);
				break;
			case 2:
				g.drawRect(info.getX1(), info.getY1(), width, height);
				break;

			}

		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

		// ���콺�� ������ ��ǥ�� �׷����� ������ x,y�� ����
		x1 = e.getX();
		y1 = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		// ���콺 ����� ��ǥ�� �׷����� �������� ����
		x2 = e.getX();
		y2 = e.getY();

		// �ϳ��� �׷���(��)�� �ϼ��ɶ� ��, ���콺 ���� ��� ����
		// ���� ���� (x1,y1,x2,y2)�� ������ LineInfo�� �����Ͽ�
		// list�� ��´�
		list.add(new GraphicInfo(x1, y1, x2, y2, drawType, drawColor));

		// �׷����� �ٽ� �׷��� ���� ��û
		repaint();
		// ���������� paintcompornt�� ������

	}

}
