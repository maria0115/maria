package e_method;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex06_복습3 {
	static int sum=0;
	static double avr=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr1[] = input();
		calScore(arr1);
		output();
	}
	//총점, 평균 출력
	static void output()
	{
		System.out.println("총점은"+sum+"평균은"+avr);
	}
	//입력받은 국영수 점수로 총점, 평균을 구하기
	static void calScore(int arr1[])
	{
		
		
		for(int i=0;i<arr1.length;i++)
		{
			sum+=arr1[i];
		}
		avr=(double)sum/arr1.length;
		
		
	}
	
	//국영수 점수를 입력받기
	static int[] input()
	{
		Scanner put= new Scanner(System.in);
		System.out.println("국어 영어 수학 입력하세요");
		//put.nextLine();
		String jumsu=put.nextLine();
		
		StringTokenizer st = new StringTokenizer(jumsu);
		
		//국영수
		int arr[]=new int[3];
		int  count = st.countTokens();
		for(int i=0; i<count;i++)
		{
			String temp = st.nextToken();
			arr[i]=Integer.parseInt(temp);
		}
		
		return arr;		//최근에 나온 랭귀지는 return kog, yung, su; 가능함
		
		
	}
	
	

}
