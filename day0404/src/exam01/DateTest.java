package exam01;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int year = date.getYear();
		int month = date.getMonth();
		int day = date.getDate();
		int hours = date.getHours();
		int minutes = date.getMinutes();
		int Seconds = date.getSeconds();
		
		
		System.out.println("����:"+(year+1900));
		System.out.println("��:"+(month+1));
		System.out.println("��:"+day);
		System.out.println("�ð�:"+hours);
		System.out.println("��:"+minutes);
		System.out.println("��:"+Seconds);
		//�ú��ʵ� ����غ��ô�.
	}
}
