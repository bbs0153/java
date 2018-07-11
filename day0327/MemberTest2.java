/*
		사용자 한테 이름 주소 나이 를 입력받아
		출력하는 프로그램

*/
import java.util.*;
class  MemberTest2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		String addr;
		int age;
		
		System.out.println("나이 :");
		age = sc.nextInt();
		
		sc.nextLine(); // 다른 입력들하고 달라서 다른 입력끼리는 한번 더 써줘야 한다.

		System.out.println("주소 :");
		addr = sc.nextLine(); //공백문자 입력 o

		System.out.println("나이 : "+age);
		System.out.println("주소 : "+addr);
	}
}
