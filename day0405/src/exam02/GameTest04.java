package exam02;
import java.util.HashMap;
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

public class GameTest04 {

	public static void main(String[] args) {
		
		//String []str = {"가위","바위","보"};
		HashMap map = new HashMap();
		
		map.put(0, "가위");
		map.put(1, "바위");
		map.put(2, "보");
		
		Scanner scanner = new Scanner(System.in);	
		Random random = new Random();
		
		int n=0;
		int com=0;
		
		System.out.println("가위(0),바위(1),보(2) 중에 선택하시오");
		n = scanner.nextInt();
		com  = random.nextInt(3);
		
		System.out.println("사용자:"+map.get(n));
	
		System.out.println("컴퓨터:"+map.get(com));
		
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
