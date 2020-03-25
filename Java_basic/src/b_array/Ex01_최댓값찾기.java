package b_array;

public class Ex01_최댓값찾기 {

	public static void main(String[] args) {


		int score[]= {88,9,60,50,40};	//int score[]= new int[] {};
		int max=0;
		//가장 큰 값 찾기
		//배열이 끝나는 것 score.length
	
		for(int i=0;i<score.length;i++)
		{
			if(score[i]>max)
			{
				max=score[i];
			}
		}
		System.out.println(max);
		

	}

}
