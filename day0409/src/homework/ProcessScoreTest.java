package homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.lang.NullPointerException;
/*
	����� ���� ���� Ŭ����  �����
	==> �������� �ڹٴ� ������ ���� �ؾ��ϴ� 
	���α׷������� ������ ��Ȳ�� ������ �ϴ� ���

	Exception Ŭ������ ��ӹ޾� ���ο� Ŭ���� �����
	�����ڸ� �����Ͽ� �θ�۷����� �����ڿ��� �޼����� �����Ѵ�.

	�׻�Ȳ(������ ������)�� �Ǹ�
	������ ���ܸ� �߻����Ѿ� �Ѵ�.
	==> ���� Ŭ�������� ��ü�� ����!!!!!

	throw new IllegalScoreException("������ �ƴ� �ùٸ� ���� �Է��ϼ���");
*/

class IllegalScoreException extends Exception {
	public IllegalScoreException(String msg) {
		super(msg);
	}
	// ������ �ƴ� �ùٸ� ���� �Է��ϼ���
}

class ProcessScore {

	public ProcessScore(int[] score) {

		double avar = 0;
		int tot = 0;
		for (int i = 0; i < score.length; i++) {
			tot = score[i] + tot;
		}
		avar = tot / score.length;
		System.out.println("���" + avar);
	}
}

class ProcessScoreTest {
	public static void main(String[] args) {

		int n;
		int[] arr;
		Scanner sc = new Scanner(System.in);
		System.out.println("�л��� ����Դϱ�?");
		n = sc.nextInt();
		arr = new int[n];

		try {
			for (int i = 0; i < n; i++) {
				System.out.println((i + 1) + "�л����� �Է�");
				arr[i] = sc.nextInt();

				if (arr[i] < 0) {

					throw new IllegalScoreException("���ܹ߻� : ���� ����");
				}
			}

			ProcessScore p = new ProcessScore(arr);
		} catch (IllegalScoreException e) {
			System.out.println(e.getMessage());
		}
	}
}