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

class StudentTest02
{
	public static void main(String[] args) 
	{
		int a; // a��� ������ ������(int)�� ���ڽ��ϴ�.
				// �⺻�ڷ���
		
		Student b; //b��� ������ student������ ���ڽ��ϴ�.
					//�����ڷ����� ��ü�� �����ϰ� ��� �� �� �ִ�.
		b = new Student();

		b.name = "ȫ�浿";
		b.kor = 100;
		b.eng = 100;
		b.math = 100;

		b.tot = b.kor+b.eng+b.math;
		b.avg = b.tot/3;

		System.out.println("�̸�"+b.name);
		System.out.println("����"+b.kor);
		System.out.println("����"+b.eng);
		System.out.println("����"+b.math);
		System.out.println("����"+b.tot);
		System.out.println("��"+b.avg);
					

	}
}
