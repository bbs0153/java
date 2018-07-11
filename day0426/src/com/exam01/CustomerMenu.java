package com.exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerMenu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name;
		String address;

		int menu;

		System.out.println("1. �̸��˻� / 2. �ּҰ˻�");
		menu = sc.nextInt();

		if (menu == 1) {
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
		if (menu == 2) {

			sc = new Scanner(System.in);

			System.out.println("�ּ��Է�");
			address = sc.next();

			CustomerDAO dao = new CustomerDAO();
			ArrayList<CustomerVO> list = dao.listCustomerForAddr(address);
			System.out.println("��ȣ\t�̸�\t�ּ�\t\t��ȭ");

			for (CustomerVO cv : list) {
				System.out.print(cv.getCustid() + "\t");
				System.out.print(cv.getName() + "\t");
				System.out.print(cv.getAddress() + "\t");
				System.out.println(cv.getPhone() + "\t");
			}

		}

	}
}
