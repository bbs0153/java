import java.util.*;
class ForTest11
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("0�̻��� ���ڸ� �Է��ϼ���");
		a = sc.nextInt();
		
		if(a<0)
		{
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
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
