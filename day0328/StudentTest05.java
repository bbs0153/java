/*
	����ó�� ���α׷��� ���Ͽ�
	�Ѹ��� �л��� ������ �ٹ� ��Ʈ�� ����� ����
	==> Ŭ����(���ο� �ڷ���,����� ���� �ڷ���)
*/
import java.util.*;
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

class StudentTest05
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student []b = new Student[3];

		for(int i=0; i<b.length; i++)
		{
			b[i] = new Student();

			System.out.println("�̸��� �Է��ϼ���");
			b[i].name = sc.next();
			System.out.println("���� ������ �Է��ϼ���");
			b[i].kor = sc.nextInt();
			System.out.println("���� ������ �Է��ϼ���");
			b[i].eng = sc.nextInt();
			System.out.println("���� ������ �Է��ϼ���");
			b[i].math = sc.nextInt();

			b[i].tot = b[i].kor + b[i].eng + b[i].math;
			b[i].avg = b[i].tot/3;

		}
		//���������� �����ϱ�(��������)
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


		System.out.println("�̸�\t����\t����\t����\t����\t���");
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i].name+"\t"+b[i].kor+"\t"+b[i].eng+"\t"+b[i].math+"\t"+b[i].tot+"\t"+b[i].avg);
		}
	
	}
}
