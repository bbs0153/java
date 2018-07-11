package home;

import java.util.HashMap;
import java.util.Scanner;

public class pdf11Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();

		String a, b, c;
		int n;
		map.put("Car", "원동기를 동력원으로하여 주행하는 것");
		map.put("Hi", "편한 사이에서 서로 만나거나 헤어질 떄 하는 인사");
		map.put("Sorry", "남에게 대하여 마음이 편치 못하고 부끄러움");
		map.put("Today", "지금 지나가고 있는 이날");
		map.put("Singer", "노래 부르는 것이 직업인 사람");

		while (true) {
			System.out.println("1번 검색 2번 등록 3번 삭제 4번 종료");
			n = sc.nextInt();

			switch (n) {

			case 1:
				System.out.println("영어단어를 입력하세요");
				a = sc.next();
				System.out.println(map.get(a));
				break;

			case 2:
				System.out.println("단어를 등록 하세요");
				b = sc.next();
				System.out.println("뜻을 입력하세요");
				c = sc.next();

				map.put(b, c);
				break;

			case 3:
				System.out.println("삭제할 단어를 입력하세요");
				b = sc.next();

				map.remove(b);
				break;

			case 4:
				return;
			}
		}

	}

}
