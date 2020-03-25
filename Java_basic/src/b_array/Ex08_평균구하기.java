package b_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex08_평균구하기 {

	public static void main(String[] args) {
		Scanner put = new Scanner(System.in);
		System.out.println("입력할 수를 입력하세요");
		double n= put.nextInt();	
		put.nextLine();

		System.out.println("첫수는 1부터 1000까지 그 다음은 0부터 100사이의 점수를 입력할 수만큼 입력");


		String jumsu= put.nextLine();
		StringTokenizer st = new StringTokenizer(jumsu);

		int nu[]=new int[(int)n];

		int stcount= st.countTokens();
		//입력
		for(int i=0; i<stcount;i++)
		{
			String temp = st.nextToken();
			int su = Integer.parseInt(temp);
			nu[i]=su;
			//System.out.print(su+" ");
		}
		//계산
		int sum=0;
		for(int i=0; i<stcount;i++)
		{
			sum+=nu[i];	
		}
		int avg=sum/stcount;
		double count=0;
		for(int i=0; i<stcount;i++)
		{
			if(avg>nu[i])
			{
				count++;
			}
		}
		double a=0;
		a=(double)(count/n)*100;

		System.out.printf("%.3f",a);
		//System.out.println(sum);




	}

}
