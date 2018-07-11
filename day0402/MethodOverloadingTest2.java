/*
	장수형 변수 두개를 매개변수로 전달 받아 그 중에 큰수를 찾아 반환하는 메소드를 정의

	반드시 객체가 있고 그 객체를 통해서 사용
	객체 없이도 사용
*/

class BitUtil
{

	public static double max(double a, double b) // double 형은 int도 반영한다.
	{
		double r = a;
		
		if(b>r)
		{
			r=b;
		}
		return r;
	}
	
	/*
		매개변수 이름이 아니라 매개변수의 개수와 자료형이 달라야 함.

	public static int max(int age1, int age2) 
	{

	}*/
}



class  MethodOverloadingTest2
{
	public static void main(String[] args) 
	{
			
		System.out.println(BitUtil.max(4,5));
		System.out.println(BitUtil.max(175.7,178.5));
		//System.out.println(BitUtil.max(50,60,70);

	}
}
