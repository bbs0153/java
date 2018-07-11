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
			System.out.println("�ȳ� "+name);
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
		Person p1 = new Person("����ȣ");
		Person p2 = new Person("������");
		Person p3 = new Person("�۸���");

		p3.setPriority(Thread.MAX_PRIORITY);
		p1.setPriority(Thread.MIN_PRIORITY);
		p2.setPriority(Thread.MIN_PRIORITY);
		
		p1.start();
		p2.start();
		p3.start();
	
	}
}
