class  MethodTest3
{
	//�޼ҵ��� ����
	public static void sayHello(String name)
	{
		for (int i = 1; i<=3; i++)
		{
			System.out.println("�ȳ�,"+name+"!");
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		
		sayHello("��ȣ"); //�޼ҵ� ȣ��
		
		int year = 2018;
		System.out.println("���ش�"+year+"�� �Դϴ�.");
		
		sayHello("����");

		String addr = "����� ������ �ż���";
		System.out.println("�ּҴ�"+addr);

		sayHello("����");

	}
}
