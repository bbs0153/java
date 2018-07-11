/*
	이태호가 속해 있는 팀구성원들의 나이를 배열에 저장핟고 출력
*/
class  ArrayTest
{
	public static void main(String[] args) 
	{
		int []age = new int[7];

		age[0] = 27;
		age[1] = 28;
		age[2] = 27;
		age[3] = 26;
		age[4] = 25;
		age[5] = 20;
		age[6] = 28;

		
		for(int i=0; i<=6; i++)
		{
			System.out.println(age[i]);
		}
		
	}
}
