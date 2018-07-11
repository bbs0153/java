/*
	6의 약수 1,2,3,6

	약수 ? 그 수를 나누어서 나머지가 0이 되는 수

	어떤수 n을 입력 받아 n의 약수를 모두 출력하는 프로그램

*/
import java.util.*;
class ForTest6 
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		a = sc.nextInt();

		System.out.println(a+"약수는 다음과 같습니다.");
		 for (int i=1; i<=a ; i++)
		 {
			if(a%i==0)
			{
				System.out.print(i+ " ");
			}
		 }
	}
}
