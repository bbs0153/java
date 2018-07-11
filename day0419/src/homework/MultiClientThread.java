package homework;

//나, 말고 다른 클라이언트들이 한 말을 
//서버가 나한테 보내주는 메세지를 계속하여 받는 역할을 하는 클래스
public class MultiClientThread extends Thread {
	// 내가 누군지에 대한 정보를 갖고 있는 MultiClient를 맴버로 갖는다.
	private MultiClient mc;

	// 생성시에 전달된 MultiClient를 맴버에 저장한다.
	public MultiClientThread(MultiClient mc) {

		this.mc = mc;
	}

	// 계속하여 서버가 준 메세지를 받기위한 코드를 기술한다.
	public void run() {
		// 전송된 메세지를 저장하기 위한 변수
		String message = null;
		// 전송된 메세지는 아이디#내용 과 같이 오는데
		// 이것을 #으로 분리하여 담기 위한 배열
		String[] receivedMsg = null;
		// 대화를 계속할 것인지 상태를 저장하기 위한 변수
		// 초기값 false를 저장
		// isStop에 true가 입력되면 종료
		// 메세지가 exit이 오면 true를 저장
		boolean isStop = false;

		// 처음값 isStop이 false
		// !false
		while (!isStop) {

			try {
				// 서버가준 메세지를 저장
				message = (String) mc.getOis().readObject();
				// 그 메세지를 #으로 분리하여 receivedMsg에 저장
				// receivedMsg[0] : tiger
				// receivedMsg[1]: 오늘은 불금
				receivedMsg = message.split("#");

			} catch (Exception e) {
				e.printStackTrace();
				// 혹시 예외가 발생되면 isStop에 true를 저장하여 통신을 종료하도록 한다.
				isStop = true;
			}
			// 서버로 부터 온 메세지를 출력한다.
			System.out.println(receivedMsg[0] + "," + receivedMsg[1]);

			// 서버로 부터 온 메세지가 exit인지 판별
			if (receivedMsg[1].equals("exit")) {
				// exit메세지를 입력한 id가 바로 "나" 인지 판별
				if (receivedMsg[0].equals(mc.getId())) {
					// 나를 종료하도록 한다.
					mc.exit();
				} else {
					// 종료하는 사람이 내가 아니면
					// 누구누구님이 종료합니다. 메세지를 출력
					mc.getJta().append(receivedMsg[0] + "님이 종료 하셨습니다" + System.getProperty("line.separator"));
					// 현재 진행중인 곳으로 텍스트에리어에 스크롤를 내려주는 역할
					mc.getJta().setCaretPosition(mc.getJta().getDocument().getLength());
				}
			} else {
				// 대화 내용이 "exit"이 아닌 일반 대화내용 일때
				// 누가 무슨 말을 했는지 텍스트에리어에 추가한다.
				// System.getProperty("line.separator")줄 바꿈 문자를 추가한다.
				mc.getJta().append(receivedMsg[0] + ": " + receivedMsg[1] + System.getProperty("line.separator"));
				// 텍스트에리어에 위치를 현재 입력한 위치로 변경한다.
				mc.getJta().setCaretPosition(mc.getJta().getDocument().getLength());

			}

		}

	}

}
