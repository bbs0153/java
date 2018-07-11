package exam01;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseEventTest extends JFrame implements MouseListener {

	public MouseEventTest() {

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 이벤트를 발생시키려면 대상자에 이벤트를 등록해줘야 한다.
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		System.out.println("마우스 클릭됨");
	}

	@Override
	public void mouseEntered(MouseEvent e) {

		System.out.println("마우스 들어옴");
	}

	@Override
	public void mouseExited(MouseEvent e) {

		System.out.println("마우스 나감");
	}

	@Override
	public void mousePressed(MouseEvent e) {

		System.out.println("마우스 눌러짐");
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		System.out.println("마우스 떼어짐");
	}

	public static void main(String[] args) {

		new MouseEventTest();
	}

}
