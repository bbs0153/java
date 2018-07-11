/*
	5명의 이름 국어 영어 수학 입력 받아 총점과 평균을 출력
	(단 점수는 2차원 배열을 이용한다.)
	이차원 배열을 이용

*/
import java.util.*;
class StudentTest
{
	public static void main(String[] args) 
	{
		String []str = {"국어","영어","수학"};
		Scanner sc = new Scanner(System.in);
		String []name = new String[5];
		int [][]score = new int[5][5];

			
		for(int i=0; i<5; i++) //학생의 수 만큼 반복 실행
		{
			System.out.println((i+1)+"번째 이름을 입력하세요");
			name[i] = sc.next();
			
			for(int j=0; j<3; j++) //과목의 수 만큼 반복 실행
			{
				
				System.out.println(str[j]+"점수 입력");
				score[i][j] = sc.nextInt();
				
				score[i][3] = score[i][3] + score[i][j];
			
			}
					
			score[i][4] = score[i][3]/3;
		}
	
		System.out.println("***성적 처리 결과***");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
		for(int i=0; i<5; i++)
		{
			System.out.print(name[i]+"\t");	
			
			for (int j=0; j<5 ; j++)
			{
				System.out.print(score[i][j]+"\t");
			}
		
			System.out.println();
		}
	}
}
