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

class StudentTest02
{
	public static void main(String[] args) 
	{
		int a; // a라는 변수는 정수형(int)로 쓰겠습니다.
				// 기본자료형
		
		Student b; //b라는 변수는 student형으로 쓰겠습니다.
					//참조자료형은 객체를 생성하고 사용 할 수 있다.
		b = new Student();

		b.name = "홍길동";
		b.kor = 100;
		b.eng = 100;
		b.math = 100;

		b.tot = b.kor+b.eng+b.math;
		b.avg = b.tot/3;

		System.out.println("이름"+b.name);
		System.out.println("국어"+b.kor);
		System.out.println("영어"+b.eng);
		System.out.println("수학"+b.math);
		System.out.println("총점"+b.tot);
		System.out.println("평군"+b.avg);
					

	}
}
