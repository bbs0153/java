/*
	성적처리 프로그램을 위하여
	한명의 학생의 정보를 다믈 세트를 만들어 보자
	==> 클래스(새로운 자료형,사용자 정의 자료형)
*/
import java.util.*;
class Student
{
	//멤버 변수, 속성
	
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	int avg;
}

class StudentTest05
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student []b = new Student[3];

		for(int i=0; i<b.length; i++)
		{
			b[i] = new Student();

			System.out.println("이름을 입력하세요");
			b[i].name = sc.next();
			System.out.println("국어 점수를 입력하세요");
			b[i].kor = sc.nextInt();
			System.out.println("영어 점수를 입력하세요");
			b[i].eng = sc.nextInt();
			System.out.println("수학 점수를 입력하세요");
			b[i].math = sc.nextInt();

			b[i].tot = b[i].kor + b[i].eng + b[i].math;
			b[i].avg = b[i].tot/3;

		}
		//성적순으로 정렬하기(내림차순)
		for (int i =0; i<b.length; i++)
		{
			for (int j=i+1; j<b.length; j++)
			{
				if(b[j].tot > b[i].tot)
				{
					Student temp;
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}


		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i].name+"\t"+b[i].kor+"\t"+b[i].eng+"\t"+b[i].math+"\t"+b[i].tot+"\t"+b[i].avg);
		}
	
	}
}
