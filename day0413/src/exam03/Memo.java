package exam03;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Memo extends JFrame {

	JFrame f; // 저장하시겠습니까?, 저장하거나, 열기할 때 파일을 선택하기 위한 다디얼로그를
				// 띄울떄는 Frame을 매개변수로 요구하는데 현재 자신을 참조할 변수
	JTextArea text; // 글을 작성할 텍스트에리어
	JScrollPane jsp;
	File file; // 만약에 저장을 하였다면 저장한 파일의 정보를 담기 위한 변수
	JFileChooser jfc; // 파일을 열거나 저장할 때 파일을 선택할 수 있도록 하는 다이얼로그

	boolean isChanged = false; // 저장 한 후 변동내용이 있는지 상태유지를 위한 변수

	public Memo() {

		text = new JTextArea(10, 10); // 글을 작성하기 위한 텍스트에어리를 생성
		text.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {

				isChanged = true;
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		setLayout(new BorderLayout()); // 프레임의 레이아앗을 동,서,남,북 가운데로 배치하

		jfc = new JFileChooser("c:/temp"); // 파일선택을 위한 다이얼로그를 생성
		f = this; // 자신을 JFrame맴버변수 f에 저장
		JMenuBar bar = new JMenuBar(); // 메뉴바 생성
		JMenu jm = new JMenu("파일"); // 주메뉴 생성
		JMenuItem item1 = new JMenuItem("새로만들기"); // 부메뉴 생성
		JMenuItem item2 = new JMenuItem("열기");
		JMenuItem item3 = new JMenuItem("저장");
		JMenuItem item4 = new JMenuItem("다른이름으로 저장");
		JMenuItem item5 = new JMenuItem("종료");

		jsp = new JScrollPane(text); // 텍스트에리어에 내용이 많을 떄 안보이는 것들은 보여주도록

		// 새파일 메뉴에 대한 이벤트 처리
		item1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// 만약에 텍스트에리어의 좌,우의 공백을 제거하고 글자길이가 0보다 크다면
				if (text.getText().trim().length() > 0) {

					// 변경된 내용을 저장 할 것인지 물어보고 만약에 showConfirmDialog 는 사용자가 "예"를 누를수도 있고
					// "아니요"를 누를수도 있고 "취소"를 누르수도 있다 사용자가 무엇을 눌렀는지 정수를 반환한다.
					// 그 정수를 int re에 담겠다.
					int re = -1;
					// "저장하시겠습니까?"라는 다이얼로그는 변경된 내용이 있을때
					// isChanged true일 때

					if (isChanged == true) {
						re = JOptionPane.showConfirmDialog(f, "변경된 내용을 저장하시겠습니까?");
						// 예=0, 아니요=1 , 취소=2
					}
					// 사용자가 "예","아니요","취소"
					switch (re) {

					case 0: // 예
						saveFile(); // 저장하고
						text.setText(""); // 텍스트에리어의 내용을 지워준다.
						break;
					case 1: // 아니요
						text.setText("");
						break;
					case -1:
						text.setText("");

					case 2: // 취소
						break;

					}
				}

			}
		});
		// "열기"에 대한 처리
		item2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// 열어올 파일을 선택하도록 다이얼로그를 띄운다.
				// "열기"를 취소 할 수도 있고, "열기" 단추를 누를수도 있다.
				// showOpenDialog 메소드가 "열기" 누르면 0 취소를 누르면 1
				int re = jfc.showOpenDialog(f);

				if (re == 0) { // 열기를 눌렀는가?

					try {
						// 사용자가 열기를 선택한 파일의 정보는
						// JFileChooser 객체인 jfc가 담고있다.
						// jfc.getSelectedFile() 메소드를 통해 사용자가 열기를 선택한 파일을 갖고 온다.
						// 파일의 내용을 메모리로 읽어 들이기 위하여
						// FileReader를 이용한다
						FileReader fr = new FileReader(jfc.getSelectedFile());

						int ch; // 파일의 내용을 한글자씩 읽어 들이기 위한 변수를 선언
								// read()메소드는 그 글자의 코드를 반환하므로
								// 정수로 변수를 만든다.
						String str = ""; // 파일의 글자를 한글자씩 읽어와서 문자열에 누적하려고 한다.

						// 파일로부터 한글자씩 읽어와 ch에 담는다
						// 파일의 끝에 도달하면 -1을 반환한다.
						// 파일의 끄타지 한글자씩 읽어온다.
						while ((ch = fr.read()) != -1) {
							str += (char) ch; // 읽어온 글자의 코드값을 char로 변환하면
												// 글자를 얻을 수 있고
												// str에 누적한다.

						}
						text.setText(str); // 파일로 부터 읽어와 누적된 문자열을 텍스트에리어에 담는다.
						fr.close(); // 파일의 사용이 끝났으므로 파일을 닫는다.
					} catch (Exception ex) {
						System.out.println(e.getActionCommand());
					}
				}
			}
		});
		item3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				saveFile();
			}

		});
		item4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		jm.add(item1);
		jm.add(item2);
		jm.add(item3);
		jm.add(item4);
		jm.add(item5);
		bar.add(jm);

		add(bar, BorderLayout.NORTH);
		add(jsp);

		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	protected void saveFile() {
		// "저장"버튼을 누르면 텍스트에리어의 모든 내용을
		// C:/temp/bit.txt로 저장하려고 한다.

		// 사용자가 저장할 파일명을 입력하는 다이얼로그를 띄우자
		int re = -1;
		if (file == null) {
			re = jfc.showSaveDialog(f);
			file = jfc.getSelectedFile();
		} else {

			re = 0;
		}

		if (re == 0) {

			try {

				FileWriter fw = new FileWriter(file);

				fw.write(text.getText());
				fw.close();

				// 저장을 했으니 변동된 내용이 없다는 표시로 isChanged에 false를 심는다.
				isChanged = false;

			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}

	}

	public static void main(String[] args) {

		new Memo();
	}

}
