package homework;

import java.util.Scanner;

public class DivideByZeroTest {

	public static void main(String[] args) {

		int number1, number2, result;

		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("첫 번째 정수: ");
			number1 = sc.nextInt();

			System.out.print("두 번째 정수: ");
			number2 = sc.nextInt();

			result = number1 / number2;
			System.out.println(result);

		} catch (Exception e) {
			System.out.println("예외 발생: "+e.getMessage());
		}finally {
			System.out.println("작업종료");
		}
	}

}
