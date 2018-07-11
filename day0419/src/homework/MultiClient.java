package homework;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//클라이언트를 위한 클래스
//이벤트 처리를 자기 자신이 하도록 설정
public class MultiClient implements ActionListener {

	// 서버와 데이터를 주고 받기 위한 socket을 선언
	private Socket socket;
	// 서버가 준 메세지를 받기위한 stream
	private ObjectInputStream ois;
	// 서버에게 데이터를 내보내기 위한 stream
	private ObjectOutputStream oos;
	// 창을 위한 만들기 위한 Frame을 선언
	private JFrame jframe;
	// 나의 메세지를 입력하기 위한 TexrField
	private JTextField jtf;
	private JTextArea jta;
	private JLabel jlb1, jlb2;
	private JPanel jp1, jp2;

	// 통신하고자 하는 서버의 ip를 저장할 변수
	private String ip;
	// 대화자의 아이디를 저장하기 위한 변수
	private String id;
	private JButton jbtn;

	// 생성시에 통신하고자 하는 서버의 ip주소와 대화자의 id를 전달 받는다
	public MultiClient(String argIp, String argId) {

		// 전달받은 ip를 맴버변수에 저장한다
		ip = argIp;
		// 전달받은 id를 맴버변수에 저장한다
		id = argId;
		// 프레임을 생성한다
		jframe = new JFrame("Multi Chatting");
		// 대화를 입력하기 위한 텍스트필드를 생성한다
		jtf = new JTextField(30);
		// 모든 대화내용을 출력하기 위한 텍스트에리어를 생성한다.
		jta = new JTextArea("", 10, 50);
		// 접속한 대화자의 이름을 출력하기 위한 라벨을 생성한다.
		jlb1 = new JLabel("Usage ID : [[" + id + "]]");
		// 통신을 원하는 서버의 ip주소를 출력하기 위한 라벨을 생성한다.
		jlb2 = new JLabel("IP : " + ip);
		jbtn = new JButton("종료");
		jp1 = new JPanel();
		jp2 = new JPanel();
		jlb1.setBackground(Color.yellow);
		jlb2.setBackground(Color.green);
		jta.setBackground(Color.pink);
		jp1.setLayout(new BorderLayout());
		jp2.setLayout(new BorderLayout());

		jp1.add(jbtn, BorderLayout.EAST);
		jp1.add(jtf, BorderLayout.CENTER);
		jp2.add(jlb1, BorderLayout.CENTER);
		jp2.add(jlb2, BorderLayout.EAST);

		jframe.add(jp1, BorderLayout.SOUTH);
		jframe.add(jp2, BorderLayout.NORTH);

		JScrollPane jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jframe.add(jsp, BorderLayout.CENTER);

		// 텍스트필드는 사용자가 메세지를 입력하는 용도
		// 리턴키를 눌렀을때의 이벤트 등록
		jtf.addActionListener(this);
		// "종료"버튼에 이벤트 설정
		jbtn.addActionListener(this);

		// 프레임에 창이 열리고 닫히는 이벤트를 등록한다.
		jframe.addWindowListener(new WindowListener() {

			// 프레임이 열릴때 텍스트필드에 자동으로 포커스를 설정한다.
			@Override
			public void windowOpened(WindowEvent e) {

				jtf.requestFocus();
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			// 창이 닫힐 때
			// 서버한테 id#exit을 보내도록 한다.
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					oos.writeObject(id + "#exit");
				} catch (IOException ee) {

					ee.printStackTrace();
				}
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		// 텍스트에리어는 모든 대화내용을 보여주기 용도로 사용함으로
		// 수정할 수 없도록(글씨를 쓸수 없도록) 설정.
		jta.setEditable(false);
		// 프레임의 크기를 읽어 옴
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();

		int screenHeight = d.height;
		int screenWidth = d.width;
		// 프레임의 크기를 컴포넌트를
		// 보여 줄 수 있도록 크기를 설정.
		jframe.pack();
		// 프레임의 위치를 화면의
		// 컴퓨터 화면의 가운데 표시
		jframe.setLocation((screenWidth - jframe.getWidth()) / 2, (screenHeight - jframe.getHeight()) / 2);
		// 프레임의 크기를 변경할 수 없도록 설정
		jframe.setResizable(false);
		// 프레임을 보여주도록 설정
		jframe.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트가 발생 주체(source)가 누구냐?
		// obj가 jtf이거나 jbtn일 수 있다.
		Object obj = e.getSource();
		// 텍스트필드에 입력한 내용을 msg에 저장한다.
		String msg = jtf.getText();
		// 이벤트의 주체가 jtf에서 엔터키 쳤냐?
		// 입력한 메세지를 서버에게 보내는 작업
		if (obj == jtf) {

			// 텍스트필드에 엔터는 쳤는데 아무글자도 입력하지 않았냐?
			if (msg == null || msg.length() == 0) {
				// 글을 입력하도록 안내한다.
				JOptionPane.showMessageDialog(jframe, "글을쓰세요", "경고", JOptionPane.WARNING_MESSAGE);
			} else {
				// 텍스트 필드에 글을 입력하고 엔터를 쳤다면
				// 그 내영을 서버한테 보내야 한다.
				try {
					// 서버한테 데이터를 보내기 위한 stream인
					// oos를 통해서
					// 지금 접속한 id#메세지 형태로 데이터를 보낸다.
					oos.writeObject(id + "#" + msg);
				} catch (Exception ee) {
					ee.printStackTrace();
				}
				// 다음 대화를 위하여 텍스트필드의 내용을 지운다.
				jtf.setText("");
			}
		}
		// 이벤트 발생한 주체가 버튼(종료)이라면
		else if (obj == jbtn) {

			try {
				// 서버한테 접속한 id#exit을 전속한다.
				oos.writeObject(id + "#exit");

			} catch (IOException ee) {
				ee.printStackTrace();
			}

			System.exit(0);
		}

	}

	public void exit() {

		System.exit(0);
	}

	// 클라이언트가 생성되고 클라이언트의 정보들을
	// 초기화 하기 위한 내용을 담고 있는 init메소드를 정의 한다.
	public void init() throws IOException {

		// 서버에게 "통신하고 싶어요"라고 요청하기 위한
		// socket객체를 생성한다.
		// 생성시에 통신을 원하는 서버의 ip주소와 약손한 port번호를 갖고 생성한다.
		// 이때 서버에서는 이 요청을 수락하는 accept메소드가 동작한다.
		// accept를 수행하고 이 클라이언트를 상대하는 socket을 생성한다.
		socket = new Socket(ip, 5000);
		// 연결되었음을 출력한다.
		System.out.println("connected...");
		// 서버에게 데이터를 내보내기 위한 stream을 생성한다.
		oos = new ObjectOutputStream(socket.getOutputStream());
		// 서버로부터 데이터를 받기위한 stream을 생성한다.
		ois = new ObjectInputStream(socket.getInputStream());

		// 다른 클라이언트의 대화내용을 서버가 나한테 끊임없이 보내주는
		// 데이터를 받기 위하여 스레드한테 맡긴다.
		// 내가 하고 싶은 말과 서버가 보내주는 데이터를 받는 작업이
		// 동시에 일어나야 한다. 내가 주는 메세지는 텍스트 필드에 내용을 입력하고
		// 엔터를 치면 보내도록 되어있고
		// 서버가 주는 데이터는 언제 받을거냐?
		// 내가 무슨 이벤트(버튼을 누르거나 하는 것이 아니고) 계속 받아야 한다.
		// ==> Thread로 표현한다.

		// 서버로 부터 오는 데이터를 받기 위한 MultiClientThread객체를 생성한다.
		// 내가 하고 싶은 말은 텍스트 필드에 입력하고 엔터치면 보내고
		// 다른사람이 하는 말은 MultiClientThread가 계속 받아온다

		// MultiClientThread 객체 생성시에 나 (MultiClient)를
		// 매개변수로 전달한다.
		MultiClientThread ct = new MultiClientThread(this);
		// 계속하여 내용을 받아 오도록 Thread를 가동한다.
		Thread t = new Thread(ct);
		t.start();
	}

	public static void main(String args[]) throws IOException {

		JFrame.setDefaultLookAndFeelDecorated(true);
		Scanner sc = new Scanner(System.in);
		System.out.print("ip : ");
		String ip = sc.next();
		System.out.print("id : ");
		String id = sc.next();

		MultiClient cc = new MultiClient(ip, id);

		cc.init();
		sc.close();
	}

	public ObjectInputStream getOis() {
		return ois;
	}

	public JTextArea getJta() {
		return jta;
	}

	public String getId() {

		return id;
	}

}
