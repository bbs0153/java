package exam02;

import java.util.Calendar;
import java.util.GregorianCalendar;

//GregorianCalendar is a Calendar
//GregorianCalendar는 Calendar의 자식클래이기 때문에
//Calendar의 메소드들을 모두 사용할 수 있다.
//다른점은
//Calendar는 추상클래스이기 때문에 new 연산자에 의해
//직접 객체 생성할 수 없고 getInstance()메소드를 통해
//Calaendar 객체를 얻어 올 수 있다.
//GregorianCalendar는 new 연산자를 통해 직접 객체를  생성
//할 수 있다.
//또 GregorianCalendar는 윤년에 대한 정보를 처리하는 기능
//isLeapYear()가 추가됨 
public class Test01 {
	// Calendar를 이용하여 오늘날짜를 출력
	public static void main(String []args) {
	
			Calendar today = Calendar.getInstance();
			//시스템 설정된 오늘날짜와 시간의 정보를
			//Calendar type으로 반환한다.
			
			//Calendar는 new 연산자에 의해 직접 객체생성 x
			//Calendar클래스의 static 메소드인
			//getInstance()메소드를 통해 객체를 얻어옴.
			
			int year = today.get(Calendar.YEAR);
			System.out.println(year);
			
			
		
	}
}
