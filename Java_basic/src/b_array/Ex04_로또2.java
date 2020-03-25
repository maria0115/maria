package b_array;

public class Ex04_로또2 {

	public static void main(String[] args) {
		// 변수명은 lotto

		int [][]lotto=new int[5][6];	//[줄][칸]
		int h=0;
		for(int i=0;i<5;i++)
		{
			
			for(int j=0; j<6; j++)	//
			{
				h=j;
				lotto[i][j]= (int)(Math.random()*45)+1;
				lotto[i][h]=lotto[i][j];
				//Math.random();	//0<=x<1
				
				for(h=0; h<j; h++) 
				{					
					if(lotto[i][j]==lotto[i][h])					
					{					
						System.out.println("중복");
						j--;
					}
				}
				
			}
			
		}
		//동일숫자 배제
		
		//버블정렬
		int temp=0;
		
			for(int k=0;k<lotto.length;k++)								
			{
				for(int i=lotto[k].length-1;i>0;i--)//length=6		//5 4 3 2 1
				{

					for(int j=0;j<i;j++)
					{
						if(lotto[k][j] >lotto[k][j+1]) 
						{
							//swapping
							temp =lotto[k][j];	//score[j+1]에 넣기위해

							lotto[k][j] = lotto[k][j+1]; 

							lotto[k][j+1]=temp; //더 작은값을 앞배열에 옮겨놓기


						}

					}
				}
				
			}
		
		
		//출력
		for(int i=0; i<5;i++)
		{
		for(int j=0; j<6;j++)
		{
			System.out.print(lotto[i][j]+"/");
		}
		System.out.println();
		}

	}

}
