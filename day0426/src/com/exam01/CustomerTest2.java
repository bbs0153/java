package com.exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String address;

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
