class MethodTest8 
{
	public static void printDay(int a)
	{
		
		if(a==1 || a==3 || a==5 || a==7 || a==8 || a==10 || a==12)
		{
			System.out.println(a+"���� ������ ��¥�� : 31�� �Դϴ�.");
		}
			else if(a==4 || a==6 || a==9 || a==11)
			{
				System.out.println(a+"���� ������ ��¥�� : 30�� �Դϴ�.");
			}
				else
				{
					System.out.println(a+"���� ������ ��¥�� : 28�� �Դϴ�.");
				}
	}
	
	public static void factorial(int b)
	{
		int r = 1;
		for (int i=b; i>=1; i--)
		{
			r = r*i;
			System.out.print(i);
				
				if(i!=1)
				{
					System.out.print("*");
				}
		}
		
		System.out.println("="+r);
	}
	
	public static void digiToKor(int c)
	{
		String []name = {"��","��","��","��","��","��","��","ĥ","��","��"};
		
		System.out.println(name[c]);
	}
	
	public static void power(int d, int e)
	{
		int f = 1;
		for (int i=1; i<=e; i++)
		{
		   f = f * d ;
		}
		System.out.println(d+"��"+e+"�������� : "+f);
	}
	
	public static void main(String[] args) 
	{
		printDay(3); //���޵� ���� ������ ��¥�� ���
		
		
		factorial(5); //���޵� ���� ���丮���� ����Ͽ� ���
					  //5*4*3*2*1

		digiToKor(7); //���޵� ���� �ѱ۷� ���

		power(2,3); //���� ���� �ڿ� �� ��ŭ ������ �Ͽ� ���
	
	}
}
