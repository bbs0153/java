import java.util.*;
class AddTest02
{
	public static void main(String[] args) 
	{
		int r,a,b;
		
		try
		{
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);

			r = a+b;

			System.out.println(r);
		}
		catch (Exception e)
		{
			System.out.println("더하기할 두수를 전달하세요");
		}
		

	}
}
