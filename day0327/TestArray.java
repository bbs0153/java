import java.util.*;
class  TestArray
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int []a = new int[10];
		
		for (int i=0; i<a.length; i++)
		{
			System.out.println((i+1)+"��° �����Է�");
			a[i] = scan.nextInt();
		}
			for(int i=0; i<a.length; i++)
			{
				System.out.print(a[i]+" ");
			}

	}
}
