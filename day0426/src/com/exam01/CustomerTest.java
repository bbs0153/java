package com.exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name;

		System.out.println("�̸��Է�");
		name = sc.next();

		CustomerDAO dao = new CustomerDAO();
		dao.getCustomer(name);
		CustomerVO c = dao.getCustomer(name);

		System.out.println("ã�� ���� ������ ������ �����ϴ�.");
		System.out.println("�����̵� : " + c.getCustid());
		System.out.println("���̸� : " + c.getName());
		System.out.println("���ּ� : " + c.getAddress());
		System.out.println("����ȭ : " + c.getPhone());

	}

}
