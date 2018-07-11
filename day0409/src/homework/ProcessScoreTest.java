package homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.lang.NullPointerException;
/*
	사용자 정의 예외 클래스  만들기
	==> 원래부터 자바는 모르지만 지금 해야하는 
	프로그램에서는 예외인 상황를 만들어야 하는 경우

	Exception 클래스를 상속받아 새로운 클래슬 만들고
	생성자를 정의하여 부모글래스의 생성자에게 메세지를 전달한다.

	그상황(점수가 음수인)이 되면
	강제로 예외를 발생시켜야 한다.
	==> 예외 클래스형의 객체를 생성!!!!!

	throw new IllegalScoreException("음수가 아닌 올바른 수를 입력하세요");
*/

class IllegalScoreException extends Exception {
	public IllegalScoreException(String msg) {
		super(msg);
	}
	// 음수가 아닌 올바른 수를 입력하세요
}

class ProcessScore {

	public ProcessScore(int[] score) {

		double avar = 0;
		int tot = 0;
		for (int i = 0; i < score.length; i++) {
			tot = score[i] + tot;
		}
		avar = tot / score.length;
		System.out.println("평균" + avar);
	}
}

class ProcessScoreTest {
	public static void main(String[] args) {

		int n;
		int[] arr;
		Scanner sc = new Scanner(System.in);
		System.out.println("학생은 몇명입니까?");
		n = sc.nextInt();
		arr = new int[n];

		try {
			for (int i = 0; i < n; i++) {
				System.out.println((i + 1) + "학생점수 입력");
				arr[i] = sc.nextInt();

				if (arr[i] < 0) {

					throw new IllegalScoreException("예외발생 : 점수 음수");
				}
			}

			ProcessScore p = new ProcessScore(arr);
		} catch (IllegalScoreException e) {
			System.out.println(e.getMessage());
		}
	}
}