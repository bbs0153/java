class  MethodTest4
{
	//�޼ҵ��� ����
	public static void sayHello(String name, int n)
	{
		for (int i = 1; i<=n; i++)
		{
			System.out.println("�ȳ�,"+name+"!");
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		
		sayHello("��ȣ",10); //�޼ҵ� ȣ��
		
		int year = 2018;
		System.out.println("���ش�"+year+"�� �Դϴ�.");
		
		sayHello("����",2);

		String addr = "����� ������ �ż���";
		System.out.println("�ּҴ�"+addr);

		sayHello("����",5);

	}
}
