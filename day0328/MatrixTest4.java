/*
	5���� �̸� ���� ���� ���� �Է� �޾� ������ ����� ���
	(�� ������ 2���� �迭�� �̿��Ѵ�.)
	������ �迭�� �̿�

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
				System.out.println("�̸��� �Է��ϼ���");
				name[i] = sc.next();
				System.out.println("���� ������ �Է��ϼ���");
				score[i][j] = sc.nextInt();
				System.out.println("���� ������ �Է��ϼ���");
				score[i][j] = sc.nextInt();
				System.out.println("���� ������ �Է��ϼ���");
				score[i][j] = sc.nextInt();

				
				score[i][3] = score[i][0] + score[i][1] + score[i][2];
				score[i][4] = score[i][3]/3
			}

			System.out.println("**����Ȯ��**");
			System.out.println("�̸�\t����\t����\t����\t����\t���");
			System.out.print(score[i][j]"\t");

		}
	}
}
