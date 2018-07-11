/*
	정수형 1차원 배열을 매개변수로 전달받아
	배열의 모든 요소를 1씩 증가하는 매소드를 정의 합니다.

	위에 매소드를 호출해 보고
	값에 의한 호출인지, 참조에 의한 호출인지 확인해 보도록 합니다.

	참조에 의한 호출이다.
	배열을 매개변수로 던져 주면 참조에 의한 호출이다.
*/
class	CvCr
{
	public static void increment(int arr[])
	{
		for (int i=0; i<arr.length ; i++)
		{
			arr[i]=arr[i]+1;
		}
	}
	
	public static void printArr(int []arr)
	{
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		int []age = {27,37,28,40};

		printArr(age);
		increment(age);
		printArr(age);
	}

}
