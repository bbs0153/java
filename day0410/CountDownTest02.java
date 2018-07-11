class CountDown implements Runnable
{
	public void run()
	{

		for(int i = 20; i>=1; i--)
		{
			System.out.println(i+"초 전입니다.");
			try{
			Thread.sleep(1000);
			}catch(Exception e){}
		}
		System.out.println("발사!!!!");
	}

}

class CountDownEvent extends Thread
{
	int delay;
	String msg;

	public CountDownEvent(int delay, String msg)
	{
		this.delay = delay;
		this.msg = msg;
	}
	public void run()
	{
		try{
		Thread.sleep(delay);
		}catch(Exception e){}
		
		System.out.println(msg);
	}

}

class CountDownTest02
{
	public static void main(String[] args) 
	{
		CountDown c = new CountDown();
		CountDownEvent c2 = new CountDownEvent(2000,"연결장치분리");

		new Thread(c).start();
		c2.start();
	}
}
