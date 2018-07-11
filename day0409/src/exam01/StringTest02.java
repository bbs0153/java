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

		list.add(new Emp("이현진", "920604-1"));
		list.add(new Emp("한상숙", "920123-2"));
		list.add(new Emp("조성재", "921217-1"));
		list.add(new Emp("김종숙", "921224-2"));
		list.add(new Emp("양동훈", "930428-1"));
		list.add(new Emp("강서영", "940213-2"));
		list.add(new Emp("송명준", "910512-1"));
		list.add(new Emp("차건희", "930415-2"));

		// 이달의 생일자에게 상품권을 주고자 한다
		// 대상자의 이름을 출력하시오

		Calendar today = Calendar.getInstance();

		int today_month = today.get(Calendar.MONTH) + 1;

		System.out.println(today_month + "월의 생일자는 다음과 같습니다.");
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
