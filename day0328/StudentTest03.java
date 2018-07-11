/*
	성적처리 프로그램을 위하여
	한명의 학생의 정보를 다믈 세트를 만들어 보자
	==> 클래스(새로운 자료형,사용자 정의 자료형)
*/

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

class StudentTest03
{
	public static void main(String[] args) 
	{
		Student []b = new Student[2];
		b[0] = new Student();
		b[1] = new Student();
		
		b[0].name = "홍길동";
		b[0].kor = 100;
		b[0].eng = 100;
		b[0].math = 100;
		b[0].tot = b[0].kor + b[0].eng + b[0].math;
		b[0].avg = b[0].tot/3;

		b[1].name = "김정은";
		b[1].kor = 60;
		b[1].eng = 70;
		b[1].math = 80;
		b[1].tot = b[1].kor + b[1].eng + b[1].math;
		b[1].avg = b[1].tot/3;

		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<2; i++)
		{
			System.out.println(b[i].name+"\t"+b[i].kor+"\t"+b[i].eng+"\t"+b[i].math+"\t"+b[i].tot+"\t"+b[i].avg);
		}
	
	}
}
