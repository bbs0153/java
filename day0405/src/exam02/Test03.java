package exam02;

import java.util.GregorianCalendar;
import java.util.Scanner;

//����� ���� ������ �Է¹޾� �� �ذ� �������� �Ǻ��ϴ� ���α׷�
public class Test03 {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		int year;
		GregorianCalendar gc = new GregorianCalendar();
		
		System.out.println("������ �Է��Ͽ�");
		year = scanner.nextInt();
		
		if(gc.isLeapYear(year)==true){
			
			System.out.println(year+"�⵵�� �����Դϴ�.");
		}
		else {
			System.out.println(year+"�⵵�� ������ �ƴմϴ�.");
		}
	}
}
