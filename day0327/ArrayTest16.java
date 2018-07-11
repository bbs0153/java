/*
	사용자한테 5명의 이름,국어,영어,수학 입력을 받아
	각 학생의 총점과 평균을 구하여
	성적이 높은 순으로 출력하는 프로그램

	1번째 학생의 이름? 이태호
	국어점수? 100
	영어점수? 80
	수학점수? 100
	....

	**성적 결과**
	이름    국어   영어   수학   총점   평균
	이태호  100    100    100    300    100
	....
*/
import java.util.*;
class ArrayTest16 
{
	public static void main(String[] args) 
	{
		String []name = new String[5];
		int []a = new int[5]; //국어
		int []b = new int[5]; //영어
		int []c = new int[5]; //수학
		int []tot = new int[5]; //총점
		double []d = new double[5]; //평균
	
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i<name.length; i++)
		{
			System.out.println((i+1)+"번째 학생의 이름 :");
			name[i] = sc.next();
			System.out.println("국어 점수 : ");
			a[i] = sc.nextInt();
			System.out.println("영어 점수 : ");
			b[i] = sc.nextInt();
			System.out.println("수학 점수 : ");
			c[i] = sc.nextInt();
			
			tot[i] = a[i]+b[i]+c[i];
			d[i] = tot[i]/3;
		}
		
		for (int i=0; i<tot.length; i++) 
		{
			for (int j=i+1; j<tot.length ; j++)
			{
				if(tot[j]>tot[i])
				{
				
					int temp;
					temp = tot[i];
					tot[i] = tot[j];
					tot[j] = temp;

					int temp1;
					temp1 = a[i];
					a[i] = a[j];
					a[j] = temp1;

					int temp2;
					temp2 = b[i];
					b[i] = b[j];
					b[j] = temp2;
					
					int temp3;
					temp3= c[i];
					c[i] = c[j];
					c[j] = temp3;

					double temp4;
					temp4 = d[i];
					d[i] = d[j];
					d[j] = temp4;

					String temp5;
					temp5 = name[i];
					name[i] = name[j];
					name[j] = temp5;
				}
			}
		
		}

		System.out.println("**성적 확인**");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
	
		for(int i = 0; i<name.length; i++)
		{
			System.out.println(name[i]+"\t"+a[i]+"\t"+b[i]+"\t"+c[i]+"\t"+tot[i]+"\t"+d[i]);
		}
			
	}
}
