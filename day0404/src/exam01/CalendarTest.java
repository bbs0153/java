package exam01;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calendar today = new Calendar();
		//Calendars�� �߻�Ŭ�����̱� ������
		//����ڰ� ���� ��ü�� ���� �� �� ����.
		Calendar today = Calendar.getInstance();
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DATE);
		
		System.out.println(year+"��");
		System.out.println(month+"��");
		System.out.println(day+"��");
		System.out.println(today.get(Calendar.HOUR)+"��");
		System.out.println(today.get(Calendar.MINUTE)+"��");
		System.out.println(today.get(Calendar.SECOND)+"��");
	}

}
