import java.util.*;
class Employee
{
	String name;	//이름
	String dir;		//주소
	int money;		//연봉
	String call;		//번호
}

class Employee01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee []a = new Employee[3];

		for(int i = 0; i<a.length; i++)
		{
			a[i] = new Employee();
			
			System.out.println("이름을 입력하세요");
			a[i].name = sc.next();
			System.out.println("주소를 입력하세요");
			a[i].dir = sc.next();
			System.out.println("연봉을 입력하세요");
			a[i].money = sc.nextInt();
			System.out.println("전화 번호를 입력하세요");
			a[i].call = sc.next();
		}
		for (int i = 0; i<a.length; i++)
		{
			for (int j = i+1; j<a.length; j++)
			{
				if(a[j].money > a[i].money) 
				{
					Employee temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.print("이름\t주소\t연봉\t전화번호");
		System.out.println();
		for(int i =0 ; i<a.length; i++)
		{
			System.out.print(a[i].name+"\t"+a[i].dir+"\t"+a[i].money+"\t"+a[i].call);
			System.out.println();
		}
		
	}
}
