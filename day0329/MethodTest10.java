class MethodTest10
{
	//�Ű����� n�� ���޹޾� n������ ���� �����Ͽ� return �Ѵ�.(��ȯ�Ѵ�)
	public static int getSum(int n)
	{
		int r = 0;
		for(int i = 1; i<=n; i++)
		{
			r = r + i;
		}
	
		return r;
	}

	
	public static void main(String[] args) 
	{
		int hap = getSum(2); //���� ���� �� ������ ���� ����
		
		System.out.println("���"+hap);
		System.out.println("����");
	}
}
