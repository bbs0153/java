import java.util.*;
class ForTest
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���");
		a = sc.nextInt();

		for(int i=1;i<=9;i++)
		{
			System.out.println(a+"*"+i+"="+a*i);
		}
	}
}
