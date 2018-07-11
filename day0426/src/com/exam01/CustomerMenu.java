package com.exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerMenu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name;
		String address;

		int menu;

		System.out.println("1. 이름검색 / 2. 주소검색");
		menu = sc.nextInt();

		if (menu == 1) {
			System.out.println("이름입력");
			name = sc.next();

			CustomerDAO dao = new CustomerDAO();
			dao.getCustomer(name);
			CustomerVO c = dao.getCustomer(name);

			System.out.println("찾는 고객의 정보는 다음과 같습니다.");
			System.out.println("고객아이디 : " + c.getCustid());
			System.out.println("고객이름 : " + c.getName());
			System.out.println("고객주소 : " + c.getAddress());
			System.out.println("고객전화 : " + c.getPhone());

		}
		if (menu == 2) {

			sc = new Scanner(System.in);

			System.out.println("주소입력");
			address = sc.next();

			CustomerDAO dao = new CustomerDAO();
			ArrayList<CustomerVO> list = dao.listCustomerForAddr(address);
			System.out.println("번호\t이름\t주소\t\t전화");

			for (CustomerVO cv : list) {
				System.out.print(cv.getCustid() + "\t");
				System.out.print(cv.getName() + "\t");
				System.out.print(cv.getAddress() + "\t");
				System.out.println(cv.getPhone() + "\t");
			}

		}

	}
}
