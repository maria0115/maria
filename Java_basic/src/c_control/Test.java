package c_control;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//1부터 3까지 출력

//		for(int i=1; i<=3;i++)
//		{
//			System.out.println(i);
//		}
//		
//		//3행2열 행렬을 가상하고 번호붙이기
//		
//		for(int j=0; j<3;j++)
//		{
//			System.out.println();
//			for(int h=0; h<2;h++)
//			{
//				System.out.printf("< %d, %d>",j,h);	//6번 반복실행
//			}
//			
//			System.out.println(" 행");
//		}
		
		Scanner put = new Scanner(System.in);
		int n=0;
		System.out.println("수를입력하세요");
		n=put.nextInt();
		int sum=0;
		if(n>1&n<=12)
		{
		for(int i=1; i<=6;i++)
		{
			for(int j=1; j<=6;j++)
			{
				sum=i+j;
				
				if(sum==n)
				{
					System.out.println(i+" "+j);
				}
			}
		}
		}
		else
		{System.out.println("입력오류");}
	}

}
