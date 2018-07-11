package homework;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

//요청한 클라이언트와 1:1 통신을 위한 클래스
public class MultiServerThread implements Runnable {
	// 데이터를 주고 받기 위한 데이터 socket을 맴버변수로 가짐.
	private Socket socket;
	// 이 클래스는 MultiServer에 의해서 생성되고
	// 그 떄 매개변수로 MultiServer를 전달 받는다.
	// 그것을 담기 위한 변수
	private MultiServer ms;

	// 클라이언트가 서버로 데이터를 내 보내기도 하고 읽어들이기도 해야 할 것이다.

	// 서버가 보내온 데이터를 읽기 위한 stream
	private ObjectInputStream ois;
	// 내가 하고 싶은 말을 서버로 보내기 위한 stream
	private ObjectOutputStream oos;

	// MultiServerThread의 생성자
	// MultiServer에 의해서 생성되고
	// 생성시에 전달해온 MultiServer 변수를 ms에 담는다.
	public MultiServerThread(MultiServer ms) {

		this.ms = ms;

	}

	// MultiSever에서 Thread를 가동시키기 위한
	// start를 호출하면
	// run에 동작함
	// 지금 접속한 클라이언트와 1:1 상대하여 대화하는 내용을 기술한다.
	// 클라이언으로 부터 온 메세지를 다른 모든클라이언트에게 방송한다.
	@Override
	public synchronized void run() {
		// 지금 상대하고 있는 클라이언트와 통신을 중단하기 위한 상태변수를 선언
		// 처음값 false를 저장
		// 종료를 원하는 시점에서 isStop true를 저장하여 종료하도록 한다.
		boolean isStop = false;

		try {
			// 요청한 클라이언트의 정보가 담겨 있는 ms 객체로 통신
			// 데이터를 주고 받기 위한 socket을 얻어 온다.
			socket = ms.getSocket();
			// socket으로 부터 데이터를 읽기 위한 stream을 생성한다.
			ois = new ObjectInputStream(socket.getInputStream());
			// socket으로 부터 데이터를 내 보내기 위한 stream을 생성한다.
			oos = new ObjectOutputStream(socket.getOutputStream());
			// 클라이언트로 부터 온 메세지를 저장할 별수
			String message = null;
			// isStop == false
			// !false 계속 참인 상황 ==>
			// 통신을 중단하기 위해서는 어디선가 isStop에 true를
			// 저장하여 종료한다.
			while (!isStop) {
				// 지금 내가 상대 하고 있는 클라이언트가 준 메세지를
				// message에 저장한다.
				message = (String) ois.readObject();
				// 클라이언트로 부터 오는 메세지는 사용자이름#하고싶은 말
				// 이현진#hello?
				// 사용자 이름과 메세지를 분리한다.
				// str[0]: 이현진
				// str[1]: hello?
				String[] str = message.split("#");
				// 만약 이 클라이언트가 준 메세지의 내용이 "exit"이면
				// endsWith는 String클래스의 메소드이면
				// 그 문자열이 특정 패턴으로 킅나느냐? 판별하는 메소드
				if (str[1].endsWith("exit")) {
					// 이 클라이언트가 준 메세지를
					// 모든 다른클라이언트들 한테 방송한다.
					broadCasting(message);
					// 이 클라이언트는 대화를 종료하기 위하여
					// isStop에 true를 저장
					isStop = true;

				} else {
					// 대화의 내용이 "exit"이 아니라면
					// 다른 모든 클라이언트들한테 그 메세지를 방송한다.
					broadCasting(message);
				}

			}
			// 위의 while를 탈출 했다는 이야기는
			// list로 부터 이 클라이언트를 제거한다.
			ms.getList().remove(this);
			// 종료한 상황을 출력한다
			System.out.println(socket.getInetAddress() + "정상적으로 종료하셨습니다.");
			System.out.println("list size : " + ms.getList().size());

		} catch (Exception e) {
			ms.getList().remove(this);
			System.out.println(socket.getInetAddress() + "비정상적으로 종료하셨습니다.");
			System.out.println("list size : " + ms.getList().size());
		}
	}

	// 특정 클라이언트가 준 메세지를 다른 모든 클라이언트들 한테 방송한다.
	private void broadCasting(String message) throws IOException {

		// 매개 변수로 전달받은 메세지의 내용을
		// 모든 클라이언트의 정보가 담긴 list로 부터 하나씩 꺼내와
		// 각각의 클라이언트들 한테 메세지를 전송한다.
		for (MultiServerThread ct : ms.getList()) {

			ct.send(message);
		}
	}

	private void send(String message) throws IOException {

		// 메세지를 매개변수로 전달 받아
		// 출력 stream을 통해 메세지를 내 보낸다.
		oos.writeObject(message);

	}

}
