class MethodTest11
{
	public static String getSeason(int a)
	{
		//String []str = {"�ܿ�","�ܿ�","��","��","��","����","����","����","����","����","����","�ܿ�"};
		//return str[a-1];
		
		String str = "";

		if(a==2||a==1||a==12)
		{
			str = "�ܿ�";
		}
		else if(a==3||a==4||a==5)
		{
			str = "��";
		}
		else if(a==6||a==7||a==8)
		{
			str = "����";	
		}
		else
			str = "����";

		return str;

	
	}

	public static int getmax(int a, int b)
	{
		int r = a;
			if(a<b)
			{
				r = b;
			}
		
		return r;
	}
	
	
	
	public static void main(String[] args) 
	{
		
		//���� �Ű������� ���޹޾� �ش���� �������� ��ȯ�ϴ� �޼ҵ带 ����
		String str = getSeason(3);
		System.out.println(3+"����" +str);
	
		
		//�ΰ��� ������ �Ű������� ���޹޾� �� �߿� ū���� ã�� ��ȯ�ϴ� �޼ҵ带 ����
		int max = getmax(20,27);
		System.out.println("ū����"+max);
		
		
	}
}
