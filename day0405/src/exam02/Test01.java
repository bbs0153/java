package exam02;

import java.util.Calendar;
import java.util.GregorianCalendar;

//GregorianCalendar is a Calendar
//GregorianCalendar�� Calendar�� �ڽ�Ŭ���̱� ������
//Calendar�� �޼ҵ���� ��� ����� �� �ִ�.
//�ٸ�����
//Calendar�� �߻�Ŭ�����̱� ������ new �����ڿ� ����
//���� ��ü ������ �� ���� getInstance()�޼ҵ带 ����
//Calaendar ��ü�� ��� �� �� �ִ�.
//GregorianCalendar�� new �����ڸ� ���� ���� ��ü��  ����
//�� �� �ִ�.
//�� GregorianCalendar�� ���⿡ ���� ������ ó���ϴ� ���
//isLeapYear()�� �߰��� 
public class Test01 {
	// Calendar�� �̿��Ͽ� ���ó�¥�� ���
	public static void main(String []args) {
	
			Calendar today = Calendar.getInstance();
			//�ý��� ������ ���ó�¥�� �ð��� ������
			//Calendar type���� ��ȯ�Ѵ�.
			
			//Calendar�� new �����ڿ� ���� ���� ��ü���� x
			//CalendarŬ������ static �޼ҵ���
			//getInstance()�޼ҵ带 ���� ��ü�� ����.
			
			int year = today.get(Calendar.YEAR);
			System.out.println(year);
			
			
		
	}
}
