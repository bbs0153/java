/*
	�ټ��� �Է� �Ͻÿ� 5

	*
	**
	***
	****
	*****


*/
import java.util.*;
class  ForTest18
{
	public static void main(String[] args) 
	{
		String star = "*";
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("�ټ��� �Է��ϼ���");
		a = sc.nextInt();

			for(int i=1; i<=a; i++)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print(star);
				}
				System.out.println();
			}
	}
}
