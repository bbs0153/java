class CountDown extends Thread
{
	public void run()
	{

		for(int i = 20; i>=1; i--)
		{
			System.out.println(i+"�� ���Դϴ�.");
			try{
			Thread.sleep(1000);
			}catch(Exception e){}
		}
		System.out.println("�߻�!!!!");
	}

}

class CountDownTest
{
	public static void main(String[] args) 
	{
		CountDown c = new CountDown();

		c.start();
	}
}
