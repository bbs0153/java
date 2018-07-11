package exam08;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import exam06.LineInfo;

// 그려진 선의 정보 (x1,y1,x2,y2)가 저장되지 않으므로
// 창의 크기를 조절할때 사라진다.
// 이것을 저장해야 겠다
// 저장하려면 사용자가 몇개의 선을 그릴지 모르니
// ArrayList를 사용하면 좋을 것이다.
// 그러면 ArrayList에 담을 데이터타입은 무엇이 좋을까?
// 하나의 그래픽(선)을 표현하기 위해서는 x1,y1,x2,y2가 필요하다
// 그래서 이것을 묶어 사용자 정의 자료형으로 만들자!!!!!!

public class GraphicPanel extends JPanel implements MouseListener {

	int x1;
	int y1;
	int x2;
	int y2;

	int drawType = 0;
	Color drawColor = Color.BLACK;
	// 선 0
	// 원 1
	// 사각형 2

	ArrayList<GraphicInfo> list;

	// 우리가 만든 LinePanel에 마우스 이벤트를 등록해야 한다
	// 생성자에서
	public GraphicPanel() {
		// 언제 list에 데이터가 담기나요?
		// 하나의 선이 완성이 될때
		// 마우스를 눌러 움직여 손이 띄어질때
		list = new ArrayList<GraphicInfo>();
		addMouseListener(this);
	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		// g.drawLine(x1, y1, x2, y2);

		// list에 담긴 선의 정보 만큼 서늘 다시 그려준다.
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

		// 마우스가 눌러진 죄표를 그래픽의 시작점 x,y로 저장
		x1 = e.getX();
		y1 = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		// 마우스 띄어진 좌표를 그래픽의 끝점으로 저장
		x2 = e.getX();
		y2 = e.getY();

		// 하나의 그래픽(선)이 완성될때 즉, 마우스 손이 띄어 질때
		// 선의 정보 (x1,y1,x2,y2)를 가지고 LineInfo를 생성하여
		// list에 담는다
		list.add(new GraphicInfo(x1, y1, x2, y2, drawType, drawColor));

		// 그래픽을 다시 그려줄 것을 요청
		repaint();
		// 내부적으로 paintcompornt가 동작함

	}

}
