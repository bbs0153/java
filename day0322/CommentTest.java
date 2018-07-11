/*

	큰수 찾기 프로그램
	작성자 : 변성인
	날짜 : 2018/03/22

*/
import java.util.*;
class CommentTest
{
	public static void main(String[] args) 
	{
		//사용자로 부터 입력받기 위하여 scanner 객체를 생성한다.
		Scanner sc = new Scanner(System.in);

		//두개의 변수를 선언한다.
		int a,b;

		//두수를 입력받는다.
		//System.out.println("첫번째 숫자를 입력하세요");
		//a = sc.nextInt();
		//System.out.println("두번째 숫자를 입력하세요");
		//b = sc.nextInt();

		//두 수중에 큰수를 찾아 max에 저장한다.
		int max = (a>b)?a:b;
		
		//결과를 출력한다.
		System.out.println(max);
	}
}
