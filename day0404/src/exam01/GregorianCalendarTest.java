package exam01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarTest {

	public static void main(String[] args) {
	
		GregorianCalendar greorian = new GregorianCalendar();
		
		System.out.println(greorian.get(Calendar.YEAR)+"��");
		System.out.println((greorian.get(Calendar.MONTH)+1)+"��");
		System.out.println(greorian.get(Calendar.DATE)+"��");
		System.out.println(greorian.get(Calendar.HOUR)+"��");
		System.out.println(greorian.get(Calendar.MINUTE)+"��");
		System.out.println(greorian.get(Calendar.SECOND)+"��");
	}

}
