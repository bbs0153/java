//사용자 한테 0~99사이의 정수를 입력받아
//한글표기식 출력하는 프로그램작성
import java.util.*;
class DigiToKor
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a;
		int a10; //10의 자리를 저장할 변수
		int a1; // 1의 자리를 저장할 변수
		String r = ""; //10의 자리 글자 담아둘 변수
		String f = ""; //1의 자리 글자 담아둘 변수
		
		System.out.println("** 숫자를 입력하면 한글로 변환합니다.");
		System.out.println("0~99사이의 수를 입력하세요");
		a = sc.nextInt();

		a10 = a/10; 
		a1 = a%10;
			
			if(a10==0)      //10의 자리 처리 시작
				r = "";
			else if(a10==1)
				r = "십";
			else if(a10==2)
				r = "이십";
			else if(a10==3)
				r = "삼십";
			else if(a10==4)
				r = "사십";
			else if(a10==5)
				r = "오십";
			else if(a10==6)
				r = "육십";
			else if(a10==7)
				r = "칠십";
			else if(a10==8)
				r = "팔십";
			else if(a10==9)
				r = "구십";  //10의 자리 처리 끝

			if(a1==0&&a10==0)        //1의 자리 처리 시작
				f = "영";
			else if(a1==1)
				f = "일";
			else if(a1==2)
				f = "이";
			else if(a1==3)
				f = "삼";
			else if(a1==4)
				f = "사";
			else if(a1==5)
				f = "오";
			else if(a1==6)
				f = "육";
			else if(a1==7)
				f = "칠";
			else if(a1==8)
				f = "팔";
			else if(a1==9)
				f = "구";   //1의 자리 처리 끝

			System.out.println(r+f);
			

		
	}
}
