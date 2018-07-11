/*
	이태호가 속해 있는 팀구성원들의 나이를 배열에 저장핟고 출력
*/
class  ArrayTest2
{
	public static void main(String[] args) 
	{
		int []age = {22,28,27,26,25,20,28};
		int sum = 0;
		for(int i=0; i<=6; i++)
		{
			sum = sum+age[i];
		}
	
		System.out.println(sum/7);
	}
}
