package exam02;
/*
  ��ǻ�Ϳ� ����ڰ� ����,����,�� ������ �ϴ� ���α׷��� �ۼ��Ͻÿ�
  
  <<���� ��>>
  ����(0),����(1),��(2) �߿� �����Ͻÿ� >>1
  **���Ӱ��**
  ����� : ����
  ��Ǫ�� : ����
  ����� �̰���ϴ�.
 */
import java.util.Random;
import java.util.Scanner;

public class GameTest01 {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);	
		Random random = new Random();
		
		int n=0;
		int com=0;
		
		System.out.println("����(0),����(1),��(2) �߿� �����Ͻÿ�");
		n = scanner.nextInt();
		com  = random.nextInt(3);
		
		if(n==0){
			System.out.println("����� : ����");
		}
			else if(n==1){
				System.out.println("����� : ����");
			}
				else if(n==2){
					System.out.println("����� : ��");
				}
	
		if(com==0){
			System.out.println("��ǻ�� : ����");
		}
			else if(com==1){
				System.out.println("��Ǫ�� : ����");
			}
				else if(com==2){
					System.out.println("��ǻ�� : ��");
				}
		
		if(n==0&&com==2||n==1&&com==0||n==2&&com==1){
			System.out.println("����� �̰���ϴ�.");
		}
			else if(n==0&&com==1||n==1&&com==2||n==2&&com==0){
				System.out.println("����� �����ϴ�.");
			}
				else if(n==com){
					System.out.println("�����ϴ�.");
				}
	}

}
