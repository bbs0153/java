/*
	����ó�� ���α׷��� ���Ͽ�
	�Ѹ��� �л��� ������ �ٹ� ��Ʈ�� ����� ����
	==> Ŭ����(���ο� �ڷ���,����� ���� �ڷ���)
*/

class Student
{
	//��� ����, �Ӽ�
	
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
		
		b[0].name = "ȫ�浿";
		b[0].kor = 100;
		b[0].eng = 100;
		b[0].math = 100;
		b[0].tot = b[0].kor + b[0].eng + b[0].math;
		b[0].avg = b[0].tot/3;

		b[1].name = "������";
		b[1].kor = 60;
		b[1].eng = 70;
		b[1].math = 80;
		b[1].tot = b[1].kor + b[1].eng + b[1].math;
		b[1].avg = b[1].tot/3;

		System.out.println("�̸�\t����\t����\t����\t����\t���");
		for(int i=0; i<2; i++)
		{
			System.out.println(b[i].name+"\t"+b[i].kor+"\t"+b[i].eng+"\t"+b[i].math+"\t"+b[i].tot+"\t"+b[i].avg);
		}
	
	}
}
