package exam02;
import java.util.HashMap;
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

public class GameTest04 {

	public static void main(String[] args) {
		
		//String []str = {"����","����","��"};
		HashMap map = new HashMap();
		
		map.put(0, "����");
		map.put(1, "����");
		map.put(2, "��");
		
		Scanner scanner = new Scanner(System.in);	
		Random random = new Random();
		
		int n=0;
		int com=0;
		
		System.out.println("����(0),����(1),��(2) �߿� �����Ͻÿ�");
		n = scanner.nextInt();
		com  = random.nextInt(3);
		
		System.out.println("�����:"+map.get(n));
	
		System.out.println("��ǻ��:"+map.get(com));
		
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
