import java.util.*;
class Home6
{
	public static void main(String[] args) //1번
	{
		String r;
		int a,b,c;

		Scanner sc = new Scanner(System.in);

		System.out.println("+,-,*,/ 입력하세요");
		r = sc.next();
			if(r==x)
			{
				System.out.println("곱셉을 합니다");
				System.out.println("첫번째 숫자를 입력해주세요");
				a = sc.nextInt();
				System.out.println("두번째 숫자를 입력해주세요");
				b = sc.nextInt();

				c = a*b;		
			}
			else if(r==+)
			{
				System.out.println("덧셈을 합니다");
				System.out.println("첫번째 숫자를 입력해주세요");
				a = sc.nextInt();
				System.out.println("두번째 숫자를 입력해주세요");
				b = sc.nextInt();

				c = a+b;		
			}
			else if(r==-)
			{
				System.out.println("뺼샘을 합니다");
				System.out.println("첫번째 숫자를 입력해주세요");
				a = sc.nextInt();
				System.out.println("두번째 숫자를 입력해주세요");
				b = sc.nextInt();

				c = a-b;		
			}
			else if(r==/)
			{
				System.out.println("나눗셈을 합니다");
				System.out.println("첫번째 숫자를 입력해주세요");
				a = sc.nextInt();
				System.out.println("두번째 숫자를 입력해주세요");
				b = sc.nextInt();

				c = a/b;		
			}
	}

}

/*{

	public static void main(String[] args) //3번
	{
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("물건을 구입한 갯수는?");
		a = sc.nextInt();
		
		int b = a*100;
		int c = b/10;	
			
			if(a>=10)
			{
				System.out.println(b-c+"원입니다.");
			}
				else
				{
					System.out.println(b+"원입니다.");
				}

	}

}*/

/*{
	public static void main(String[] args) //5번
	{

		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 10사이의 번호를 입력해주세요");
		a = sc.nextInt();

			if(a==2)
			{
				System.out.println("1등입니다.");
			}
				else if(a==5)
				{
					System.out.println("2등입니다.");
				}

				else if(a==7)
				{
					System.out.println("3등입니다.");
				}
				else
				{
					System.out.println("꽝입니다.");
				}
	}


}*/


/*{	
	public static void main(String[] args) //6번
	{

		double a,b;
		Scanner sc = new Scanner(System.in);

		System.out.println("키를 입력해주세요");
		a = sc.nextDouble();
		System.out.println("몸무게를 입력해주세요");
		b = sc.nextDouble();

         	double c = (a-100)*0.9;
			
			if(b>c)
			{
				System.out.println("과체중입니다.");	
			}
			else if(b<c)
			{
				System.out.println("저체중입니다.");
			}
			else
			{
				System.out.println("표준체중입니다.");
			}

	}



}*/