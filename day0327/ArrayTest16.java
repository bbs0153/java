/*
	��������� 5���� �̸�,����,����,���� �Է��� �޾�
	�� �л��� ������ ����� ���Ͽ�
	������ ���� ������ ����ϴ� ���α׷�

	1��° �л��� �̸�? ����ȣ
	��������? 100
	��������? 80
	��������? 100
	....

	**���� ���**
	�̸�    ����   ����   ����   ����   ���
	����ȣ  100    100    100    300    100
	....
*/
import java.util.*;
class ArrayTest16 
{
	public static void main(String[] args) 
	{
		String []name = new String[5];
		int []a = new int[5]; //����
		int []b = new int[5]; //����
		int []c = new int[5]; //����
		int []tot = new int[5]; //����
		double []d = new double[5]; //���
	
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i<name.length; i++)
		{
			System.out.println((i+1)+"��° �л��� �̸� :");
			name[i] = sc.next();
			System.out.println("���� ���� : ");
			a[i] = sc.nextInt();
			System.out.println("���� ���� : ");
			b[i] = sc.nextInt();
			System.out.println("���� ���� : ");
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

		System.out.println("**���� Ȯ��**");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		
	
		for(int i = 0; i<name.length; i++)
		{
			System.out.println(name[i]+"\t"+a[i]+"\t"+b[i]+"\t"+c[i]+"\t"+tot[i]+"\t"+d[i]);
		}
			
	}
}
