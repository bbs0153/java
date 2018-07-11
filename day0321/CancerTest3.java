import java.util.*;

class CancerTest3
{
	public static void main(String []args)
	{
		String name;
		int year,age;
		
		Date today = new Date();		
		int currentYear = today.getYear()+1900;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("이름을 입력하세요");
		name = sc.next();
		System.out.println("출생년도를 입력하세요");
		year = sc.nextInt();

		age = currentYear-year+1;	
			
			if(age>=40&&year%2==currentYeat%2)
			{
				System.out.println(name+"님은 무료암검진 대상자가 맞습니다.");
			}
				else
				{
					System.out.println(name+"님은 무료압건진 대상자가 아닙니다.");
				}

	}



}
