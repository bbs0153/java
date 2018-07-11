package homework;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력:");
		String text = sc.nextLine();
		
		int count = 0;
		
		for(int i=0; i<text.length();i++){
			
			if(text.charAt(i)==' '){
				count++;
			}
		}
		
		System.out.println("문자열의 길이:"+text.length());
		System.out.println("입력된 단어 수:"+(count+1));
		System.out.println("단어 빈도 수");

		String[] s = text.split("\\s");	 //스페이스바, 탭, 엔터 가능
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
