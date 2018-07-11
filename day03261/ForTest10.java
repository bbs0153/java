import java.util.*;
class ForTest11
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("0이상의 숫자를 입력하세요");
		a = sc.nextInt();
		
		if(a<0)
		{
			System.out.println("잘못 입력하셨습니다.");
		}
			
			for(int i=0; i<=a; i++)
			{
				if(i%3==0)
				{
					System.out.print(i+" ");
				}
			}
	}
}
