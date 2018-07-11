import java.util.*;

class  star1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하시오 : ");
		String name = sc.nextLine();
		System.out.print("몇월 생 이십니까? : ");
		int a = sc.nextInt();
		String star = "";

		if( a>12 || a<0 )
		{
			System.out.println("월을 제대로 입력하시오.");
			return;
		}

		System.out.print("몇일 생 이십니까? : ");
		int b = sc.nextInt();
		int date;
		int month;
		int lastDay = 31;
		if(month == 2)
		lastDay = 28;
		else if (month == 4 || month == 6 || month == 9 || month == 11)
		lastDay = 30;

		if (b < 1 || b > lastDay)
		{
			System.out.println("일을 제대로 입력하시오.");
			return;
		}
		
		switch(a)
		{
			case 1: if(date <= 19) star = "염소자리"; else star = "물병자리"; break;
			case 2: if(date <= 18) star = "물병자리"; else star = "물고기자리"; break;
			case 3: if(date <= 20) star = "물고기자리"; else star = "양자리"; break;
			case 4: if(date <= 19) star = "양자리"; else star = "황소자리"; break;
			case 5: if(date <= 20) star = "황소자리"; else star = "쌍둥이자리"; break;
			case 6: if(date <= 21) star = "쌍둥이자리"; else star = "게자리"; break;
			case 7: if(date <= 22) star = "게자리"; else star = "사자자리"; break;
			case 8: if(date <= 22) star = "사자자리"; else star = "처녀자리"; break;
			case 9: if(date <= 23) star = "처녀자리"; else star = "천칭자리"; break;
			case 10: if(date <= 22) star = "천칭자리"; else star = "전갈자리"; break;
			case 11: if(date <= 22) star = "전갈자리"; else star = "사수자리"; break;
			case 12: if(date <= 24) star = "사수자리"; else star = "염소자리"; break;
		}
	}
}