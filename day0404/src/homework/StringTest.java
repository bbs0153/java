package homework;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ� �Է�:");
		String text = sc.nextLine();
		
		int count = 0;
		
		for(int i=0; i<text.length();i++){
			
			if(text.charAt(i)==' '){
				count++;
			}
		}
		
		System.out.println("���ڿ��� ����:"+text.length());
		System.out.println("�Էµ� �ܾ� ��:"+(count+1));
		System.out.println("�ܾ� �� ��");

		String[] s = text.split("\\s");	 //�����̽���, ��, ���� ����
		int count1 =1;						
		
		for(int i=0;i<s.length;i++){
			
			for(int j=i+1;j<s.length;j++){
				
				if(s[i].equals(s[j])){
					count1 += 1;			
					s[j]="0";		
				}
			}
			
			if(s[i]!="0")
				System.out.println(s[i]+" ==> "+count1);
				
				count1=1;
		}

	}

}
