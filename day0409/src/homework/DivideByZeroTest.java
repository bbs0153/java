package homework;

import java.util.Scanner;

public class DivideByZeroTest {

	public static void main(String[] args) {

		int number1, number2, result;

		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("ù ��° ����: ");
			number1 = sc.nextInt();

			System.out.print("�� ��° ����: ");
			number2 = sc.nextInt();

			result = number1 / number2;
			System.out.println(result);

		} catch (Exception e) {
			System.out.println("���� �߻�: "+e.getMessage());
		}finally {
			System.out.println("�۾�����");
		}
	}

}
