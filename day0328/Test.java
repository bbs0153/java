/*
	난수(무작위) 만들기 (제비뽑기)
	
	1~10 사이의 무작위 수를 하나 만들어 출력

*/

import java.util.Random;
class Test
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		int n = r.nextInt();
		
		//음수이면 양수로 만들자
		if (n<0)
		{ 
			n = n*-1;
		}
		
		//1에서 10사의 수로 제한
		n = n%10+1;
		
		
		System.out.println(n);
	}
}
