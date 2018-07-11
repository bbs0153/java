import java.util.*;
class  Credit
{
	public static void main(String[] args) 
	{
		double []credit = new double[12];
		Scanner sc = new Scanner(System.in);
		
		double total = 0; //총
		double avg = 0;//월 평균
		
		double max; //많은 변수
		double min; //적은 변수
		
		int idx_max = 0; //많은 인덱스
		int idx_min = 0; //적은 인덱스
		
		
		for(int i=0; i<credit.length; i++)
		{
			System.out.println((i+1)+"월 카드 사용 금액");
			credit[i] = sc.nextDouble();

			total = total + credit[i]; //총
			avg = total/12;  //월 평균
		}
		
		max = credit[0];
		min = credit[0];
		
		for (int i=1; i<credit.length ; i++)
		{
			if(credit[i]>max)
			{
				max=credit[i];
				idx_max=i;
			}

			if(credit[i]<min)
			{
				min=credit[i];
				idx_min=i;
			}
		}
		
		System.out.println("1년 동안의 전체 사용 금액 : "+total);
		System.out.println("월 평균 사용 금액 : "+avg);
		System.out.println("가장 지출이 많았던 월 : "+(idx_max+1)+"월");
		System.out.println("가장 지출이 적었던 월 : "+(idx_min+1)+"월");
	
	
	}
}
