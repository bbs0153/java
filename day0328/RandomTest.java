import java.util.*;
class RandomTest
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		String []name = {"������","������","�ڰ���","������","���¿�","������","������","���ؿ�","�躸��","�ּ���","�̼���","���ϳ�",
						"�۸���","����ȣ","�絿��","����ȣ","�ѻ���","������","������","���ǿ�","���α�","�迵ȣ","������","������","��ȣ��","�ӿ���"};

			int n;

			n = r.nextInt() >>>1;
			
			n = n%26+1;

			System.out.println(name[n]);

	}
}
