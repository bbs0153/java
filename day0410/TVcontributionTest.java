class Donation
{
	private int money; //모금액이 누적되는 변수

	public int getMoney()
	{
		return money;
	}

	//모금을 위한 메소드
	public synchronized void gethering(String name, int n, int amount)
	{
		money += amount;

		System.out.println(name+"이 "+n+"번째 전화===>누적 모금 액: " +money);
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
			
			System.out.println("성금자: "+name+" 전화횟수: "+i);
			
			d.gethering(name,i,1000);
		}
	}

}

class  TVcontributionTest
{
	public static void main(String[] args) 
	{
		
		String []name = {"이현진","한상엽","조성재","김종호","양동훈"};
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


		System.out.println("총 모금액: "+d.getMoney());
	}
}
