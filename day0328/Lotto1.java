import java.util.*;
class RandomTest
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		String []name = {"������","������","�ڰ���","������","���¿�","������","������","���ؿ�","�躸��","�ּ���","�̼���","���ϳ�",
						"�۸���","����ȣ","�絿��","����ȣ","�ѻ���","������","������","���ǿ�","���α�","�迵ȣ","������","������","��ȣ��","�ӿ���"};
		int n;
		
		for(int i = 0; i<name.length; i++)
		{
			n = r.nextInt();
		
			System.out.println(n);
		}

			

	
	
	
		
	}
}
