class StringTest 
{
	public static void main(String[] args) 
	{
		String str = "0921";

		int month, date;

		month = Integer.parseInt(str.substring(0,2));
		date = Integer.parseInt(str.substring(2,4));

		System.out.println(month);
		System.out.println(date);

	}
}
