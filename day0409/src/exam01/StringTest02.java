package exam01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Emp {

	private String name;
	private String jumin;

	public Emp() {
		super();
	}

	public Emp(String name, String jumin) {
		super();
		this.name = name;
		this.jumin = jumin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

}

public class StringTest02 {

	public static void main(String[] args) {

		ArrayList<Emp> list = new ArrayList<Emp>();

		list.add(new Emp("������", "920604-1"));
		list.add(new Emp("�ѻ��", "920123-2"));
		list.add(new Emp("������", "921217-1"));
		list.add(new Emp("������", "921224-2"));
		list.add(new Emp("�絿��", "930428-1"));
		list.add(new Emp("������", "940213-2"));
		list.add(new Emp("�۸���", "910512-1"));
		list.add(new Emp("������", "930415-2"));

		// �̴��� �����ڿ��� ��ǰ���� �ְ��� �Ѵ�
		// ������� �̸��� ����Ͻÿ�

		Calendar today = Calendar.getInstance();

		int today_month = today.get(Calendar.MONTH) + 1;

		System.out.println(today_month + "���� �����ڴ� ������ �����ϴ�.");
		for (Emp a : list) {

			String name = a.getName();
			String jumin = a.getJumin();

			int month = Integer.parseInt(jumin.substring(2, 4));

			if (month == today_month) {

				System.out.println(name);
			}

		}
	}

}
