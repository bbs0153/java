package homework;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiServer {
	// 접속을 요청한 클라이언트를 담기 위한 list 를 선언
	// list에 담는 자료형 MultiServerThread는 한명의 클라이언트를
	// 상대하기 위한 Thread
	private ArrayList<MultiServerThread> list;

	// 클라이언트가 접속을 요청하면 그 요청을 수락하여
	// 클라이언트와 데이터를 주고 받기 위한 데이터 socket을 선언
	private Socket socket;

	public MultiServer() throws IOException {

		// list를 생성
		list = new ArrayList<MultiServerThread>();
		// TCP방식의 통신을 위하여 포트번호 5000번으로 서버소켓을 생성
		ServerSocket serverSocket = new ServerSocket(5000);
		// 클라이언트가 접속을 요청하면
		// 그 클라이언트를 1:1로 상대하기 위한 Thread 선언
		MultiServerThread mst = null;
		// 서버가 계속 동작할 것인지 상태를 위한 변수
		// 초기값을 false를 저장
		boolean isStop = false;

		// !false == > true ==> 계속 동작
		// 종료를 원하는 시점에 어디에선가 isStop에 true를 저장하면 서버가 종료
		while (!isStop) {

			// 서바가 가동되었음을 나타내기 위하여 출력
			System.out.println("Server ready....");
			// 클라이언트가 접속을 요청하는 순간 요청을 수락하는
			// accept메소드가 동작되고 이 클라이언트가 데이터를 주고 받기 위한 데이터 소켓을 받음
			// 클라이언트가 요청할 때 마다 별도의 socket이 생성됨
			socket = serverSocket.accept();

			// 서버는 동시에 여려명을 상대해야 하기 떄문에
			// 각각의 클라이언트와 통신하기 위해서는
			// 각각의 클라이언트와 1:1 통신하는 것은
			// MultiServerThread한테 맡긴다.

			// 지금 요청한 클라이언트를 상대하기 위하여
			// 나 자신(MultiServer ==> Socket,list)을 매개변수로 하는
			// MultiServerThread 객체를 생성하여 그에게 맡긴다.
			mst = new MultiServerThread(this);
			// 요청한 클라이언트가 예를 들어 3명이라고 가정하자
			// 이현진,송명준,이태호
			// 만약 이현진이 hello? 라고 하면
			// 지금 접속한 모든 클라이언트들 한테 이현진이 말한 "hello?"를 방송해아 한다.
			// 그러면 지금 요청한 클라이언트들을 모두 관리하고 있어야 할 것이다.
			// 요청한 순간 클라이언트를 상대하는 객체 MultiServerThread 객체 변수인
			// mst를 list에 담는다.
			list.add(mst);
			// Thread를 가동한다.
			// MultiSeverThread의 run메소드에서
			// 클라이언트와 계속하여 통신하는 코드를 거기에 기술한다.
			// 거기==> MultiServerThread의 run
			// 클라이언트가 주는 메세지를
			// 모든 다른 클라이언트(나를 포함)에게 그 메세지를 방송하는 코드가 와야 한다.
			Thread t = new Thread(mst);
			t.start();

		}

	}

	public ArrayList<MultiServerThread> getList() {

		return list;
	}

	public Socket getSocket() {

		return socket;
	}

	public static void main(String arg[]) throws IOException {

		new MultiServer();
	}

}
