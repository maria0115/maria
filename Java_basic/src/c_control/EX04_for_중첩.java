package c_control;

import java.util.Scanner;

public class EX04_for_중첩 {

	public static void main(String[] args) {
//		for(int i=0; i<6; i++)
//		{	
//			for(int h=0;h<i;h++)		//명확한이해
//			{
//				System.out.print(" ");
//			}			
//			for(int j=0; j<6-i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			
//			
//		}
		
		
		//---------연습
		//A부터 Z까지 출력
		
//		for(int i =0; i<26;i++)
//		{
//		
//		for(char ch='A'; ch<='Z'-i; ch++)
//		{System.out.print(ch);}
//		System.out.println();
//		}
		
		
		//1번 문제
//		Scanner put = new Scanner(System.in);
//		
//		System.out.println("n을 입력하시오");
//		int n=put.nextInt();
//		
//		for(int i=1; i<=n ; i++)
//		{
//			for(int h=0;h+n>i;h--)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1; j<=i;j++)
//			{
//				
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		//2번문제
//		Scanner put = new Scanner(System.in);
//		
//		System.out.println("n을 입력하시오");
//		int n=put.nextInt();
//		int num=1;
//		
//		for(int i=1; i<=n ; i++)
//		{
//			for(int h=1;h<=i-1;h++)
//			{
//				System.out.print(" "+" ");
//			}
//			for(int j=0; j<=n-i;j++)
//			{
//				
//				System.out.print(num+ " ");
//				num++;
//			}
//			System.out.println();
//		}
		
		//3번문제
//		Scanner put = new Scanner(System.in);
//		
//		System.out.println("n을 입력하시오");
//		int n=put.nextInt();
//		System.out.println("m을 입력하시오");
//		int m=put.nextInt();
//		int su=1;
//		for(int i=0; i<n; i++)
//		{
//			for(int j=0; j<m; j++)
//			{
//				
//				System.out.print(su+" ");
//				su++;
//			}
//			System.out.println();
//		}
		//문1
//		char ch = 'A';
//		for(char i =ch; i<='Z';i++)
//		{
//			for(char j=ch; j<=i;j++)
//			{
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		//문2
		/*char ch = 'A';
		
		for(char i=0; i<=26;i++)
		{
			for(char j=ch; j<='Z'-i;j++)
			{
				
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		//문3
		/*
		char ch = 'A';
		for(char i=0; i<=26;i++)
		{
			for(char j=(char) ('A'+i); j<'Z';j++)
			{
				
				System.out.print(j);
			}
			System.out.println();
		}*/
		//문4
//		char ch = 'Z';
//		for(char i=0; i<=26;i++)
//		{
//			for(char j=ch; j>='A'+26-i;j--)
//			{
//				
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		//문5
		char ch = 'A';
		for(int i=0; i<=26;i++)
		{
			for(int nu=0;nu<i;nu++)
			{
				System.out.print(" ");
			}
			for(char j=(char) (ch+i); j<='Z';j++)
			{
				
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
