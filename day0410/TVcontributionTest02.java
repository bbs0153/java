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
		System.out.println(name+"�� "+n+"��° ���� ��.......");
		System.out.println("���� ��� ��: " +money);
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
			if(d.getMoney() >= 20000)
			{
				break;
			}
			
			//System.out.println("������: "+name+" ������: "+i);
			
			d.gethering(name,i,1000);

			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}

}

class  TVcontributionTest02
{
	public static void main(String[] args) 
	{
		
		String []name = {"������","�ѻ�","������","����ȣ","�絿��"};
		Donation d = new Donation();
		
		Person p1 = new Person("������",d);
		Person p2 = new Person("�ѻ���",d);
		Person p3 = new Person("������",d);
		Person p4 = new Person("����ȣ",d);
		Person p5 = new Person("�絿��",d);

		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();

			try{
				p1.join();
				p2.join();
				p3.join();
				p4.join();
				p5.join();
			}catch(Exception e){}

		System.out.println("�� ��ݾ�: "+d.getMoney());
	}
}
