package b_array;

public class Ex04_로또 {

	public static void main(String[] args) {
		// 변수명은 lotto

		int lotto[]=new int[6];
		for(int j=0; j<6; j++)
		{
			//Math.random();	//0<=x<1

			lotto[j]= (int)(Math.random()*45)+1;		//double형이니까 int로 캐스팅해서 소수점 자르기
		}
		
		//동일숫자 배제

		//버블정렬
		int temp=0;
		for(int i=5;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(lotto[j] >lotto[j+1]) 
				{
					//swapping
					temp =lotto[j];	

					lotto[j] = lotto[j+1]; 

					lotto[j+1]=temp;


				}

			}
		}
		
		//출력
		for(int j=0; j<6;j++)
		{
			System.out.print(lotto[j]+"/");
		}

	}

}
