/*
	자신의 팀구성원들의 이름과 나이를 각각 배열에 저장하고 출력
*/
class ArrayTest5 
{
	public static void main(String[] args) 
	{
		String []name = {"변성인","차건우","성민규","임연주","김영호","배현준","정호준","짱구"};
			int []age = {26,26,25,26,27,29,29,5};

		//가장 나이가 어린 사람의 이름 출력
		int min = age[0];
		int n = 0;	
			for(int i = 1; i<age.length; i++)
			{	
				if(age[i]<min)
				{
					min = age[i];
					n=i;
				}
			}

			System.out.println("나이가 가장 어린 사람은?"+name[n]);
			
				
	}
}
