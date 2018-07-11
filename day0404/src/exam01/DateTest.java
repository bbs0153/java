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
		
		
		System.out.println("연도:"+(year+1900));
		System.out.println("월:"+(month+1));
		System.out.println("일:"+day);
		System.out.println("시간:"+hours);
		System.out.println("분:"+minutes);
		System.out.println("초:"+Seconds);
		//시분초도 출력해봅시다.
	}
}
