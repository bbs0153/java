import java.util.*;
class  Credit
{
	public static void main(String[] args) 
	{
		double []credit = new double[12];
		Scanner sc = new Scanner(System.in);
		
		double total = 0; //��
		double avg = 0;//�� ���
		
		double max; //���� ����
		double min; //���� ����
		
		int idx_max = 0; //���� �ε���
		int idx_min = 0; //���� �ε���
		
		
		for(int i=0; i<credit.length; i++)
		{
			System.out.println((i+1)+"�� ī�� ��� �ݾ�");
			credit[i] = sc.nextDouble();

			total = total + credit[i]; //��
			avg = total/12;  //�� ���
		}
		
		max = credit[0];
		min = credit[0];
		
		for (int i=1; i<credit.length ; i++)
		{
			if(credit[i]>max)
			{
				max=credit[i];
				idx_max=i;
			}

			if(credit[i]<min)
			{
				min=credit[i];
				idx_min=i;
			}
		}
		
		System.out.println("1�� ������ ��ü ��� �ݾ� : "+total);
		System.out.println("�� ��� ��� �ݾ� : "+avg);
		System.out.println("���� ������ ���Ҵ� �� : "+(idx_max+1)+"��");
		System.out.println("���� ������ ������ �� : "+(idx_min+1)+"��");
	
	
	}
}
