class  MethodTest2
{
	//�޼ҵ��� ����
	public static void sayHello()
	{
		for (int i = 1; i<=3; i++)
		{
			System.out.println("�ȳ�, ��ȣ!");
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		
		sayHello(); //�޼ҵ� ȣ��
		
		int year = 2018;
		System.out.println("���ش�"+year+"�� �Դϴ�.");
		
		sayHello();

		String addr = "����� ������ �ż���";
		System.out.println("�ּҴ�"+addr);

		sayHello();

	}
}
