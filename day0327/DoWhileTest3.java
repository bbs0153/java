/*
	사용자 한테 n을 입력받아 1~n까지의 합을 누적하여 출력
*/
import java.util.*;
class DoWhileTest3 
{
	public static void main(String[] args) 
	{
		int n,sum=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("n을 입력하세요");
		n = sc.nextInt();

		int i=1;
		do
		{
			sum = sum+i;
			i++;
		}while (i<=n);

		System.out.println(sum);
		
	}
}
