//사용자한테 0~9사이의 정수를 입력받아 한글 표기식 출력
import java.util.*;
class SwitchTest3
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0~9사이의 정수를 입력하세요");
		a = sc.nextInt();

		switch(a)
		{
			case 0: System.out.println("영"); 
			case 1: System.out.println("일"); 
			case 2: System.out.println("이"); break;
			case 3: System.out.println("삼"); 
			case 4: System.out.println("사"); 
			case 5: System.out.println("오"); 
			case 6: System.out.println("육"); break;
			case 7: System.out.println("칠"); 
			case 8: System.out.println("팔"); 
			case 9: System.out.println("구"); 
			default: System.out.println("잘못입력하셨습니다.");
		}
	}
}
