package exam01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarTest {

	public static void main(String[] args) {
	
		GregorianCalendar greorian = new GregorianCalendar();
		
		System.out.println(greorian.get(Calendar.YEAR)+"년");
		System.out.println((greorian.get(Calendar.MONTH)+1)+"월");
		System.out.println(greorian.get(Calendar.DATE)+"일");
		System.out.println(greorian.get(Calendar.HOUR)+"시");
		System.out.println(greorian.get(Calendar.MINUTE)+"분");
		System.out.println(greorian.get(Calendar.SECOND)+"초");
	}

}
