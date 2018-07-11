package exam02;

import java.util.Random;

public class Product {

	private int n;

	// �����ڴ� ����Ͽ� ���ο� ���� n�� ����� ���� �ϵ��� �Ѵ�.
	// �Һ��ڴ� �����ڰ� ������ ���ο� ������ ������ ���� ���� �ϵ��� �Ѵ�.

	// ���ο� ������ ����Ǿ����� �׷��� ������ ���¸� ������ ����
	boolean isNew;
	// �����ڰ� ���ο� ������ ����� n�� ��� ���� isNew�� true�� ���
	// �Һ��ڰ� �� ������ ������ ���� ���� isNew False ���� ����.

	// �����ڰ� ���ο� ���� ����� �޼ҵ�
	public synchronized void makeNumber() {

		// 1~100 ������ ������ ����� n���� ����
		while (isNew == true) {
			try {
				wait();
			} catch (Exception e) {
			}
		}

		Random r = new Random();
		n = r.nextInt(100) + 1;

		System.out.println("�����ڰ� ���ο� ��ǰ�� ������:" + n);

		notify();
		isNew = true;

	}

	// �Һ��ڰ� ������ ������ ���� �޼ҵ�
	public synchronized int getNumber() {

		while (isNew == false) {
			try {
				wait();
			} catch (Exception e) {
			}
		}

		System.out.println("�Һ��ڰ� ���ο� ��ǰ�� �Һ���:" + n);

		notify();
		isNew = false;
		return n;
	}

}
