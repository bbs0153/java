import java.util.*;
class DigitToKor2 
{
	public static void main(String[] args) 
	{
		String []str = {"��","��","��","��","��","��","��","ĥ","��","��"};

		Scanner sc = new Scanner(System.in);

		int n;
		
		while(true)
		{
			System.out.println("0~9������ ���� �Է��ϼ���");
			n = sc.nextInt();

				if(n>=0&&n<=9)
				{
					break;
				}
		}
		
		System.out.println(str[n]);
		

	}
}
