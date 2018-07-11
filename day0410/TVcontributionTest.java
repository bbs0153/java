class Donation
{
	private int money; //��ݾ��� �����Ǵ� ����

	public int getMoney()
	{
		return money;
	}

	//����� ���� �޼ҵ�
	public synchronized void gethering(String name, int n, int amount)
	{
		money += amount;

		System.out.println(name+"�� "+n+"��° ��ȭ===>���� ��� ��: " +money);
		try{
		Thread.sleep(100);
		}catch(Exception e){}
	}
}

// Person has a Donation
class Person extends Thread
{
	String name;
	private Donation d;
	
	public Person(String name ,Donation d)
	{
		this.name = name;
		this.d = d;
	}

	public void run()
	{
		for(int i=1 ; ;i++)
		{
			if(d.getMoney() >= 500000)
			{
				break;
			}
			
			System.out.println("������: "+name+" ��ȭȽ��: "+i);
			
			d.gethering(name,i,1000);
		}
	}

}

class  TVcontributionTest
{
	public static void main(String[] args) 
	{
		
		String []name = {"������","�ѻ�","������","����ȣ","�絿��"};
		Donation d = new Donation();
		Person p[] = new Person[5];

		for(int i =0; i<p.length; i++)
		{
			p[i] = new Person(name[i], d);
		}

		p[0].start();
		p[1].start();
		p[2].start();
		p[3].start();
		p[4].start();

		try{
		p[0].join();
		p[1].join();
		p[2].join();
		p[3].join();
		p[4].join();
		}catch(Exception e){}


		System.out.println("�� ��ݾ�: "+d.getMoney());
	}
}
