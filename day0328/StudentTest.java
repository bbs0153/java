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
		String []str = {"����","����","����"};
		Scanner sc = new Scanner(System.in);
		String []name = new String[5];
		int [][]score = new int[5][5];

			
		for(int i=0; i<5; i++) //�л��� �� ��ŭ �ݺ� ����
		{
			System.out.println((i+1)+"��° �̸��� �Է��ϼ���");
			name[i] = sc.next();
			
			for(int j=0; j<3; j++) //������ �� ��ŭ �ݺ� ����
			{
				
				System.out.println(str[j]+"���� �Է�");
				score[i][j] = sc.nextInt();
				
				score[i][3] = score[i][3] + score[i][j];
			
			}
					
			score[i][4] = score[i][3]/3;
		}
	
		System.out.println("***���� ó�� ���***");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		
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
