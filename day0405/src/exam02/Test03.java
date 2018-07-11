package exam02;

import java.util.GregorianCalendar;
import java.util.Scanner;

//사용자 한테 연도를 입력받아 그 해가 윤년인지 판별하는 프로그램
public class Test03 {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		int year;
		GregorianCalendar gc = new GregorianCalendar();
		
		System.out.println("연도를 입력하오");
		year = scanner.nextInt();
		
		if(gc.isLeapYear(year)==true){
			
			System.out.println(year+"년도는 윤년입니다.");
		}
		else {
			System.out.println(year+"년도는 윤년이 아닙니다.");
		}
	}
}
