import java.util.*;
class NameTest
{
	public static void main(String []args)
	{
		String name;
		System.out.println("이름을 입력하시오");
		Scanner sc = new Scanner(System.in);
		name = sc.next();

		char ch = name.charAt(0);
		System.out.println(ch);
	}
}