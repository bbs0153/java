class Box
{
	private int width; //가로
	private int col; //세로
	private int height; //높이
	private int volume; //부피

	//현재 box의 속성 값들을 문자열로 반환
	// 가로 : 5 세로 : 6 높이 : 3 부피 : 

	public String toString()
	{
		String str;
		str = "가로:"+width+",세로:"+col+",높이:"+height+",부피:"+volume;
		return str;
	}
	
	
	public int getWidth()
	{
		return width;
	}
	public int getCol()
	{
		return col;
	}
	public int getHeight()
	{
		return height;
	}
	public int getVolume()
	{
		volume = width*col*height;
		return volume;
	}
	
	
	public void setWidth(int a)
	{
		width = a;
	}
	public void setCol(int b)
	{
		col = b;
	}
	public void setHeight(int c)
	{
		height = c;
	}

	
	
}


class  BoxTest1
{
	public static void main(String[] args) 
	{
		Box box1;
		box1 = new Box();

		box1.setWidth(100);
		box1.setCol(100);
		box1.setHeight(100);

		System.out.println(box1.getVolume());
		System.out.println(box1);
		//출력문에 객체 참조변수가 오면
		//그 클래스의 toString() 메소드가 자동으로 호출된다.


		System.out.println(box1.toString());

		Box box2;
		box2 = new Box();
		
		box2.setWidth(200);
		box2.setCol(200);
		box2.setHeight(200);

		box1 = box2;

		System.out.println(box1);

	}
}
