import java.util.*;
class RandomTest
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		String []name = {"이현진","박은지","박가영","최혜정","김태욱","박주희","오진우","현해웅","김보람","최성하","이서희","김하나",
						"송명준","김종호","양동훈","이태호","한상협","조성재","강서영","차건우","성민규","김영호","변성인","배현준","정호준","임연주"};

			int n;

			n = r.nextInt() >>>1;
			
			n = n%26+1;

			System.out.println(name[n]);

	}
}
