import java.util.*;
class SwitchTest4 
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		a = sc.nextInt();
		
		if(a<1||a>12)
		{
			System.out.println("입력값을 확인하세요");
			return;
		}

		switch(a)
		{
			
			case 4: case 6: case 9: case 11: b = 30; break;
			case 2: b = 28; break;
			default: b = 31;
		}
			System.out.println(a+"월은"+b+"까지있습니다.");
	}
}
