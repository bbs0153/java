/*
	�迭�� ���� �ϳ��� �����Ë� �ݺ����� �̿��մϴ�.

	�迭 : �ڷ����� ���� �������� ����.

	�ζǹ�ȣ�� ������ �����ϰ� ��� �� ����.
	1~45������ ��ȣ�� 6�� ���� 


*/
class  ForTest8
{
	public static void main(String[] args) 
	{
		int []lotto = new int[6];

		lotto[0] = 1;
		lotto[1] = 2;
		lotto[2] = 28;
		lotto[3] = 7;
		lotto[4] = 13;	
		lotto[5] = 45;

		System.out.println("�̹��� �ζ� ��÷ ��ȣ");
		for(int i=0; i<6; i++)
		{
			System.out.print(lotto[i]+" ");
		}

	
	}
}
