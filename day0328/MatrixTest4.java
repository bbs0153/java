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
		Scanner sc = new Scanner(System.in);
		String []name = new String[5];
		int [][]score = new int[5][5];


		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.println("이름을 입력하세요");
				name[i] = sc.next();
				System.out.println("국어 점수를 입력하세요");
				score[i][j] = sc.nextInt();
				System.out.println("영어 점수를 입력하세요");
				score[i][j] = sc.nextInt();
				System.out.println("수학 점수를 입력하세요");
				score[i][j] = sc.nextInt();

				
				score[i][3] = score[i][0] + score[i][1] + score[i][2];
				score[i][4] = score[i][3]/3
			}

			System.out.println("**성적확인**");
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
			System.out.print(score[i][j]"\t");

		}
	}
}
