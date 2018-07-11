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
		System.out.println(name+"이 "+n+"번째 누적 후.......");
		System.out.println("누적 모금 액: " +money);
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
			
			//System.out.println("성금자: "+name+" 누적전: "+i);
			
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
		
		String []name = {"이현진","한상엽","조성재","김종호","양동훈"};
		Donation d = new Donation();
		
		Person p1 = new Person("이현진",d);
		Person p2 = new Person("한상협",d);
		Person p3 = new Person("조성재",d);
		Person p4 = new Person("김종호",d);
		Person p5 = new Person("양동훈",d);

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

		System.out.println("총 모금액: "+d.getMoney());
	}
}
