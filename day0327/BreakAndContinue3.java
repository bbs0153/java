class BreakAndContinue3
{
	public static void main(String[] args) 
	{
		int i;
		for(i=1;i<=10;i++)
		{
			if(i%3==0)
			{
				continue;  //1~10������ 3�� ����� ���� �ϰ� �ݺ��� ����
			}
			System.out.println(i);
		}
		
		System.out.println("��Ʈķ��"+i);
	}
}
