package b_array;

public class Ex03_정렬 {

	public static void main(String[] args) {
		int []score = new int[] {98,50,46,77,70};
		int temp=0;
		int temp1=0;
		
		//버블정렬
		//순차적으로 비교하여 제일 큰수를 가장 나중 배열에 배치
		//
		for(int i=score.length-1;i>0;i--)//4,3,2,1	4번 반복
		{
			for(int j=0;j<i;j++)
			{
				if(score[j] >score[j+1]) 
				{
					//swapping
					temp =score[j];	//score[j+1]에 넣기위해
					
					score[j] = score[j+1]; 
					
					score[j+1]=temp; //더 작은값을 앞배열에 옮겨놓기
					
					
				}
				
			}
		}
		/*
		 * 버블정렬 흐름
		 * {98,50,46,77,70}
		 
		  i= 1  2  3  4
			
			i
			4 j=0~4
				0 > 1비교 (50,98,46,77,70) 큰값에 score[j+1]에 입력 더 작은값을 앞배열에 옮겨 놓기 
				1 > 2비교 (50,46,98,77,70)
				2 > 3비교 (50,46,77,98,70)
				3 > 4비교 (50,46,77,70,98)
							//4번째는 이미 가장 큰값이 마지막 배열에 
							  가 있기 때문에 비교 필요 ㄴㄴ
			3 j=0~3
				0 > 1비교 (46,50,77,70,98)
				1 > 2비교 (46,50,77,70,98)
				2 > 3비교 (46,50,70,77,98)
			2 j=0~2
				0 > 1비교 (46,50,70,77,98)
				1 > 2비교 (46,50,70,77,98)
			1 j=0~1
				0 > 1비교 (46,50,70,77,98)
			
			
			46/50/70/77/98/*/
		System.out.println();
		for(int a=0; a <score.length; a++)
		{
			System.out.print(score[a]+"/");				
		}

	}

}
