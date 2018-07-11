package com.exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name;

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

}
