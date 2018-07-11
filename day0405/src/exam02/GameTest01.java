package exam02;
/*
  컴퓨터와 사용자가 가위,바위,보 게임을 하는 프로그램을 작성하시오
  
  <<실행 예>>
  가위(0),바위(1),보(2) 중에 선택하시오 >>1
  **게임결과**
  사용자 : 바위
  컴푸터 : 가위
  당신이 이겼습니다.
 */
import java.util.Random;
import java.util.Scanner;

public class GameTest01 {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);	
		Random random = new Random();
		
		int n=0;
		int com=0;
		
		System.out.println("가위(0),바위(1),보(2) 중에 선택하시오");
		n = scanner.nextInt();
		com  = random.nextInt(3);
		
		if(n==0){
			System.out.println("사용자 : 가위");
		}
			else if(n==1){
				System.out.println("사용자 : 바위");
			}
				else if(n==2){
					System.out.println("사용자 : 보");
				}
	
		if(com==0){
			System.out.println("컴퓨터 : 가위");
		}
			else if(com==1){
				System.out.println("컴푸터 : 바위");
			}
				else if(com==2){
					System.out.println("컴퓨터 : 보");
				}
		
		if(n==0&&com==2||n==1&&com==0||n==2&&com==1){
			System.out.println("당신이 이겼습니다.");
		}
			else if(n==0&&com==1||n==1&&com==2||n==2&&com==0){
				System.out.println("당신이 졌습니다.");
			}
				else if(n==com){
					System.out.println("비겼습니다.");
				}
	}

}
