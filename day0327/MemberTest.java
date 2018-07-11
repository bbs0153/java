/*
		사용자 한테 이름 주소 나이 를 입력받아
		출력하는 프로그램

*/
import java.util.*;
class  MemberTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		String addr;
		int age;

		System.out.println("이름 :");
		name = sc.next();	//공백문자 입력 x
		System.out.println("주소 :");
		addr = sc.next();
		System.out.println("나이 :");
		age = sc.nextInt();

		System.out.println("이름 : "+name);
		System.out.println("주소 : "+addr);
		System.out.println("나이 : "+age);
	}
}
