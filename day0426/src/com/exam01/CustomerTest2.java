package com.exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String address;

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
