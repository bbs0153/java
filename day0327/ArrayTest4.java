/*
	자신의 팀구성원들의 이름과 나이를 각각 배열에 저장하고 출력
*/
class ArrayTest4 
{
	public static void main(String[] args) 
	{
		String []name = {"변성인","차건우","성민규","임연주","김영호","배현준","정호준"};
			int []age = {26,26,25,26,27,29,29};

			for(int i=0; i<name.length; i++)
			{
				System.out.println(name[i]+":"+age[i]);
			}
	}
}
