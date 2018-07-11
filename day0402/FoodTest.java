class Food
{
	protected int cal;
	protected int price;
	protected double vol;

	public Food()
	{
	}
	public Food(int cal, int price, double vol)
	{
		this.cal = cal;
		this.price = price;
		this.vol = vol;
	}

	public double getVol()
	{
		return vol;
	}
	public int getPrice()
	{
		return price; 
	}
	public int getCal()
	{
		return cal;
	}
		
	public void setVol(double vol)
	{
		this.vol = vol;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public void setCal(int cal)
	{
		this.cal = cal;
	}


	public String toString()
	{
		return "Ä®·Î¸®: "+cal+", °¡°Ý: "+price+", Áß·®: "+vol;
	}
}

class Melon extends Food
{
	private String infom;

	public Melon()
	{
	}
	public Melon(int cal, int price, double vol, String infom)
	{
		super(cal,price,vol);
		this.infom = infom;
	}

	public String getInfom()
	{
		return infom;
	}	

	public void setInfom(String infom)
	{
		this.infom = infom;
	}

	public String toString()
	{
		return super.toString()+", ³ó¿øÁ¤º¸: "+infom;
	}
}

class  FoodTest
{
	public static void main(String[] args) 
	{
		Food f1 = new Food(68,1000,4.5);
		Melon m1 = new Melon(70,1500,5,"¸á·ÐÀç¹è");

		System.out.println(f1);
		System.out.println(m1);
	}
}
