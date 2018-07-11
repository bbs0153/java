import java.util.*;

class Btest
{
	public static void main(String []args)
	{
		String name;
		int year,age;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("이름을 입력하세요");
		name = sc.next();
		System.out.println("출생년도를 입력하세요");
		year = sc.nextInt();

		age = 2018-year+1;	
			
			if(age>=40)
			{
				System.out.println(name+"님은 무료암검진 대상자가 맞습니다.");
			}
				else
				{
					System.out.println(name+"님은 무료압건진 대상자가 아닙니다.");
				}

	}



}