package home;

import java.util.HashMap;
import java.util.Scanner;

public class pdf11Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();

		String a, b, c;
		int n;
		map.put("Car", "�����⸦ ���¿������Ͽ� �����ϴ� ��");
		map.put("Hi", "���� ���̿��� ���� �����ų� ����� �� �ϴ� �λ�");
		map.put("Sorry", "������ ���Ͽ� ������ ��ġ ���ϰ� �β�����");
		map.put("Today", "���� �������� �ִ� �̳�");
		map.put("Singer", "�뷡 �θ��� ���� ������ ���");

		while (true) {
			System.out.println("1�� �˻� 2�� ��� 3�� ���� 4�� ����");
			n = sc.nextInt();

			switch (n) {

			case 1:
				System.out.println("����ܾ �Է��ϼ���");
				a = sc.next();
				System.out.println(map.get(a));
				break;

			case 2:
				System.out.println("�ܾ ��� �ϼ���");
				b = sc.next();
				System.out.println("���� �Է��ϼ���");
				c = sc.next();

				map.put(b, c);
				break;

			case 3:
				System.out.println("������ �ܾ �Է��ϼ���");
				b = sc.next();

				map.remove(b);
				break;

			case 4:
				return;
			}
		}

	}

}
