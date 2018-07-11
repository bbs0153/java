/*
	배열의 값을 하나씩 꺼내올떄 반복문을 이용합니다.

	배열 : 자료형이 같은 기억장소의 모임.

	로또번호를 변수에 저장하고 출력 해 보자.
	1~45까지의 번호를 6개 선택 


*/
class  ForTest8
{
	public static void main(String[] args) 
	{
		int []lotto = new int[6];

		lotto[0] = 1;
		lotto[1] = 2;
		lotto[2] = 28;
		lotto[3] = 7;
		lotto[4] = 13;	
		lotto[5] = 45;

		System.out.println("이번주 로또 추첨 번호");
		for(int i=0; i<6; i++)
		{
			System.out.print(lotto[i]+" ");
		}

	
	}
}
