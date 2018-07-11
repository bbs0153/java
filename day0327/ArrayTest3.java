/*
	이태호가 속해 있는 팀구성원들의 나이를 배열에 저장핟고 출력
*/
class  ArrayTest3
{
	public static void main(String[] args) 
	{
		int []age = {22,28,27,26,25,20,28,27};
		int sum = 0;
		for(int i=0; i<age.length; i++)
		{
			sum = sum+age[i];
		}
	
		int avg = sum/age.length
		System.out.println(avg);
	}
}
