import java.util.*;
class Home6
{
	public static void main(String[] args) //1��
	{
		String r;
		int a,b,c;

		Scanner sc = new Scanner(System.in);

		System.out.println("+,-,*,/ �Է��ϼ���");
		r = sc.next();
			if(r==x)
			{
				System.out.println("������ �մϴ�");
				System.out.println("ù��° ���ڸ� �Է����ּ���");
				a = sc.nextInt();
				System.out.println("�ι�° ���ڸ� �Է����ּ���");
				b = sc.nextInt();

				c = a*b;		
			}
			else if(r==+)
			{
				System.out.println("������ �մϴ�");
				System.out.println("ù��° ���ڸ� �Է����ּ���");
				a = sc.nextInt();
				System.out.println("�ι�° ���ڸ� �Է����ּ���");
				b = sc.nextInt();

				c = a+b;		
			}
			else if(r==-)
			{
				System.out.println("�E���� �մϴ�");
				System.out.println("ù��° ���ڸ� �Է����ּ���");
				a = sc.nextInt();
				System.out.println("�ι�° ���ڸ� �Է����ּ���");
				b = sc.nextInt();

				c = a-b;		
			}
			else if(r==/)
			{
				System.out.println("�������� �մϴ�");
				System.out.println("ù��° ���ڸ� �Է����ּ���");
				a = sc.nextInt();
				System.out.println("�ι�° ���ڸ� �Է����ּ���");
				b = sc.nextInt();

				c = a/b;		
			}
	}

}

/*{

	public static void main(String[] args) //3��
	{
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ������ ������?");
		a = sc.nextInt();
		
		int b = a*100;
		int c = b/10;	
			
			if(a>=10)
			{
				System.out.println(b-c+"���Դϴ�.");
			}
				else
				{
					System.out.println(b+"���Դϴ�.");
				}

	}

}*/

/*{
	public static void main(String[] args) //5��
	{

		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("1���� 10������ ��ȣ�� �Է����ּ���");
		a = sc.nextInt();

			if(a==2)
			{
				System.out.println("1���Դϴ�.");
			}
				else if(a==5)
				{
					System.out.println("2���Դϴ�.");
				}

				else if(a==7)
				{
					System.out.println("3���Դϴ�.");
				}
				else
				{
					System.out.println("���Դϴ�.");
				}
	}


}*/


/*{	
	public static void main(String[] args) //6��
	{

		double a,b;
		Scanner sc = new Scanner(System.in);

		System.out.println("Ű�� �Է����ּ���");
		a = sc.nextDouble();
		System.out.println("�����Ը� �Է����ּ���");
		b = sc.nextDouble();

         	double c = (a-100)*0.9;
			
			if(b>c)
			{
				System.out.println("��ü���Դϴ�.");	
			}
			else if(b<c)
			{
				System.out.println("��ü���Դϴ�.");
			}
			else
			{
				System.out.println("ǥ��ü���Դϴ�.");
			}

	}



}*/