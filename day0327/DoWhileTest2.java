/*
	do~while문을 이용하여 작성합니다.
	몇단을 출력할까요? 3
	3*1=3
	3*2=6
	.
	.
	.
*/
import java.util.*;
class  DoWhileTest2
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc= new Scanner(System.in);

		System.out.println("몇단을 출력할까요?");
		a = sc.nextInt();

		int i=1;
		do
		{
			System.out.println(a+"*"+i+"="+(a*i));
			i++;

		}while(i<=9);

	}
}
