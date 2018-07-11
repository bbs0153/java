import java.util.Scanner;
public class Adultb2
{
   public static void main(String []args)
   {
 
         String name;
         //컴퓨터안에 메모리상에 공간을 확보해줘
         //그 공간의 이름은 name으로 할거야
         //그안에 나는 글자(String)를 보관할께
         int age;
         //정수를 저장할 공간을 확보하고 그 이름은 age로 할께
         
	Scanner sc = new Scanner(System.in);
	
	System.out.println("이름을 입력==>");
	name = sc.next();	
	
	System.out.println("나이를 입력==>");	
	age = sc.nextInt();	
        
	System.out.println("이름은:"+name+"\n나이는:"+age+"");
            
            

    }


}

//자바의 기본자료형 8가지를 조사하고 실험 해 봅시다.
//자바의 산술연산자를 조사하고 사용자로 부터 두개의 정수를 입력받아 사칙연산을 수행하여 결과를 출력하는 프로그램을 작성합니다.
