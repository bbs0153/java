package exam07;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

// �׷��� ���� ���� (x1,y1,x2,y2)�� ������� �����Ƿ�
// â�� ũ�⸦ �����Ҷ� �������.
// �̰��� �����ؾ� �ڴ�
// �����Ϸ��� ����ڰ� ��� ���� �׸��� �𸣴�
// ArrayList�� ����ϸ� ���� ���̴�.
// �׷��� ArrayList�� ���� ������Ÿ���� ������ ������?
// �ϳ��� �׷���(��)�� ǥ���ϱ� ���ؼ��� x1,y1,x2,y2�� �ʿ��ϴ�
// �׷��� �̰��� ���� ����� ���� �ڷ������� ������!!!!!!

public class LinePanel extends JPanel implements MouseListener {

	int x1;
	int y1;
	int x2;
	int y2;

	ArrayList<LineInfo> list;

	// �츮�� ���� LinePanel�� ���콺 �̺�Ʈ�� ����ؾ� �Ѵ�
	// �����ڿ���
	public LinePanel() {
		// ���� list�� �����Ͱ� ��⳪��?
		// �ϳ��� ���� �ϼ��� �ɶ�
		// ���콺�� ���� ������ ���� �������
		list = new ArrayList<LineInfo>();
		addMouseListener(this);
	}

	@Override
	protected void paintComponent(Graphics g) {

		// g.drawLine(x1, y1, x2, y2);

		// list�� ��� ���� ���� ��ŭ ���� �ٽ� �׷��ش�.
		for (LineInfo info : list) {

			g.drawLine(info.getX1(), info.getY1(), info.getX2(), info.getY2());
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
		list.add(new LineInfo(x1,y1,x2,y2));

		// �׷����� �ٽ� �׷��� ���� ��û
		repaint();
		// ���������� paintcompornt�� ������

	}

}
