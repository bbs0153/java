import java.util.*;
class IfTest5
{
	public static void main(String[] args) 
	{
		int a;
		String r = "";
		String f = "";
		Scanner sc = new Scanner(System.in);


		System.out.println("0~99������ ���� �Է��ϼ���");
		a = sc.nextInt();
		
		int i = a/10; //�����ڸ�
		int s = a%10; //���� �ڸ�
		
	 
			if(a==0)
			{
				r = "��";
			}
				else if(i==1)
				{
					f = "��";
				}
				else if(i==2)
				{
					f = "�̽�";
				}
				else if(i==3)
				{
					f = "���";
				}
				else if(i==4)
				{
					f = "���";
				}
				else if(i==5)
				{
					f = "����";
				}
				else if(i==6)
				{
					f = "����";
				}
				else if(i==7)
				{
					f = "ĥ��";
				}
				else if(i==8)
				{
					f = "�Ƚ�";
				}
				else if(i==9)
				{
					f = "����";
					
				}
			
		System.out.print(f);
				
					if(s==1)
					{
						r = "��";
					}
					else if(s==2)
					{
						r = "��";
					}
					else if(s==3)
					{
						r = "��";
					}
					else if(s==4)
					{
						r = "��";
					}
					else if(s==5)
					{
						r = "��";
					}
					else if(s==6)
					{
						r = "��";
					}
					else if(s==7)
					{
						r = "ĥ";
					}
					else if(s==8)
					{
						r = "��";
					}
					else if(s==9)
					{
						r = "��";
					}
				System.out.println(r);
						
					
 

	  
	}
}
