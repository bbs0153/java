/*
	몇단을 출력할까요? 3
	3*1 3*2.....3*9

*/
import java.util.*;
class WhileTest2 
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("몇단을 출력할까요?");
		a = sc.nextInt();

		int i = 1;
		while(i<=9)
		{
			System.out.println(a+"*"+i+"="+(a*i)); 
			i++;
		
		}
	}
}
