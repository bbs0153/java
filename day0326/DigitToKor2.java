import java.util.*;
class DigitToKor2 
{
	public static void main(String[] args) 
	{
		String []str = {"¿µ","ÀÏ","ÀÌ","»ï","»ç","¿À","À°","Ä¥","ÆÈ","±¸"};

		Scanner sc = new Scanner(System.in);

		int n;
		
		while(true)
		{
			System.out.println("0~9»çÀÌÀÇ ¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
			n = sc.nextInt();

				if(n>=0&&n<=9)
				{
					break;
				}
		}
		
		System.out.println(str[n]);
		

	}
}
