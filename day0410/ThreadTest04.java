class Person extends Thread
{
	String name;

	public Person(String name)
	{
		this.name = name;
	}

	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("안녕 "+name);
			try{
			Thread.sleep(100);
			}catch(Exception e){}
		}
	}
}



class  ThreadTest04
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("이태호");
		Person p2 = new Person("강서영");
		Person p3 = new Person("송명준");

		p3.setPriority(Thread.MAX_PRIORITY);
		p1.setPriority(Thread.MIN_PRIORITY);
		p2.setPriority(Thread.MIN_PRIORITY);
		
		p1.start();
		p2.start();
		p3.start();
	
	}
}
